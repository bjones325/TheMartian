package main.java.Model.Items;

public abstract class Blueprint extends Item {
    public boolean buildable;

    public Blueprint(String name) {
        super(0,name);
    }
}
