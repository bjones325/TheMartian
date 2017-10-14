package main.java.Model.Tiles;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import main.java.Model.GameManager;
import main.java.Model.Occupant;

import java.util.Random;

public class Tile {
    private TileEnum terrainType;

    private Occupant occupant;

    private int x;
    private int y;

    private Building building;

    public Tile(TileEnum terrain, int x, int y) {
        terrainType = terrain;
        occupant = null;
        this.x = x;
        this.y = y;
    }

    public void effect(){
        Random random = new Random();
        switch (terrainType) {
            case BASE:
                GameManager.getInstance().getPlayer().setTemp(GameManager.getInstance().getPlayer().getTemp() + random.nextInt(5) - 2);
                break;
            case LAVA:
                GameManager.getInstance().getPlayer().setTemp(GameManager.getInstance().getPlayer().getTemp() + 10);
                GameManager.getInstance().getPlayer().setHealth(GameManager.getInstance().getPlayer().getHealth() - 20);
                GameManager.getInstance().getChatManager().addMessage("The heat from the lava is almost unbearable...", Color.RED);
                break;
            case TUNDRA:
                GameManager.getInstance().getPlayer().setTemp(GameManager.getInstance().getPlayer().getTemp() - 20);
                GameManager.getInstance().getChatManager().addMessage("The tundra is frigid. You need to find some heat!", Color.RED);
                break;
            case DESERT:
                GameManager.getInstance().getPlayer().setTemp(GameManager.getInstance().getPlayer().getTemp() + 5);
                GameManager.getInstance().getPlayer().setThirst(GameManager.getInstance().getPlayer().getThirst() - 2);
                GameManager.getInstance().getChatManager().addMessage("The desert makes you consider your dwindling supply of water...", Color.RED);
                break;
            case SWAMP:
                break;
            case CRATER:
                GameManager.getInstance().getPlayer().setHealth(GameManager.getInstance().getPlayer().getHealth() - 10);
                GameManager.getInstance().getChatManager().addMessage("You fell into the crater, bruising yourself...", Color.RED);

        }
    }

    public StackPane getTileStackPane() {
        StackPane tilePane = new StackPane();
        tilePane.getChildren().add(new ImageView(terrainType.getImageView()));
        if (isOccupied()) {
            tilePane.getChildren().add(new ImageView(occupant.getOccupantImage()));
        }
        return tilePane;
    }

    public TileEnum getTileType() { return terrainType; }

    public Building getBuilding() { return building; }

    public void setBuilding(Building building) { this.building = building; }

    public boolean isOccupied() {
        return occupant != null;
    }

    public void setOccupant(Occupant c) {
        occupant = c;
    }
}
