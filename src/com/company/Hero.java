package com.company;

public class Hero {
    private int healthPoints;
    private int defence;
    private int strength;
    private int weapon;
    private int shield;

    public Hero() {
    }

    public Hero(int healthPoints, int defence, int strength, int weapon, int shield) {
        this.healthPoints = healthPoints;
        this.defence = defence;
        this.strength = strength;
        this.weapon = weapon;
        this.shield = shield;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getWeapon() {
        return weapon;
    }

    public void setWeapon(int weapon) {
        this.weapon = weapon;
    }

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public void minHP(Dragon dragon) {
        boolean c = wthat(dragon);
        if (c) {
            int a = this.healthPoints - (dragon.getStrength() - defence);
            setHealthPoints(a);
            System.out.println("Hero HP: " + a);
        } else {
            System.out.println("Hero dait");
        }
    }
    public void shieldHP(Dragon dragon) {
        boolean c = wthat(dragon);
        if (c) {
            int a = this.healthPoints + shield - (dragon.getStrength() - defence);
            setHealthPoints(a);
            System.out.println("Hero HP: " + a);
        } else {
            System.out.println("Hero dait");
        }
    }

    public boolean wthat(Dragon dragon) {
        return healthPoints > 0;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "HealthPoints=" + healthPoints +
                ", defence=" + defence +
                ", strength=" + strength +
                ", weapon=" + weapon +
                ", shield=" + shield +
                '}';
    }
}
