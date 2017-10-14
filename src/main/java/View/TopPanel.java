package main.java.View;

import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import main.java.Model.GameManager;

public class TopPanel {

    private HBox infoPanel;

    public TopPanel() {
        infoPanel = new HBox();
        infoPanel.setSpacing(10.0);
        update();
    }

    public void update() {
        infoPanel.getChildren().clear();
        Label date = new Label("" + GameManager.getInstance().getDate());
        Label time = new Label("" + GameManager.getInstance().getTime());
        Label temperature = new Label("" + GameManager.getInstance().getTime());

        infoPanel.getChildren().addAll(
                date, time, temperature);
    }

    public HBox getRootNode() {
        return infoPanel;
    }
}
