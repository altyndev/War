package com.company;

public class Dragon {
    private int healthPoints;
    private int defence;
    private int strength;
    private int weapon;

    public Dragon() {
    }

    public Dragon(int healthPoints, int defence, int strength, int weapon) {
        this.healthPoints = healthPoints;
        this.defence = defence;
        this.strength = strength;
        this.weapon = weapon;
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

    public void minHP(Hero hero) {
        if (this.healthPoints > 0) {
            int a = this.healthPoints - (hero.getWeapon() + hero.getStrength() - defence);
            setHealthPoints(a);
            System.out.println("Dragon HP: " + a);
        } else {
            System.out.println("Dragon dit");
        }
    }

    public void minHP75(Hero hero) {
        if (this.healthPoints > 0) {
            int a = this.healthPoints + defence - ((hero.getWeapon() + hero.getStrength()) * 75 / 100);
            setHealthPoints(a);
            System.out.println("Dragon HP: " + a);
        } else {
            System.out.println("Dragon dit");
        }
    }

    public void fail() {
        System.out.println("Fail ");
        if (this.healthPoints > 0) {
            System.out.println("Dragon HP: " + getHealthPoints());
        } else {
            System.out.println("Hero win");
        }
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "HealthPoints=" + healthPoints +
                ", defence=" + defence +
                ", strength=" + strength +
                ", weapon=" + weapon +
                '}';
    }
}
