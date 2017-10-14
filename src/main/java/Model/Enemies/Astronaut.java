package main.java.Model.Enemies;

public class Astronaut extends Enemy {
    public Astronaut(int locX, int locY) {
        super(locX,locY);
        moveSpd = 1;
        attack = 1;
        image = "Astronaut.png";
        health = 100;
        name = "Astronaut";
    }
}
