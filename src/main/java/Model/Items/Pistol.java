package main.java.Model.Items;

import main.java.Model.GameManager;

public class Pistol extends Weapon {

    public Pistol() { super(45, 2, 6, "Pistol"); }

    public void onCraft() {
        GameManager.getInstance().getPlayer().pickUpObject(ItemEnum.PISTOL, 1);
    }
}
