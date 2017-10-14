package main.java.Model.Enemies;

import javafx.scene.image.Image;

public class Astronaut extends Enemy {

    private static Image occupantImage;

    public Astronaut(int locX, int locY) {
        super(locX,locY);
        moveSpd = 1;
        attack = 1;
        image = "Astronaut.png";
        health = 100;
        name = "Astronaut";
        occupantImage = new Image("File:./assets/Astronaut.png", 53, 53, true, true);
    }

    @Override
    public Image getOccupantImage() {
        return occupantImage;
    }
}
