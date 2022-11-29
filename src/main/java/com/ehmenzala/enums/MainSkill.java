package com.ehmenzala.enums;

import java.io.File;

public enum MainSkill {
    
    WATER ("./images/badge-water.jpg"),
    FIRE ("./images/badge-fire.jpg"),
    SNOW ("./images/badge-snow.jpg");
    
    private MainSkill weakness;
    private String badgePath;
    
    private MainSkill(String badgePath) {
        this.badgePath = badgePath;
    }
    
    static {
        WATER.weakness = SNOW;
        FIRE.weakness = WATER;
        SNOW.weakness = FIRE;
    }
    
    public MainSkill getWeakness() {
        return this.weakness;
    }
    
    public String getBadgePath() {
        return this.badgePath;
    }
    
}
