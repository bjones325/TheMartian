package main.java.View;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import main.java.Model.GameManager;

public class StatBox extends VBox {

    Label healthLabel;
    Label tempLabel;
    Label thirstLabel;
    Label energyLabel;

    public StatBox() {
        update();
    }

    public void update() {
        this.getChildren().clear();
        healthLabel = new Label("Health: " + GameManager.getInstance().getPlayer().getHealth());
        tempLabel = new Label("Warmth: " + GameManager.getInstance().getPlayer().getTemp());
        thirstLabel = new Label("Thirst: " + GameManager.getInstance().getPlayer().getThirst());
        energyLabel = new Label("Energy: " + GameManager.getInstance().getPlayer().getEnergy());
        this.getChildren().addAll(healthLabel, tempLabel, thirstLabel, energyLabel);
    }

}
