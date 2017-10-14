package main.java.View;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class LeftPanel extends VBox {

    private StatBox statBox;
    private ChunkMap chunkMap;

    public LeftPanel() {
        statBox = new StatBox();
        chunkMap = new ChunkMap();
        this.setSpacing(0.0);
        update();
    }

    public void update() {
        this.getChildren().clear();
        statBox.update();
        chunkMap.update();
        this.getChildren().addAll(statBox, chunkMap);
    }
}
