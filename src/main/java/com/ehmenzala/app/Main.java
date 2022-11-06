package com.ehmenzala.app;

public class Main {

    public static void main(String[] args) {
        initQuestionPool();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new FightGame.MainMenu().setVisible(true);
                //new FightGame.TriviaGame().setVisible(true);
                //new FightGame.FighterData().setVisible(true);
                new FightGame.DeathMatch().setVisible(true);
            }
        });
    }

    public static void initQuestionPool() {

        // Options
        
    }
}
