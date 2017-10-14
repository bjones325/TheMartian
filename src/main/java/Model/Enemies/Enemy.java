package main.java.Model.Enemies;

import main.java.Model.GameManager;
import main.java.Model.Occupant;

public abstract class Enemy extends Occupant {
    public int getLocX() {
        return locX;
    }

    public int getLocY() {
        return locY;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public int getMoveSpd() {
        return moveSpd;
    }

    public int getAttack() {
        return attack;
    }

    protected int moveSpd;
    protected int attack;
    EnemyTypeEnum type;
    String image;
    protected int locX;
    protected int locY;
    protected int health;
    protected String name;

    public Enemy(int locX,int locY) {
        this.locX = locX;
        this.locY = locY;
    }

    public Enemy() {
        locX = 0;
        locY = 0;
    }

    public void onTick() {
        this.move();
    }

    public void move() {

    }


}