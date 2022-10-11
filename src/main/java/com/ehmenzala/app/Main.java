package com.ehmenzala.app;

import com.ehmenzala.classes.Fighter;
import com.ehmenzala.classes.GCQuestion;
import com.ehmenzala.classes.MathQuestion;
import com.ehmenzala.classes.ProgrammingQuestion;
import com.ehmenzala.classes.Question;
import com.ehmenzala.classes.QuestionPool;
import com.ehmenzala.enums.MainSkill;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        initQuestionPool();
        
        /* Imprime en consola 3 preguntas random del Pool de Preguntas */
        for (int i = 0; i < 3; i++) {
            Question randomQuestion = QuestionPool.getRandomQuestion();
            System.out.println(randomQuestion.getCategory());
            System.out.println(randomQuestion.getQuestion());
            System.out.println(Arrays.toString(randomQuestion.getOptions()));
            System.out.println(randomQuestion.getAnswer());
            System.out.println();
        }
        
        Fighter f1 = new Fighter();
        f1.setMainSkill(MainSkill.WATER);
        
        Fighter f2 = new Fighter();
        f2.setMainSkill(MainSkill.FIRE);
        
        FightGame.findMainSkillWinner(f1, f2);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FightGame.TriviaGame().setVisible(false);
                new FightGame.FighterData().setVisible(true);
            }
        });
    }
    
    public static void initQuestionPool() {
        
        // Options
        String[] options1 = {"3", "2", "-2"};
        String[] options2 = {"6", "4", "8"};
        String[] options3 = {"12", "4", "2"};
        String[] options4 = {"China", "Argelia", "Rusia"};
        String[] options5 = {"El Principito", "La Biblia", "La Divida Comedia"};
        String[] options6 = {"206", "207", "196"};
        String[] options7 = {"extends", "inherit", "as"};
        String[] options8 = {"Arquitectura de Software", "Patrón de Diseño", "Flexibilidad"};
        String[] options9 = {"Legible", "Duplicado", "Limpio"};
        String[] options10 = {"Encapsulamiento", "Delegación", "Polimorfismo"};
        
        // Questions
        MathQuestion mq1 = new MathQuestion("¿Cuál es el valor de x? x + 5 = 3", options1, 2);
        MathQuestion mq2 = new MathQuestion("¿Cuál es el resultado? 8-4×(2÷2)", options2, 1);
        MathQuestion mq3 = new MathQuestion("¿Cuál es el resultado? (4×3)÷3-2", options3, 2);
        
        GCQuestion gcq4 = new GCQuestion("¿Cuál es el país más grande del mundo?", options4, 2);
        GCQuestion gcq5 = new GCQuestion("¿Cuál es el libro más vendido de la historia?", options5, 1);
        GCQuestion gcq6 = new GCQuestion("¿Cuántos huesos tienen el cuerpo humano?", options6, 0);
        
        ProgrammingQuestion pq7 = new ProgrammingQuestion("¿Cuál es la keyword para heredar una clase en Java?", options7, 0);
        ProgrammingQuestion pq8 = new ProgrammingQuestion("Te ayuda resolviendo problemas que otros ya han resuelto", options8, 1);
        ProgrammingQuestion pq9 = new ProgrammingQuestion("Es el tipo de código que no quieres escribir. Así es, hablamos de código _____.", options9, 1);
        ProgrammingQuestion pq10 = new ProgrammingQuestion("Empleamos este concepto cuando queremos mantener partes de nuestro código que no cambian separadas en partes que cambian: ¡Así, es más fácil hacer cambios en el código sin romperlo todo!", options10, 0);
        
        // Adding questions
        QuestionPool.addQuestion(mq1);
        QuestionPool.addQuestion(mq2);
        QuestionPool.addQuestion(mq3);
        QuestionPool.addQuestion(gcq4);
        QuestionPool.addQuestion(gcq5);
        QuestionPool.addQuestion(gcq6);
        QuestionPool.addQuestion(pq7);
        QuestionPool.addQuestion(pq8);
        QuestionPool.addQuestion(pq9);
        QuestionPool.addQuestion(pq10);
    }
}
