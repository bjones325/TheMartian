package main.java.Model.Tiles;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import main.java.Model.Enemies.MartianDog;

public enum TileEnum {

    BASE(new ImageView(new Image("File:./assets/Ratios.png"))),
    TUNDRA(new ImageView(new Image("File:./assets/Tundra.png"))),
    WATER(new ImageView(new Image("File:./assets/Water.png"))),
    DESERT(new ImageView(new Image("File:./assets/desert.png"))),
    LAVA(new ImageView(new Image("File:./assets/Lava.png"))),
    SWAMP(new ImageView(new Image("File:./assets/Swamp.png"))),
    THICKET(new ImageView(new Image("File:./assets/Thicket.png"))),
    MOUNTAIN(new ImageView(new Image("File:./assets/Mountain.png"))),
    GAS_VENT(new ImageView(new Image("File:./assets/Gasvent.png"))),
    CRATER(new ImageView(new Image("File:./assets/Crater.png"))),
    HILL(new ImageView(new Image("File:./assets/Ratios.png"))),
    IRON_MINE(new ImageView(new Image("File:./assets/IronMine.png")));

    private ImageView view;

    private TileEnum(ImageView iv) {
        view = iv;
    }

    public ImageView getImageView() {
        return view;
    }
}
