package com.ehmenzala.enums;

public enum MainSkill {
    
    WATER, FIRE, SNOW;
    
    private MainSkill weakness;
    
    static {
        WATER.weakness = SNOW;
        FIRE.weakness = WATER;
        SNOW.weakness = FIRE;
    }
    
    public MainSkill getWeakness() {
        return this.weakness;
    }
    
}
