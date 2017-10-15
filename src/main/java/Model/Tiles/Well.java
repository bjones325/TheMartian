package main.java.Model.Tiles;

import main.java.Model.GameManager;

public class Well extends Building {
    public Well(int x, int y) {
        super.setX(x);
        super.setY(y);
        super.setBuildingType(BuildingEnum.WELL);
    }

    public Well() {
        super.setBuildingType(BuildingEnum.WELL);
    }


    @Override
    public void onTick() {
        System.out.print("ontick");
        if (x == GameManager.getInstance().getPlayerLoc()[0] && y == GameManager.getInstance().getPlayerLoc()[1]) {
            GameManager.getInstance().getPlayer().refillWater();

        }
    }

}

