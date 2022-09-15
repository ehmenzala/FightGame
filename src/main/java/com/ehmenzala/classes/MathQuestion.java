package com.ehmenzala.classes;

public class MathQuestion extends Question {
    
    private final String CATEGORY = "Matemáticas";
    
    public MathQuestion(String question, String[] options, int answer) {
        super(question, options, answer);
    }

    @Override
    public String getCategory() {
        return this.CATEGORY;
    }
}
