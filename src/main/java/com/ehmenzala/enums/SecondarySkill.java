package com.ehmenzala.enums;

public enum SecondarySkill {
    
    TWIN, VEHICLE, KNIFE;
    
    private SecondarySkill weakness;
    
    static {
        TWIN.weakness = KNIFE;
        VEHICLE.weakness = TWIN;
        KNIFE.weakness = VEHICLE;
    }
    
    public SecondarySkill getWeakness() {
        return this.weakness;
    }
    
}
