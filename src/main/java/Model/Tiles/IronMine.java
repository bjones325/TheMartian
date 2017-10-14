package main.java.Model.Tiles;

public class IronMine extends Building {
    private int ironCount = 0;

    public IronMine(int x, int y) {
        super.setX(x);
        super.setY(y);
        super.setBuildingType(BuildingEnum.IRON_MINE);

        ironCount = 0;
    }

    @Override
    public void onTick() {
        ironCount++;
    }
}
