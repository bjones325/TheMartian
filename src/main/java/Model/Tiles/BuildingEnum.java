package main.java.Model.Tiles;

import javafx.scene.image.Image;

public enum BuildingEnum {
    IRON_MINE(IronMine.class, new Image("File:./assets/IronMine.png", 53, 53, true, true)),
    WELL(null, new Image("File:./assets/Well.png", 53, 53, true, true)),
    TEMP_CONVERTER(null, null);

    private Class tmp;

    private Image buildingImg;

    BuildingEnum(Class type, Image img) {
        this.tmp = type;
        this.buildingImg = img;
    }

    public Class getRunnable() { return tmp; }

    public Image getBuildingImg() {
        return buildingImg;
    }

}
