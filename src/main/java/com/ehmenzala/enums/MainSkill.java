package com.ehmenzala.enums;

public enum MainSkill {
    
    WATER ("./assets/images/badge-water.png"),
    FIRE ("./assets/images/badge-fire.png"),
    SNOW ("./assets/images/badge-snow.png");
    
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
