package com.ehmenzala.enums;

import java.io.File;

public enum Dice {
    
    ONE     (new File("./images/dice-1.png")),
    TWO     (new File("./images/dice-2.png")),
    THREE   (new File("./images/dice-3.png")),
    FOUR    (new File("./images/dice-4.png")),
    FIVE    (new File("./images/dice-5.png")),
    SIX     (new File("./images/dice-6.png"));
    
    private File imageFile;

    private Dice(File imageFile) {
        this.imageFile = imageFile;
    }

    public File getFaceImage() {
        return imageFile;
    }
}
