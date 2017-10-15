package main.java.Model.Tiles;

import javafx.scene.image.Image;

public enum BuildingEnum {
    IRON_MINE(IronMine.class),
    WELL(Well.class),
    TEMP_CONVERTER(null);

    private Class tmp;

    private Image buildingImg;

    BuildingEnum(Class type) {
        this.tmp = type;
    }

    public Class getRunnable() { return tmp; }

    public Image getBuildingImg() {
        return buildingImg;
    }

}
