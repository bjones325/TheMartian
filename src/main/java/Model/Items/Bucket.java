package main.java.Model.Items;

import main.java.Model.GameManager;

public class Bucket {
    public void onCreate() {
        GameManager.getInstance().getPlayer().pickUpObject(ItemEnum.BUCKET, 1);
    }
}
