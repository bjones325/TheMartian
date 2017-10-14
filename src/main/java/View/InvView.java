package main.java.View;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import main.java.Model.GameManager;
import main.java.Model.Items.ItemStackObject;

public class InvView extends VBox {

    public InvView() {
        update();
    }

    public void update() {
        this.getChildren().clear();
        Label invLab = new Label("INVENTORY");
        this.getChildren().add(invLab);
        for (ItemStackObject stack : GameManager.getInstance().getPlayer().getInventory()) {
            Label l = new Label(stack.get_amount() + " x " + stack.get_obj().toString());
            this.getChildren().add(l);
        }
    }

}
