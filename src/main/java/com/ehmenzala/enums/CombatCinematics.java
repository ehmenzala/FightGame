package com.ehmenzala.enums;

public enum CombatCinematics {
    WATER_FIRE ("./assets/cinematics/water-vs-fire.gif", 61000),
    FIRE_SNOW ("./assets/cinematics/black-background.gif", 4000),
    SNOW_WATER ("./assets/cinematics/black-background.gif", 4000),
    DUALITY_VEHICLE ("./assets/cinematics/twin-vs-vehicle.gif", 18200),
    VEHICLE_KNIFE ("./assets/cinematics/vehicle-vs-knife.gif", 12500),
    KNIFE_DUALITY ("./assets/cinematics/black-background.gif", 4000);
    
    private String GIFPath;
    private int duration;
    
    
    private CombatCinematics(String GIFPath, int duration) {
        this.GIFPath = GIFPath;
    }
    
    public String getGIFPath() {
        return this.GIFPath;
    }

    public int getDuration() {
        return duration;
    }
    
}
