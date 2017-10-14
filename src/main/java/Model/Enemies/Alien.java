package main.java.Model.Enemies;

import javafx.scene.image.Image;

public class Alien extends Enemy {

    private static Image occupantImage;

    public Alien(int locX, int locY) {
        super(locX,locY);
        moveSpd = 1;
        attack = 1;
        image = "Alien.png";
        health = 100;
        name = "Alien";
        occupantImage = new Image("File:./assets/Alien.png", 53, 53, true, true);
    }

    @Override
    public Image getOccupantImage() {
        return occupantImage;
    }
}
