package com.ehmenzala.enums;

public enum DeathMatchCinematic {
    WIN_GUILE ("./assets/cinematics/win-guile.gif", 8000),
    WIN_RYU ("./assets/cinematics/win-ryu.gif", 16000);
    
    private String GIFPath;
    private int duration;
    
    
    private DeathMatchCinematic(String GIFPath, int duration) {
        this.GIFPath = GIFPath;
        this.duration = duration;
    }
    
    public String getGIFPath() {
        return this.GIFPath;
    }

    public int getDuration() {
        return duration;
    }
}
