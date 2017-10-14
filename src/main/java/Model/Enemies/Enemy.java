package main.java.Model.Enemies;

import main.java.Model.GameManager;

public abstract class Enemy {
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

    private int moveSpd;
    private int attack;
    EnemyTypeEnum type;
    String image;
    private int locX;
    private int locY;
    private int health;
    private String name;

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
        //Placeholder move()
        int playerX = GameManager.getInstance().getPlayer().getLocX();
        int playerY = GameManager.getInstance().getPlayer().getLocY();

        int diffX = locX - playerX;
        int diffY = locY - playerY;

        if (diffX > diffY) {
            if (diffX > 0) {
                locX--;
            } else if (diffX < 0) {
                locX++;
            }

        } else if (diffY > diffX) {
            if (diffY > 0) {
                locY--;
            } else if (diffY < 0) {
                locY++;
            }
        } else {
            if (diffY > 0) {
                locY--;
            } else if (diffY < 0) {
                locY++;
            }
        }

    }


}