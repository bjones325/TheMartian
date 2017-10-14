package main.java.Model.Enemies;

public class MartianDog extends Enemy {
    public MartianDog(int locX, int locY) {
        super(locX,locY);
        moveSpd = 1;
        attack = 1;
        type = "Martian Dog";
        image = "MartianDog.png";
        health = 100;
    }
}
