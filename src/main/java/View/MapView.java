package main.java.View;

import javafx.scene.layout.GridPane;
import main.java.Model.GameManager;

public class MapView extends GridPane {

    private static int viewSize = 11;

    public MapView() {
        update();
    }

    public void update() {
        this.getChildren().clear();
        int max = GameManager.getInstance().getTileManager().getWidthHeight() - 1;
        int playerX = GameManager.getInstance().getPlayer().getLocX();
        int playerY = GameManager.getInstance().getPlayer().getLocY();

        int bottom = playerY + 5;
        int top = playerY - 5;
        int left = playerX - 5;
        int right = playerX + 5;

        if (top < 0) {
            top = 0;
            bottom = 10;
            System.out.println("REACHED TOP");
        } else if (bottom > max) {
            top = max - 10;
            bottom = max;
            System.out.println("REACHED BOT");
        }

        if (left < 0) {
            left = 0;
            right = left + 10;
        } else if (right > max) {
            right = max;
            left = max - 10;
        }

        for (int x = left; x <= right; x++) {
            for (int y = top; y <= bottom; y++) {
                this.add(GameManager.getInstance().getTileManager().getTile(x, y).getTileStackPane(), x, y);
            }
        }
    }
}
