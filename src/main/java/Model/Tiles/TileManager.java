package main.java.Model.Tiles;

public class TileManager {
    private int width = 100;
    private int height = 100;

    private Tile[][] map;

    private static TileManager instance = new TileManager();

    private TileManager() {
        map = new Tile[width][height];

        for(int x = 0; x < width; x++) {
            for(int y = 0; y < height; y++) {
                map[x][y] = new Tile(TileEnum.BASE, x, y);
            }
        }
    }

    public static TileManager getInstance() {
        return instance;
    }

    public Tile getTile(int x, int y) {
        return map[x][y];
    }

    public int getWidthHeight() {
        return width;
    }
}
