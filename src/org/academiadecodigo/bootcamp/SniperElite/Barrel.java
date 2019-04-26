package org.academiadecodigo.bootcamp.SniperElite;

public class Barrel extends GameObject implements Shootable {
    private boolean isDestroyed;
    private BarrelType type;
    private int hitpoints;

    public Barrel() {
        int random = RandomGenerator.getRandom(BarrelType.values().length);
        this.type = BarrelType.values()[random];
        this.hitpoints = this.type.getHitpoints();
    }

    public void hit(int damage) {
        if (this.hitpoints - damage <= 0) {
            this.setDestroyed();
            this.setHitpoints(0);
        } else {
            this.hitpoints -= damage;
        }

    }

    public String getMessage() {
        return this.type.getTypeOfBarrel() + " (Hit points: " + this.getHitpoints() + ")";
    }

    public int getHitpoints() {
        return this.hitpoints;
    }

    public void setHitpoints(int hitPoints) {
        this.hitpoints = hitPoints;
    }

    public boolean isDestroyed() {
        return this.isDestroyed;
    }

    public void setDestroyed() {
        this.isDestroyed = true;
    }
}