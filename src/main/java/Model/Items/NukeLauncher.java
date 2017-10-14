package main.java.Model.Items;

import main.java.Model.GameManager;

public class NukeLauncher extends Weapon {

    public NukeLauncher() { super(300, 2, 65, "Nuke Launcher"); }

    public void onCraft() {
        GameManager.getInstance().getPlayer().pickUpObject(ItemEnum.NUKE_LAUNCHER, 1);
    }
}
