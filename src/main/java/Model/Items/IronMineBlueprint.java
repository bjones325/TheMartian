package main.java.Model.Items;

import main.java.Model.GameManager;
import main.java.Model.Tiles.BuildingEnum;
import main.java.Model.Tiles.BuildingManager;
import main.java.Model.Tiles.TileEnum;

public class IronMineBlueprint extends Blueprint {
    TileEnum playerTileType = GameManager.getInstance().getPlayerTileType();

    public boolean buildable() {
        return (playerTileType == TileEnum.IRON_VEIN
        && GameManager.getInstance().getPlayer().hasItemNum(10,ItemEnum.STONE));
    }

    public IronMineBlueprint() {
        super("Iron Mine Blueprint");
    }


}
