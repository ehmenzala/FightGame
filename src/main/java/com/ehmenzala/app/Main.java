package com.ehmenzala.app;

public class Main {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 new FightGame.MainMenu().setVisible(true);
            }
        });
    }
}
