package main.java.Model.Items;

public abstract class Item {
    public int getWeight() { return weight; }

    public String getName() { return name; }

    public Blueprint getBp() {
        return bp;
    }

    public void setBp(Blueprint bp) {
        this.bp = bp;
    }

    public Blueprint bp;

    protected int weight;
    protected String name;

    public Item(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public Item() {
        weight = -1;
        name = "";
    }

    public abstract void onCraft();

}
