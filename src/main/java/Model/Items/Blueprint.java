package main.java.Model.Items;

public abstract class Blueprint {
    public abstract boolean buildable();
    String name;

    public Blueprint(String name) {
        this.name = name;
    }
}
