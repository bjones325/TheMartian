package main.java.Model.Tiles;

public enum BuildingEnum {
    IRON_MINE(IronMine.class),
    WELL(null),
    TEMP_CONVERTER(null);

    private Class tmp;

    private BuildingEnum(Class type) {
        this.tmp = type;
    }

    public Class getRunnable() { return tmp; }

}
