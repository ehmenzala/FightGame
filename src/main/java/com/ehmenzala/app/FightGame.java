package com.ehmenzala.app;

import com.ehmenzala.enums.GameMode;
import com.ehmenzala.classes.Fighter;
import com.ehmenzala.enums.MainSkill;

public class FightGame {

    Fighter playerOne = new Fighter();
    Fighter playerTwo = new Fighter();
    GameMode mode;
    
    public static void findMainSkillWinner(Fighter f1, Fighter f2) {
        String resultado;
        // Fighter mainWinner;
        // Fighter secondaryWinner;
        
        MainSkill fighterOneMainSkill = f1.getMainSkill();
        MainSkill fighterTwoMainSkill = f2.getMainSkill();
        
        /* Verificar habilidades principales */
        
        if (fighterOneMainSkill == fighterTwoMainSkill) {
            resultado = "Empate";
        } else if (fighterOneMainSkill == fighterTwoMainSkill.getWeakness()) {
            resultado = "Gana f1";
        } else {
            resultado = "Gana f2";
        }
        
        System.out.println(resultado);
    }
}
