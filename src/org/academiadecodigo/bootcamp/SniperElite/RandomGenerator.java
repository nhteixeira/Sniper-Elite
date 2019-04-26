package org.academiadecodigo.bootcamp.SniperElite;

public class RandomGenerator {
    public RandomGenerator() {
    }

    public static int getRandom(int max) {
        return getRandom(0, max);
    }

    public static int getRandom(int min, int max) {
        return (int)(Math.random() * (double)(max - min)) + min;
    }
}
