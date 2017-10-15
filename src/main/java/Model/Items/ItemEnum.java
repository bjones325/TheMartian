package main.java.Model.Items;

public enum ItemEnum {
    IRON_ORE(IronOre.class),
    BUCKET(null),
    ALIEN_PISTOL(AlienPistol.class),
    NUKE_LAUNCHER(NukeLauncher.class),
    PISTOL(Pistol.class),
    RIFLE(Rifle.class),
    SLINGSHOT(Slingshot.class),
    SWORD(Sword.class),
    IRON_MINE_CRAFT(IronMineCraft.class),
    STONE(IronOre.class);

    private Class itemClass;

    ItemEnum(Class itemClass) {
        this.itemClass = itemClass;
    }

}
