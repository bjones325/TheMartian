package main.java.View;

import javafx.scene.layout.GridPane;
import main.java.Model.GameManager;

public class MapView extends GridPane {

    private static int viewSize = 11;

    public MapView() {
        update();
    }

    public void update() {
        int max = GameManager.getInstance().getTileManager().getWidthHeight() - 1;
        int playerX = GameManager.getInstance().getPlayer().getLocX();
        int playerY = GameManager.getInstance().getPlayer().getLocY();

        int bottom = playerY - 5;
        int top = playerY + 5;
        int left = playerX - 5;
        int right = playerX + 5;

        if (bottom < 0) {
            bottom = 0;
            top = 11;
        } else if (top > max) {
            top = max;
            bottom = top - 11;
        }

        if (left < 0) {
            left = 0;
            right = left + 11;
        } else if (right > max) {
            right = max;
            left = max - 11;
        }

        for (int x = left; x < right; x++) {
            for (int y = bottom; y < top; y++) {
                this.add(GameManager.getInstance().getTileManager().getTile(x, y).getTileStackPane(), x, y);
            }
        }
    }
}
