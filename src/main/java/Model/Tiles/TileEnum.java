package main.java.Model.Tiles;

import javafx.scene.image.Image;
import main.java.Runner.Runner;

public enum TileEnum {

    BASE(new Image("assets/Base.png", 53, 53, true, true)),
    TUNDRA(new Image("assets/Tundra.png", 53, 53, true, true)),
    DESERT(new Image("assets/desert.png", 53, 53, true, true)),
    LAVA(new Image("assets/Lava.png", 53, 53, true, true)),
    MOUNTAIN(new Image("assets/mtns.png", 53, 53, true, true)),
    GAS_VENT(new Image("assets/Gasvent.png", 53, 53, true, true)),
    CRATER(new Image("assets/Crater.png", 53, 53, true, true)),
    //HILL(new Image("assets/Ratios.png", 53, 53, true, true)),
    IRON_VEIN(new Image("assets/IronOreVain.png", 53, 53, true, true)),
    ALIEN_VEIN(new Image("assets/AlienOreVain.png", 53, 53, true, true)),
    ALUMINUM_VEIN(new Image("assets/AluminumVain.png", 53, 53, true, true)),
    URANIUM_VEIN(new Image("assets/UraniumVain.png", 53, 53, true, true)),
    SWAMP(new Image("assets/Swamp.png", 53, 53, true, true));
    private Image view;

    TileEnum(Image iv) {
        view = iv;
    }

    public Image getImageView() {
        return view;
    }
}
