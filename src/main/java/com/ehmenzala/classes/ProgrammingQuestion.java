package com.ehmenzala.classes;

public class ProgrammingQuestion extends Question {
    
    private final String CATEGORY = "Programación";
    
    public ProgrammingQuestion(String question, String[] options, int answer) {
        super(question, options, answer);
    }

    @Override
    public String getCategory() {
        return this.CATEGORY;
    }
}
