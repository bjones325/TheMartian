package main.java.Model.Items;

public abstract class Weapon extends Item {

    public int getDamage() { return damage; }

    public int getRange() { return range; }

    protected int damage;
    protected int range;


    public Weapon(int damage, int range, int weight, String name) {
        super(weight, name);
        this.damage = damage;
        this.range = range;
    }
}
