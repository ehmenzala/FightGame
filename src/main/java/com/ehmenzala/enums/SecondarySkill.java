package com.ehmenzala.enums;

public enum SecondarySkill {
    
    DUALITY, VEHICLE, KNIFE;
    
    private SecondarySkill weakness;
    
    static {
        DUALITY.weakness = KNIFE;
        VEHICLE.weakness = DUALITY;
        KNIFE.weakness = VEHICLE;
    }
    
    public SecondarySkill getWeakness() {
        return this.weakness;
    }
    
}
