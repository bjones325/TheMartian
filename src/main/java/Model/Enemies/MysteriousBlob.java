package main.java.Model.Enemies;

public class MysteriousBlob extends Enemy {
    public MysteriousBlob(int locX, int locY) {
        super(locX,locY);
        moveSpd = 1;
        attack = 1;
        image = "MysteriousBlob.png";
        health = 100;
        name = "Mysterious Blob";
    }
}
