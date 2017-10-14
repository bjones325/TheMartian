package main.java.View;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import main.java.Model.GameManager;
import main.java.Model.Items.ItemStackObject;

public class InvView extends VBox {

    public InvView() {
        update();
    }

    public void update() {
        this.getChildren().clear();
        Label invLab = new Label("INVENTORY");
        invLab.setFont(Font.font("Agency FB", FontWeight.BOLD, 16));
        this.getChildren().add(invLab);
        for (ItemStackObject stack : GameManager.getInstance().getPlayer().getInventory()) {
            Label l = new Label(stack.get_amount() + " x " + stack.get_obj().toString());
            this.getChildren().add(l);
        }
    }

}
