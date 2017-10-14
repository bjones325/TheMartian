package main.java.Model;

public class Player {
    private int health;
    private int temp;
    private int thirst;
    private int energy;

    private int energyRate;

    private int locX;
    private int locY;

    public Player() {
        health = 100;
        temp = 70;
        thirst = 10;
        energy = 100;

        locX = 0;
        locY = 0;
    }

    public void moveUp() {
        locY++;
        energy = energy - energyRate;
    }

    public void moveDown() {
        locY--;
        energy = energy - energyRate;
    }

    public void moveRight() {
        locX++;
        energy = energy - energyRate;
    }

    public void moveLeft() {
        locY--;
        energy = energy - energyRate;
    }
}