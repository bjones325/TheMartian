package main.java.Model.Items;

import main.java.Model.GameManager;
import main.java.Model.Tiles.BuildingEnum;
import main.java.Model.Tiles.BuildingManager;

public class IronMineCraft extends Item {
    public IronMineCraft() {
        super.setBp(new IronMineBlueprint());
    }

    @Override
    public void onCraft() {
        int[] loc = GameManager.getInstance().getPlayerLoc();
        GameManager.getInstance().getPlayer().pickUpObject(ItemEnum.IRON_ORE, -15);
        BuildingManager.getInstance().spawnBuilding(BuildingEnum.IRON_MINE, loc[0], loc[1]);
    }
}
