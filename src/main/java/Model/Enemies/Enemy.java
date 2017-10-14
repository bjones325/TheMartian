package main.java.Model.Enemies;

import main.java.Model.GameManager;

public abstract class Enemy {
    int moveSpd;
    int attack;
    EnemyTypeEnum type;
    String image;
    int locX;
    int locY;
    int health;

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