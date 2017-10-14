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
        infoPanel.setSpacing(710.0);
        infoPanel.getChildren().clear();
        Label date = new Label("Sol " + GameManager.getInstance().getDate() + " - " + GameManager.getInstance().getTime() + ":00");
        Label temperature = new Label(GameManager.getInstance().getTemperature() + "°F");

        infoPanel.getChildren().addAll(
                date, temperature);
        if (GameManager.getInstance().getTime() > 9) {
            infoPanel.setSpacing(infoPanel.getSpacing() - 6);
        }
        int dateSpaceCounter = GameManager.getInstance().getDate() / 10;
        while (dateSpaceCounter != 0) {
            infoPanel.setSpacing(infoPanel.getSpacing() - 10);
            dateSpaceCounter /= 10;
        }
    }

    public HBox getRootNode() {
        return infoPanel;
    }
}
