package main.java.Model.Tiles;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import main.java.Model.GameManager;

public class Tile {
    private TileEnum terrainType;

    private boolean occupied;

    private int x;
    private int y;

    private Building building;

    public Tile(TileEnum terrain, int x, int y) {
        terrainType = terrain;
        occupied = false;
        this.x = x;
        this.y = y;
    }

    public void effect(){
        switch (terrainType) {
            case BASE:
                GameManager.getInstance().getPlayer().setTemp(GameManager.getInstance().getPlayer().getTemp() - 2);
                break;
            case LAVA:
                GameManager.getInstance().getPlayer().setTemp(GameManager.getInstance().getPlayer().getTemp() + 10);
                GameManager.getInstance().getPlayer().setHealth(GameManager.getInstance().getPlayer().getHealth() - 20);
                break;
        }
    }

    public StackPane getTileStackPane() {
        StackPane tilePane = new StackPane();
        tilePane.getChildren().add(new ImageView(terrainType.getImageView()));
        if (x == GameManager.getInstance().getPlayer().getLocX() &&
                y == GameManager.getInstance().getPlayer().getLocY()) {
            tilePane.getChildren().add(new ImageView(new Image("File:./assets/Player.png")));
        }
        return tilePane;
    }

    public TileEnum getTileType() { return terrainType; }

    public Building getBuilding() { return building; }

    public void setBuilding(Building building) { this.building = building; }

    public boolean isOccupied() {
        return occupied;
    }
}
