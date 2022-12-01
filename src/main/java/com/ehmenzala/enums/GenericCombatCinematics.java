package com.ehmenzala.enums;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public enum GenericCombatCinematics {
    GENERIC_CINEMATIC_1 ("./assets/cinematics/generic-winner-cinematic-1.gif", 12000),
    GENERIC_CINEMATIC_2 ("./assets/cinematics/generic-winner-cinematic-2.gif", 18000),
    GENERIC_CINEMATIC_3 ("./assets/cinematics/generic-winner-cinematic-3.gif", 9500),
    GENERIC_CINEMATIC_4 ("./assets/cinematics/generic-winner-cinematic-4.gif", 7000),
    GENERIC_CINEMATIC_5 ("./assets/cinematics/generic-winner-cinematic-5.gif", 3000);
    
    private String GIFPath;
    private int duration;
    
    private static final List<GenericCombatCinematics> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();
    
    private GenericCombatCinematics(String GIFPath, int duration) {
        this.GIFPath = GIFPath;
        this.duration = duration;
    }
    
    public String getGIFPath() {
        return this.GIFPath;
    }

    public int getDuration() {
        return duration;
    }
    
    public static GenericCombatCinematics randomGenericCinematic() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
