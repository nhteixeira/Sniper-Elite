package org.academiadecodigo.bootcamp.SniperElite;

public enum BarrelType {
    PLASTIC("Plastic Barrel", 50),
    WOOD("Wood Barrel", 100),
    METAL("Metal Barrel", 200);

    private int hitpoints;
    private String typeOfBarrel;

    private BarrelType(String typeOfBarrel, int hitpoints) {
        this.typeOfBarrel = typeOfBarrel;
        this.hitpoints = hitpoints;
    }

    public int getHitpoints() {
        return this.hitpoints;
    }

    public String getTypeOfBarrel() {
        return this.typeOfBarrel;
    }
}