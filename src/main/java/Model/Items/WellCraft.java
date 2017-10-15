package main.java.Model.Items;

import main.java.Model.GameManager;
import main.java.Model.Tiles.BuildingEnum;
import main.java.Model.Tiles.BuildingManager;

public class WellCraft extends Item {
    public WellCraft() {
        super.setBp(new WellBlueprint());
    }

    @Override
    public void onCraft() {
        int[] loc = GameManager.getInstance().getPlayerLoc();
        GameManager.getInstance().getPlayer().pickUpObject(ItemEnum.IRON_ORE, -10);
        BuildingManager.getInstance().spawnBuilding(BuildingEnum.WELL, loc[0], loc[1]);
    }
}
