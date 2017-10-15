package main.java.Model.Items;

import main.java.Model.GameManager;

public class Stone {
    public void onCreate() {
        GameManager.getInstance().getPlayer().pickUpObject(ItemEnum.STONE, 1);
    }
}
