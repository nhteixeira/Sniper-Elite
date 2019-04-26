package org.academiadecodigo.bootcamp.SniperElite;

public class ArmouredEnemy extends Enemy {
    private int armour = 100;

    public ArmouredEnemy(int health) {
        super(health);
    }

    public void hit(int damage) {
        int exceededDamage = this.armour - damage;
        System.out.println(exceededDamage);
        if (this.armour - damage < 0) {
            this.armour = 0;
        }

        if (this.armour > 0) {
            this.armour -= damage;
        } else {
            super.hit(damage);
        }

    }

    public String getMessage() {
        return "Armoured Enemy (Health: " + this.getHealth() + ", Armour: " + this.armour + ')';
    }
}
