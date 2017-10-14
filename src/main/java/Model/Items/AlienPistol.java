package main.java.Model.Items;

import main.java.Model.GameManager;

public class AlienPistol extends Weapon {

    public AlienPistol() {
        super(65, 2, 8,"Alien Pistol");
    }

    @Override
    public void onCraft() {
        GameManager.getInstance().getPlayer().pickUpObject(ItemEnum.ALIEN_PISTOL, 1);
    }
}

