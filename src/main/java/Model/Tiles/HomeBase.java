package main.java.Model.Tiles;

import main.java.Model.GameManager;

public class HomeBase extends Building {

    public HomeBase(int x, int y) {
        super.setX(x);
        super.setY(y);
        super.setBuildingType(BuildingEnum.HOMEBASE);

    }

    public HomeBase() {
    }


    @Override
    public void onTick() {
        if (x == GameManager.getInstance().getPlayerLoc()[0] && y == GameManager.getInstance().getPlayerLoc()[1]) {
            GameManager.getInstance().getPlayer().refillWater();

        }
    }
}
