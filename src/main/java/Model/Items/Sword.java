package main.java.Model.Items;

import main.java.Model.GameManager;

public class Sword extends Weapon{

    public Sword() {
        super(25, 1, 10,"Sword");
    }

    public void onCraft() {
        GameManager.getInstance().getPlayer().pickUpObject(ItemEnum.SWORD, 1);
    }
}
