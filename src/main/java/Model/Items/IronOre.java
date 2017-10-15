package main.java.Model.Items;

import main.java.Model.GameManager;

public class IronOre extends Item {
    public void onCraft() {
        GameManager.getInstance().getPlayer().pickUpObject(ItemEnum.IRON_ORE, 1);
    }
}
