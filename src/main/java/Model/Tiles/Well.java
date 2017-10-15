package main.java.Model.Tiles;

public class Well extends Building {
    public Well(int x, int y) {
        super.setX(x);
        super.setY(y);
        super.setBuildingType(BuildingEnum.WELL);



    @Override
    public void onTick() { };
}
