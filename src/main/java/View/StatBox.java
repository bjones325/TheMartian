package main.java.View;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
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
        setPadding(new Insets(0, 10, 0, 10));
        healthLabel = new Label("Health: " + GameManager.getInstance().getPlayer().getHealth());
        healthLabel.setFont(Font.font("Agency FB", FontWeight.BOLD, 16));
        tempLabel = new Label("Warmth: " + GameManager.getInstance().getPlayer().getTemp());
        tempLabel.setFont(Font.font("Agency FB", FontWeight.BOLD, 16));
        thirstLabel = new Label("Thirst: " + GameManager.getInstance().getPlayer().getThirst());
        thirstLabel.setFont(Font.font("Agency FB", FontWeight.BOLD, 16));
        energyLabel = new Label("Energy: " + GameManager.getInstance().getPlayer().getEnergy());
        energyLabel.setFont(Font.font("Agency FB", FontWeight.BOLD, 16));
        this.getChildren().addAll(healthLabel, tempLabel, thirstLabel, energyLabel);
    }

}
