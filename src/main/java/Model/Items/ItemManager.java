package main.java.Model.Items;

import main.java.Model.Tiles.IronMine;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {
    public List<Class> blueprintList = new ArrayList<>();

    private static ItemManager instance = new ItemManager();

    public static ItemManager getInstance() { return instance; }

    private ItemManager() {
        blueprintList.add(AlienPistol.class);
        blueprintList.add(IronMineCraft.class);
        blueprintList.add(NukeLauncher.class);
        blueprintList.add(Pistol.class);
        blueprintList.add(Rifle.class);
        blueprintList.add(Slingshot.class);
        blueprintList.add(Sword.class);
    }

    public void onTick() {
        for(Class item : blueprintList) {
            try {
                if (((Item) item.newInstance()).getBp() != null) {
                    System.out.println("Craftable");
                }
            } catch (Exception e){
                int tmp = 0;
            }

        }
    }
}
