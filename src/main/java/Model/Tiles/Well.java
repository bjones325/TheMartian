package main.java.Model.Tiles;

import main.java.Model.GameManager;

public class Well extends Building {
    public Well(int x, int y) {
        super.setX(x);
        super.setY(y);
        super.setBuildingType(BuildingEnum.WELL);
    }


    @Override
    public void onTick() {
        if(GameManager.getInstance().getPlayer().getLocX() == super.getX() && GameManager.getInstance().getPlayer().getLocX() == super.getY()){
            GameManager.getInstance().getPlayer().refillWater();
        }
    }

}

