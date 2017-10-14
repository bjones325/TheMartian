package main.java.Model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private int health;
    private int temp;
    private int thirst;
    private int energy;

    private int energyRate;

    private int locX;
    private int locY;

    private List<ItemStackObject> inventory;

    public Player() {
        health = 100;
        temp = 70;
        thirst = 10;
        energy = 100;

        locX = 0;
        locY = 0;

        inventory = new ArrayList<ItemStackObject>(20);
        inventory.add(new ItemStackObject(ItemEnum.IRON_ORE, 5));
    }

    public int getLocX() {
        return locX;
    }

    public int getLocY() {
        return locY;
    }

    public void moveUp() {
        locY++;
        energy = energy - energyRate;
    }

    public void moveDown() {
        locY--;
        energy = energy - energyRate;
    }

    public void moveRight() {
        locX++;
        energy = energy - energyRate;
    }

    public void moveLeft() {
        locY--;
        energy = energy - energyRate;
    }

    private boolean getObject(ItemEnum kind, int amount) {
        //If we already have that item in inventory just increment it
        for (ItemStackObject item : inventory) {
            if (item.get_obj().equals(kind)) {
                item.increment_amount(amount);
                return true;
            }
        }

        //Otherwise make it and add it into the inventory
        ItemStackObject tmp = new ItemStackObject(kind, amount);

        inventory.add(tmp);

        return true;
    }
}