package main.java.Model.Enemies;

public abstract class Enemy {
    int moveSpd;
    int attack;
    String type;
    String image;
    int locX;
    int locY;
    int health;

    public Enemy(locX,locY) {
        this.locX = locX;
        this.locY = locY;
    }

  /*  public void move() {
        //Placeholder move()
        int playerX = Player.getLocX();
        int playerY = Player.getLockY();

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

    } */


}