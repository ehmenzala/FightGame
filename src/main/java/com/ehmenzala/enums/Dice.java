package com.ehmenzala.enums;

public enum Dice {
    ONE     ("./assets/images/dice-1.png"),
    TWO     ("./assets/images/dice-2.png"),
    THREE   ("./assets/images/dice-3.png"),
    FOUR    ("./assets/images/dice-4.png"),
    FIVE    ("./assets/images/dice-5.png"),
    SIX     ("./assets/images/dice-6.png");
    
    private String imagePath;

    private Dice(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getImagePath() {
        return imagePath;
    }
}
