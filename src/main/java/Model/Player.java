package main.java.Model;

import main.java.Model.Items.Item;
import javafx.scene.paint.Color;
import main.java.Model.Items.ItemEnum;
import main.java.Model.Items.ItemStackObject;

import java.util.ArrayList;

public class Player {

    private int health;
    private int temp;
    private int thirst;
    private int energy;

    private int energyRate;

    private int locX;
    private int locY;
    private ArrayList<ItemStackObject> inventory;

    private static final Player player = new Player();

    private Player() {
        health = 100;
        temp = 70;
        thirst = 10;
        energy = 100;

        locX = 50;
        locY = 50;

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

    private boolean validMove(int x, int y) {
        if (GameManager.getInstance().getTileManager().getTile(x, y).isOccupied()) {
            GameManager.getInstance().getChatManager().addMessage("It seems this tile is occupied...", Color.RED);
            return false;
        }
        return true;
    }

    public boolean moveUp() {
        if (locY == 0) return false;
        if (!validMove(locX, locY - 1)) return false;
        locY--;
        energy -= energyRate;
        return true;
    }

    public boolean moveDown() {
        if (locY == GameManager.getInstance().getTileManager().getWidthHeight() - 1) return false;
        if (!validMove(locX, locY + 1)) return false;
        locY++;
        energy -= energyRate;
        return true;
    }

    public boolean moveRight() {
        if (locX == GameManager.getInstance().getTileManager().getWidthHeight() - 1) return false;
        if (!validMove(locX + 1, locY)) return false;
        locX++;
        energy -= energyRate;
        return true;
    }

    public boolean moveLeft() {
        if (locX == 0) return false;
        if (!validMove(locX -1, locY)) return false;
        locX--;
        energy -= energyRate;
        return true;
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

    public boolean hasItemNum(int num, ItemEnum type) {
        //Checks if player has certain amount of certain item (used for blueprints)
        for (ItemStackObject temp:inventory) {
            if (temp.get_obj()==type && temp.get_amount() >= num) {
                return true;
            }
        }
        return false;
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

    public ArrayList<ItemStackObject> getInventory() {
        return inventory;
    }
}