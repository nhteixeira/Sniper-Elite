package org.academiadecodigo.bootcamp.SniperElite;

public abstract class Enemy extends GameObject implements Shootable {
    private int health;
    private boolean isDead;
    private boolean isDestroyed;

    public Enemy(int health) {
        this.health = health;
        this.isDead = false;
    }

    public boolean isDead() {
        return this.isDead;
    }

    public void setDead() {
        this.isDead = true;
    }

    public boolean isDestroyed() {
        return this.isDestroyed;
    }

    public void setDestroyed() {
        this.isDestroyed = true;
    }

    public void hit(int damage) {
        if (this.health - damage <= 0) {
            this.setDestroyed();
            this.setHealth(0);
        } else {
            this.health -= damage;
        }

    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
