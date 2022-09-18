package com.ehmenzala.classes;

import java.util.ArrayList;

public class QuestionPool {
    
    private static ArrayList<Question> questions = new ArrayList();
    
    public static void addQuestion(Question question) {
        questions.add(question);
    }
    
    public static Question getRandomQuestion() {
        int poolSize = questions.size();
        int randomIndex = (int) (Math.random() * poolSize);
        Question randomQuestion = questions.get(randomIndex);
        return randomQuestion;
    }
}
