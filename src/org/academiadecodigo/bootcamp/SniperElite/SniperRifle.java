package org.academiadecodigo.bootcamp.SniperElite;

public class SniperRifle {
    private int bulletDamage = 5;
    private int headshotDamage = 60;

    public SniperRifle() {
    }

    public void shoot(Shootable shootable) {
        int headshotProbability = RandomGenerator.getRandom(100);
        if (!shootable.isDestroyed()) {
            if (shootable instanceof Tank) {
                shootable.hit(this.bulletDamage);
                System.out.println("Boom " + this.bulletDamage + " damage!");
                System.out.println(shootable.getMessage());
            } else if (headshotProbability > 80) {
                shootable.hit(this.headshotDamage);
                System.out.println("BoOOoOM Headshot! " + this.headshotDamage + " damage!");
                System.out.println(shootable.getMessage());
            } else {
                int damageMultiplier = this.bulletDamage * RandomGenerator.getRandom(1, 5);
                shootable.hit(damageMultiplier);
                System.out.println("Boom " + damageMultiplier + " damage!");
                System.out.println(shootable.getMessage());
            }
        }

    }
}