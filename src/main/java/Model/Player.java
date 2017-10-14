public class Player {
    int health;
    int temp;
    int thirst;
    int energy;

    int energyRate;

    int locX;
    int locY;

    public Player() {
        health = 100;
        temp = 70;
        thirst = 10;
        energy = 100;

        locX = 0;
        locY = 0;
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
}