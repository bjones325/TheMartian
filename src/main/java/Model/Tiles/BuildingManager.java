package main.java.Model.Tiles;

import main.java.Model.GameManager;

import java.lang.reflect.Constructor;
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

    public void spawnBuilding(BuildingEnum buildingType, int posX, int posY)  {
        Building b;


        try {
            b = (Building) buildingType.getRunnable().newInstance();
            b.setX(posX);
            b.setY(posY);
        } catch (InstantiationException e) {
            System.exit(22);
        } catch (Exception e) {
            System.exit(23);
        }



    }

    public void spawnBuilding(Building b) {
        buildingList.add(b);
    }


}
