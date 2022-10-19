package com.ehmenzala.classes;

import com.ehmenzala.enums.MainSkill;
import com.ehmenzala.enums.SecondarySkill;
import java.io.File;

public class Fighter {
    
    private String nickname;
    private MainSkill mainSkill;
    private SecondarySkill secondarySkill;
    private File badge;
    private int correctQuestions;
    private int HP = 20;

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
        this.badge = mainSkill.getBadge();
    }

    public SecondarySkill getSecondarySkill() {
        return secondarySkill;
    }

    public void setSecondarySkill(SecondarySkill secondarySkill) {
        this.secondarySkill = secondarySkill;
    }
    
    public File getBadge() {
        return badge;
    }
    
    public int getCorrectQuestions() {
        return correctQuestions;
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
