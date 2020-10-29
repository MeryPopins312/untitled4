package com.company;

public abstract class Hero implements HavingSuperAbility {
    int heroHealth;
    int heroDamade;
    String heroSuper;


    public int getHeroHealth() {
        return heroHealth;
    }

    public void setHeroHealth(int heroHealth) {
        this.heroHealth = heroHealth;
    }

    public int getHeroDamade() {
        return heroDamade;
    }

    public void setHeroDamade(int heroDamade) {
        this.heroDamade = heroDamade;
    }

    public String getHeroSuper() {
        return heroSuper;
    }

    public void setHeroSuper(String heroSuper) {
        this.heroSuper = heroSuper;
    }
}

