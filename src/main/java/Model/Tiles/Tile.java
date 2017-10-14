package main.java.Model.Tiles;

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
}
