package main.java.Model.Items;

import main.java.Model.GameManager;
import main.java.Model.Tiles.TileEnum;

public class WellBlueprint extends Blueprint {

    TileEnum playerTileType = GameManager.getInstance().getPlayerTileType();

    public boolean buildable() {
        return (GameManager.getInstance().getPlayer().hasItemNum(10,ItemEnum.IRON_ORE));
    }

    public WellBlueprint() {
        super("Well");
    }
}
