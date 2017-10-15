package main.java.View;

import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import main.java.Model.Items.Item;
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

        for(Class craftable : ItemManager.getInstance().getCraftableList()) {
            Label l = new Label(craftable.toString().substring(28));
            l.setOnMouseClicked(new EventHandler<MouseEvent>(){
                @Override
                public void handle(MouseEvent arg0) {
                    System.out.println("Crafted " + craftable.toString().substring(28));
                    try {
                        ((Item) craftable.newInstance()).onCraft();
                        GameScreen.updateAllScreen();
                    } catch (Exception e) {
                        System.exit(69);
                    }
                }

            });
            this.getChildren().add(l);
        }
    }
}
