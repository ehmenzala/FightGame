package com.ehmenzala.classes;


public abstract class Question {
    
    private String question;
    private String[] options;
    private int asnwer;

    public Question(String question, String[] options, int answer) {
        this.question = question;
        this.options = options;
        this.asnwer = answer;
    }
    
    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    public int getAsnwer() {
        return asnwer;
    }
    
    public abstract String getCategory();
}
