package main.java.View;

import javafx.geometry.Pos;
import javafx.scene.layout.VBox;

public class RightPanel extends VBox {

    private InvView InvBox;
    private OptionsView optionsView;

    public RightPanel() {
        InvBox = new InvView();
        optionsView = new OptionsView();
        this.setSpacing(0.0);
        this.setAlignment(Pos.TOP_CENTER);
        this.setPrefSize(108, 500);
        updateInventory();
        updateOptionsBox();
    }

    public void updateInventory() {
        this.getChildren().remove(InvBox);
        InvBox.update();
        this.getChildren().add(InvBox);
    }

    public void updateOptionsBox() {
        this.getChildren().remove(optionsView);
        optionsView.update();
        this.getChildren().add(optionsView);
    }
}
