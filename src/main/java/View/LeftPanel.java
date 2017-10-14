package main.java.View;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class LeftPanel extends VBox {

    private StatBox statBox;
    private ChunkMap chunkMap;

    public LeftPanel() {
        statBox = new StatBox();
        chunkMap = new ChunkMap();
        this.setSpacing(0.0);
        this.setPrefSize(108, 500);
        update();
    }

    public void update() {
        this.getChildren().clear();
        Label invLab = new Label("STATUS");
        invLab.setFont(Font.font("Agency FB", FontWeight.BOLD, 26));
        StackPane sp = new StackPane(invLab);
        sp.setAlignment(Pos.CENTER);
        statBox.update();
        chunkMap.update();
        this.getChildren().addAll(sp, statBox, chunkMap);
    }
}
