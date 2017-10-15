package main.java.View;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import main.java.Model.Items.ItemManager;

public class OptionsView extends VBox {

    public OptionsView() {
        update();
    }

    public void update() {
        this.getChildren().clear();
        Label optionLab = new Label("OPTIONS");
        optionLab.setFont(Font.font("Agency FB", FontWeight.BOLD, 26));
        this.getChildren().add(optionLab);
        this.setAlignment(Pos.BOTTOM_CENTER);

        for(String craftable : ItemManager.getInstance().getCraftableList()) {
            Label l = new Label(craftable);
            this.getChildren().add(l);
        }
    }
}
