package com.ehmenzala.enums;

public enum GenericCombatCinematics {
    GENERIC_CINEMATIC_1 ("./assets/cinematics/generic-winner-cinematic-1.gif", 12000),
    GENERIC_CINEMATIC_2 ("./assets/cinematics/generic-winner-cinematic-2.gif", 18000),
    GENERIC_CINEMATIC_3 ("./assets/cinematics/generic-winner-cinematic-3.gif", 9500),
    GENERIC_CINEMATIC_4 ("./assets/cinematics/generic-winner-cinematic-4.gif", 7000),
    GENERIC_CINEMATIC_5 ("./assets/cinematics/generic-winner-cinematic-5.gif", 3000);
    
    private String GIFPath;
    private int duration;
    
    
    private GenericCombatCinematics(String GIFPath, int duration) {
        this.GIFPath = GIFPath;
    }
    
    public String getGIFPath() {
        return this.GIFPath;
    }

    public int getDuration() {
        return duration;
    }
}
