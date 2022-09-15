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


//    private String[] questions = {
//        "¿?",
//        "¿?",
//        "¿?",
//    };
//    
//    private String[][] options = {
//        {"resp1", "resp2", "resp3"},
//        {"resp1", "resp2", "resp3"},
//        {"resp1", "resp2", "resp3"},
//    };
//    
//    
//    private char[] answers = {
//        'A',
//        'A',
//        'B',  
//    };