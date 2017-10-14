package main.java.Model.Items;

import main.java.Model.GameManager;

public class Rifle extends Weapon {

    public Rifle() { super(75, 2, 20, "Rifle"); }

    public void onCraft() {
        GameManager.getInstance().getPlayer().pickUpObject(ItemEnum.RIFLE, 1);
    }
}
