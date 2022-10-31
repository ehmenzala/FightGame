package com.ehmenzala.app;

import com.ehmenzala.classes.Question;
import com.ehmenzala.classes.QuestionPool;

public class Main {

    public static void main(String[] args) {
        initQuestionPool();
        
//        for (int i = 0; i < 10; i++) {
//            try {
//                Question randomQuestion = QuestionPool.getRandomQuestion();
//                System.out.println("Question #" + i);
//                System.out.println(randomQuestion.getQuestion());
//            } catch (IndexOutOfBoundsException e) {
//                System.err.println("Se acabaron las preguntas XD");
//            }
//        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new FightGame.MainMenu().setVisible(true);
                new FightGame.TriviaGame().setVisible(true);
                //new FightGame.FighterData().setVisible(true);
            }
        });
    }

    public static void initQuestionPool() {

        // Options
        
    }
}
