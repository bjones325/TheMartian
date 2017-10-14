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

    private static final Player player = new Player();

    private Player() {
        health = 100;
        temp = 70;
        thirst = 10;
        energy = 100;

        locX = 0;
        locY = 0;

        inventory = new ArrayList<ItemStackObject>(20);
        inventory.add(new ItemStackObject(ItemEnum.IRON_ORE, 5));
    }

    public static Player getPlayer() {
        return player;
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
        GameManager.getInstance().endOfTurnTick();
    }

    public void moveDown() {
        locY--;
        energy = energy - energyRate;
        GameManager.getInstance().endOfTurnTick();
    }

    public void moveRight() {
        locX++;
        energy = energy - energyRate;
        GameManager.getInstance().endOfTurnTick();
    }

    public void moveLeft() {
        locY--;
        energy = energy - energyRate;
        GameManager.getInstance().endOfTurnTick();
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getEnergyRate() {
        return energyRate;
    }

    public void setEnergyRate(int energyRate) {
        this.energyRate = energyRate;
    }

    public void setLocX(int locX) {
        this.locX = locX;
    }

    public void setLocY(int locY) {
        this.locY = locY;
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