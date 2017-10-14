package main.java.Model.Enemies;

import javafx.scene.image.Image;

public class MysteriousBlob extends Enemy {

    private static Image occupantImage;

    public MysteriousBlob(int locX, int locY) {
        super(locX,locY);
        moveSpd = 1;
        attack = 1;
        image = "MysteriousBlob.png";
        health = 100;
        name = "Mysterious Blob";
        occupantImage = new Image("File:./assets/Blob.png", 53, 53, true, true);
    }

    @Override
    public Image getOccupantImage() {
        return occupantImage;
    }
}
