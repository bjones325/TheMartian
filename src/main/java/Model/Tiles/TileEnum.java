package main.java.Model.Tiles;

import javafx.scene.image.Image;

public enum TileEnum {

    BASE(new Image("File:./assets/desert.png", 60, 60, true, true)),
    TUNDRA(new Image("File:./assets/Tundra.png", 60, 60, true, true)),
    WATER(new Image("File:./assets/Water.png", 60, 60, true, true)),
    DESERT(new Image("File:./assets/Base.png", 60, 60, true, true)),
    LAVA(new Image("File:./assets/Lava.png", 60, 60, true, true)),
    SWAMP(new Image("File:./assets/Swamp.png", 60, 60, true, true)),
    THICKET(new Image("File:./assets/Thicket.png", 60, 60, true, true)),
    MOUNTAIN(new Image("File:./assets/mtns.png", 60, 60, true, true)),
    GAS_VENT(new Image("File:./assets/Gasvent.png", 60, 60, true, true)),
    CRATER(new Image("File:./assets/Crater.png", 60, 60, true, true)),
    HILL(new Image("File:./assets/Ratios.png", 60, 60, true, true)),
    IRON_MINE(new Image("File:./assets/IronMine.png", 60, 60, true, true));

    private Image view;

    private TileEnum(Image iv) {
        view = iv;
    }

    public Image getImageView() {
        return view;
    }
}
