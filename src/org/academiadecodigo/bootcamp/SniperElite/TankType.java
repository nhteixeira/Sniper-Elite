package org.academiadecodigo.bootcamp.SniperElite;

public enum TankType {
    LIGHT("Light Tank", 750),
    MEDIUM("Medium Tank", 1400),
    HEAVY("Heavy Tank", 2000);

    private int hitpoints;
    private String typeOfTank;

    private TankType(String typeOfTank, int hitpoints) {
        this.typeOfTank = typeOfTank;
        this.hitpoints = hitpoints;
    }

    public int getHitpoints() {
        return this.hitpoints;
    }

    public String getTypeOfTank() {
        return this.typeOfTank;
    }
}