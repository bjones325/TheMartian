package main.java.Model.Tiles;

public class Tile {
    private TileEnum terrainType;
    private int x;
    private int y;

    public Tile(TileEnum terrain, int x, int y) {
        terrainType = terrain;
        this.x = x;
        this.y = y;
    }
}
