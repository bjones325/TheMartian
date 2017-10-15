package main.java.Model.Tiles;

public abstract class Building {
    protected int x;
    protected int y;

    private BuildingEnum buildingType;

    public abstract void onTick(
    );

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setBuildingType(BuildingEnum buildingType) {
        this.buildingType = buildingType;
    }

    public BuildingEnum getBuildingType() {
        return buildingType;
    }


}
