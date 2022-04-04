package com.company;

public class Main {

    public static void main(String[] args) {

        Dragon dragon = new Dragon(2000, 120, 150, 0);
        Hero hero = new Hero(1000, 100, 120, 250, 150);

        HeroWar heroWar = new HeroImpl(dragon, hero);

        int a = 0;
        do {
            if (dragon.getHealthPoints() > 0 || hero.getHealthPoints() > 0) {
                heroWar.atackaHero();
                heroWar.atackaDragon();
                System.out.println("========================================================== " + a);
            }else {
                break;
            }
           a++;
        }
        while (true);
    }
}
