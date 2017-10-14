package main.java.Model.Tiles;

import main.java.Model.GameManager;

import java.util.ArrayList;
import java.util.List;

public class BuildingManager {
    private List<Building> buildingList;
    private static BuildingManager bm = new BuildingManager();

    private BuildingManager() {
        buildingList = new ArrayList<Building>();
    }

    public void onTick() {
        for (Building b : buildingList) {
            b.onTick();
        }
    }

    public static BuildingManager getInstance() { return bm; }

    public void spawnBuilding(BuildingEnum buildingType, int posX, int posY) {
        Building b;

        switch (buildingType) {
            case IRON_MINE:
                b = new IronMine(posX, posY);
                break;

        }
    }


}
