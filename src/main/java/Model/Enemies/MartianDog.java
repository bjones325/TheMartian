package main.java.Model.Enemies;

import javafx.scene.image.Image;

public class MartianDog extends Enemy {

    private static Image occupantImage;

    public MartianDog(int locX, int locY) {
        super(locX,locY);
        moveSpd = 1;
        attack = 1;
        image = "MartianDog.png";
        health = 100;
        name = "Martian Dog";
        occupantImage = new Image("File:./assets/MartianDog.png", 53, 53, true, true);
    }

    @Override
    public Image getOccupantImage() {
        return occupantImage;
    }
}
