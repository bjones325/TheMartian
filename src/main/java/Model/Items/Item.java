package main.java.Model.Items;

public abstract class Item {
    public int getWeight() { return weight; }

    public String getName() { return name; }

    protected int weight;
    protected String name;

    public Item(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

}
