package com.ehmenzala.classes;

import com.ehmenzala.enums.MainSkill;
import com.ehmenzala.enums.SecondarySkill;

public class Fighter {
    
    private String nickname;
    private MainSkill mainSkill;
    private SecondarySkill secondarySkill;
    private int correctQuestions;
    // private Badge badge;
    private int HP;

    public Fighter() {
        HP = 20;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public MainSkill getMainSkill() {
        return mainSkill;
    }

    public void setMainSkill(MainSkill mainSkill) {
        this.mainSkill = mainSkill;
    }

    public SecondarySkill getSecondarySkill() {
        return secondarySkill;
    }

    public int getCorrectQuestions() {
        return correctQuestions;
    }

    public void setSecondarySkill(SecondarySkill secondarySkill) {
        this.secondarySkill = secondarySkill;
    }

    public int getHP() {
        return HP;
    }
    
    public void lowHP(int toLow) {
        HP -= toLow;
    }
    
    public void addPoint() {
        correctQuestions++;
    }
}
