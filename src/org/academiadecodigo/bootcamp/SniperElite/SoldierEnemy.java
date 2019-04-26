package org.academiadecodigo.bootcamp.SniperElite;

public class SoldierEnemy extends Enemy {
    public SoldierEnemy(int health) {
        super(health);
    }

    public String getMessage() {
        return "Soldier Enemy (Health: " + this.getHealth() + ")";
    }
}
