package main.java.Model.Enemies;

public class Alien extends Enemy {
    public Alien(int locX, int locY) {
        super(locX,locY);
        moveSpd = 1;
        attack = 1;
        image = "Alien.png";
        health = 100;
        name = "Alien";
    }
}
