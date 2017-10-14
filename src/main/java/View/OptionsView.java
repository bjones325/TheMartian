package main.java.View;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import main.java.Model.GameManager;
import main.java.Model.ItemStackObject;

public class OptionsView extends VBox {

    public OptionsView() {
        update();
    }

    public void update() {
        this.getChildren().clear();
        Label optionLab = new Label("OPTIONS");
        this.getChildren().add(optionLab);
    }
}
