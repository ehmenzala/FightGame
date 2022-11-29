package com.ehmenzala.enums;

public enum MainSkill {
    
    WATER ("./assets/images/badge-water.jpg"),
    FIRE ("./assets/images/badge-fire.jpg"),
    SNOW ("./assets/images/badge-snow.jpg");
    
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
