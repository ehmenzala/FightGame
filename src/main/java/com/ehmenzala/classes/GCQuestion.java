package com.ehmenzala.classes;

public class GCQuestion extends Question {
    
    private final String CATEGORY = "Cultura General";
    
    public GCQuestion(String question, String[] options, int answer) {
        super(question, options, answer);
    }

    @Override
    public String getCategory() {
        return this.CATEGORY;
    }
}
