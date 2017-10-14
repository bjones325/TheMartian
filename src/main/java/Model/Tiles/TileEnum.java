package main.java.Model.Tiles;

import javafx.scene.image.Image;

public enum TileEnum {

    BASE(new Image("File:./assets/desert.png")),
    TUNDRA(new Image("File:./assets/Tundra.png")),
    WATER(new Image("File:./assets/Water.png")),
    DESERT(new Image("File:./assets/Base.png")),
    LAVA(new Image("File:./assets/Lava.png")),
    SWAMP(new Image("File:./assets/Swamp.png")),
    THICKET(new Image("File:./assets/Thicket.png")),
    MOUNTAIN(new Image("File:./assets/Mountain.png")),
    GAS_VENT(new Image("File:./assets/Gasvent.png")),
    CRATER(new Image("File:./assets/Crater.png")),
    HILL(new Image("File:./assets/Ratios.png")),
    IRON_MINE(new Image("File:./assets/IronMine.png"));

    private Image view;

    private TileEnum(Image iv) {
        view = iv;
    }

    public Image getImageView() {
        return view;
    }
}
