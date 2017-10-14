package main.java.Model.Tiles;

import javafx.scene.image.Image;

public enum TileEnum {

    BASE(new Image("File:./assets/Base.png", 53, 53, true, true)),
    TUNDRA(new Image("File:./assets/Tundra.png", 53, 53, true, true)),
    DESERT(new Image("File:./assets/desert.png", 53, 53, true, true)),
    LAVA(new Image("File:./assets/Lava.png", 53, 53, true, true)),
    SWAMP(new Image("File:./assets/Swamp.png", 53, 53, true, true)),
    MOUNTAIN(new Image("File:./assets/mtns.png", 53, 53, true, true)),
    GAS_VENT(new Image("File:./assets/Gasvent.png", 53, 53, true, true)),
    CRATER(new Image("File:./assets/Crater.png", 53, 53, true, true)),
    //HILL(new Image("File:./assets/Ratios.png", 53, 53, true, true)),
    IRON_VEIN(new Image("File:./assets/IronOreVain.png", 53, 53, true, true)),
    ALIEN_VEIN(new Image("File:./assets/AlienOreVain.png", 53, 53, true, true)),
    ALUMINUM_VEIN(new Image("File:./assets/AluminumVain.png", 53, 53, true, true)),
    URANIUM_VEIN(new Image("File:./assets/UraniumVain.png", 53, 53, true, true));
    private Image view;

    TileEnum(Image iv) {
        view = iv;
    }

    public Image getImageView() {
        return view;
    }
}
