package main.java.Model.Items;

import main.java.Model.Tiles.IronMine;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {
    public List<Class> blueprintList = new ArrayList<>();

    private static ItemManager instance = new ItemManager();

    public static ItemManager getInstance() { return instance; }

    private List<String> craftableList = new ArrayList<>();

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
        craftableList.clear();
        for(Class item : blueprintList) {
            try {
                Item tmp = (Item) item.newInstance();
                if (tmp.getBp() != null && tmp.getBp().buildable() == true) {
                    craftableList.add(item.toString().substring(28));
                }
            } catch (Exception e){
                System.out.println("ERROR: Trying to find " + item.toString());
            }

        }
    }

    public List<String> getCraftableList() {
        return craftableList;
    }
}
