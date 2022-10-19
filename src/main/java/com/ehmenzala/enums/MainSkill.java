package com.ehmenzala.enums;

import java.io.File;

public enum MainSkill {
    
    WATER (new File("./images/badge-water.jpg")),
    FIRE (new File("./images/badge-fire.jpg")),
    SNOW (new File("./images/badge-snow.jpg"));
    
    private MainSkill weakness;
    private File badge;
    
    private MainSkill(File badge) {
        this.badge = badge;
    }
    
    static {
        WATER.weakness = SNOW;
        FIRE.weakness = WATER;
        SNOW.weakness = FIRE;
    }
    
    public MainSkill getWeakness() {
        return this.weakness;
    }
    
    public File getBadge() {
        return this.badge;
    }
    
}
