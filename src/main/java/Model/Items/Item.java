package main.java.Model.Items;

public abstract class Item {
    private Blueprint bp = null;

    protected int weight;
    protected String name;


    public Item(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public Item() {
        onCraft();
        weight = 0;
        name = "";
    }

    public abstract void onCraft();

    public int getWeight() { return weight; }

    public String getName() { return name; }

    public Blueprint getBp() { return bp; }

    public void setBp(Blueprint bp) {
        this.bp = bp;
    }

}
