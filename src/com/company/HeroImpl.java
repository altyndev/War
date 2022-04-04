package com.company;

import java.util.Random;

public class HeroImpl implements HeroWar {
    Random random = new Random();
    private Dragon dragon;
    private Hero hero;
//    Dragon dragon = new Dragon(2000, 120, 150, 0);
//    Hero hero = new Hero(1000, 100, 120, 250, 150);


    public HeroImpl(Dragon dragon, Hero hero) {
        this.dragon = dragon;
        this.hero = hero;
    }

    @Override
    public void atackaHero() {
        int vybor = random.nextInt(1, 4);
        System.out.println("Hero atacka");
        switch (vybor) {
            case 1 -> dragon.minHP(hero);
            case 2 -> dragon.minHP75(hero);
            case 3 -> dragon.fail();
        }
    }


    @Override
    public void atackaDragon() {
        System.out.println("Dragon atacka");
        int vybor = random.nextInt(1, 3);
        switch (vybor) {
            case 1 -> hero.minHP(dragon);
            case 2 -> System.out.println("Dragon fail");
        }
    }


}
