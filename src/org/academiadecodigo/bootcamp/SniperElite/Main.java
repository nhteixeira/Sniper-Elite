package org.academiadecodigo.bootcamp.SniperElite;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        SniperRifle newSniper = new SniperRifle();
        Game newGame = new Game(newSniper, 5);
        newGame.start();
    }
}
