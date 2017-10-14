package main.java.Model.Tiles;

import java.util.Random;

public class TileManager {
    private int width = 100;
    private int height = 100;

    private Tile[][] map;

    private static TileManager instance = new TileManager();

    private TileManager() {
        map = new Tile[width][height];

        Random random = new Random();

        for(int x = 0; x < width; x++) {
            for(int y = 0; y < height; y++) {
                if(random.nextInt(3) == 0) {
                    map[x][y] = new Tile(TileEnum.BASE, x, y);
                } else {
                    map[x][y] = new Tile(TileEnum.values()[random.nextInt(TileEnum.values().length)], x, y);
                }
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
