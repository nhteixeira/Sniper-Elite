package org.academiadecodigo.bootcamp.SniperElite;

public class Game {
    private GameObject[] gameObjects;
    private SniperRifle sniperRifle;
    private int shotsFired;

    public Game(SniperRifle sniperRifle, int numberOfObjects) {
        this.sniperRifle = sniperRifle;
        this.gameObjects = this.createObjects(numberOfObjects);
    }

    public void start() {
        for(int i = 0; i < this.gameObjects.length; ++i) {
            if (this.gameObjects[i] instanceof Shootable) {
                Shootable shootable = (Shootable)this.gameObjects[i];

                while(!shootable.isDestroyed()) {
                    int random = RandomGenerator.getRandom(100);
                    if (random > 50) {
                        this.sniperRifle.shoot(shootable);
                        ++this.shotsFired;
                    } else {
                        System.out.println("Lol missed shot.");
                        ++this.shotsFired;
                    }
                }
            }
        }

        System.out.println("shots fired: " + this.shotsFired);
    }

    private GameObject[] createObjects(int amount) {
        GameObject[] temp = new GameObject[amount];

        for(int i = 0; i < temp.length; ++i) {
            int option = RandomGenerator.getRandom(10);
            if (option > 8) {
                temp[i] = new Tree();
                System.out.println(temp[i].getMessage());
            } else if (option > 6) {
                temp[i] = new ArmouredEnemy(100);
                System.out.println(temp[i].getMessage());
            } else if (option > 4) {
                temp[i] = new SoldierEnemy(100);
                System.out.println(temp[i].getMessage());
            } else if (option > 2) {
                temp[i] = new Barrel();
                System.out.println(temp[i].getMessage());
            } else {
                temp[i] = new Tank();
                System.out.println(temp[i].getMessage());
            }
        }

        return temp;
    }
}