package main.java.View;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

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
