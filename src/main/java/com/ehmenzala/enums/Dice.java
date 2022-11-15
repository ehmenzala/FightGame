package com.ehmenzala.enums;

import java.io.File;

public enum Dice {
    ONE     ("./images/dice-1.png"),
    TWO     ("./images/dice-2.png"),
    THREE   ("./images/dice-3.png"),
    FOUR    ("./images/dice-4.png"),
    FIVE    ("./images/dice-5.png"),
    SIX     ("./images/dice-6.png");
    
    private String imagePath;

    private Dice(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getImagePath() {
        return imagePath;
    }
    
    // Get random face
}
