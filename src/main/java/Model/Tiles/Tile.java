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
        GameManager.getInstance().getPlayer().setTemp(GameManager.getInstance().getPlayer().getTemp() - 2);
    }

    public StackPane getTileStackPane() {
        StackPane tilePane = new StackPane();
        Color col = Color.BLUE;
        if (x % 2 == 0) {
            col = Color.RED;
        }
        tilePane.getChildren().add(new Rectangle(64,64, col));
        //tilePane.getChildren().add(te)
        return tilePane;
    }
}
