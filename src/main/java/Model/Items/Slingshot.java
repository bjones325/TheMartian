package main.java.Model.Items;

import main.java.Model.GameManager;

public class Slingshot extends Weapon {

    public Slingshot() {
        super(20, 2, 5,"Slingshot");
        super.setBp(new SlingshotBlueprint());

    }

    public void onCraft() {

        GameManager.getInstance().getPlayer().pickUpObject(ItemEnum.SLINGSHOT, 1);
    }
}
