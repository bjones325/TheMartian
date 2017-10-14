package main.java.View;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import main.java.Model.GameManager;

public class TopPanel {

    private HBox infoPanel;

    public TopPanel() {
        infoPanel = new HBox();
        infoPanel.setSpacing(810.0);
        infoPanel.setPadding(new Insets(0, 5,0, 5));
        update();
    }

    public void update() {
        infoPanel.getChildren().clear();
        Label date = new Label("Sol " + GameManager.getInstance().getDate() + " - " + GameManager.getInstance().getTime() + ":00");
        Label temperature = new Label(GameManager.getInstance().getTemperature() + "°F");

        infoPanel.getChildren().addAll(
                date, temperature);
    }

    public HBox getRootNode() {
        return infoPanel;
    }
}
