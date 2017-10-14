package main.java.Model.Tiles;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import main.java.Model.GameManager;

public class Tile {
    private TileEnum terrainType;

    private int x;
    private int y;

    public Tile(TileEnum terrain, int x, int y) {
        terrainType = terrain;
        this.x = x;
        this.y = y;
    }

    public void effect(){
        switch (terrainType) {
            case BASE:
                GameManager.getInstance().getPlayer().setTemp(GameManager.getInstance().getPlayer().getTemp() - 2);
                break;
            case LAVA:
                GameManager.getInstance().getPlayer().setTemp(GameManager.getInstance().getPlayer().getTemp() - 2);
                GameManager.getInstance().getPlayer().setHealth(GameManager.getInstance().getPlayer().getHealth() - 20);
                break;
        }
    }

    public StackPane getTileStackPane() {
        StackPane tilePane = new StackPane();
        tilePane.getChildren().add(terrainType.getImageView());
        return tilePane;
    }
}
