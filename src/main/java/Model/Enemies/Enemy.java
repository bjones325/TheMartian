package main.java.Model.Enemies;

import main.java.Model.GameManager;
import main.java.Model.Occupant;
import main.java.Model.Tiles.Tile;
import main.java.Model.Tiles.TileEnum;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

import static java.lang.Math.abs;

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
        int playerX = GameManager.getInstance().getPlayer().getLocX();
        int playerY = GameManager.getInstance().getPlayer().getLocY();
        if ((abs(locX - playerX) == 1 && (locY - playerY) == 0)
                || (abs(locY - playerY) == 1) && locX - playerX == 0) {
            GameManager.getInstance().getPlayer().attackedBy(this);
        } else {
            this.move();
        }
    }


    public void move() {
        int speed = getMoveSpd();
        int playerX = GameManager.getInstance().getPlayer().getLocX();
        int playerY = GameManager.getInstance().getPlayer().getLocY();
        while (speed > 0) {
            System.out.println("move");
            PriorityQueue<StateInfo> open = new PriorityQueue<>();

            open.add(new StateInfo(1, 0, playerX, playerY));
            open.add(new StateInfo(-1, 0, playerX, playerY));
            open.add(new StateInfo(0, 1, playerX, playerY));
            open.add(new StateInfo(0, -1, playerX, playerY));

            StateInfo result = open.poll();
            Tile t = GameManager.getInstance().getTileManager().getTile(locX + result.dx, locY + result.dy);
            while (t.isOccupied() || t.getTileType().equals(TileEnum.MOUNTAIN)) {
                System.out.println("unavailable tile");
                if (open.isEmpty()) return;
                result = open.poll();
                t = GameManager.getInstance().getTileManager().getTile(locX + result.dx, locY + result.dy);
            }
            System.out.println(result.dx + "--" + result.dy + "--");
            GameManager.getInstance().getTileManager().getTile(locX, locY).setOccupant(null);
            locX += result.dx;
            locY += result.dy;
            t.setOccupant(this);
            speed--;
        }
    }

    private class StateInfo implements Comparable<StateInfo> {

        int dx;
        int dy;
        int distance;

        public StateInfo(int dx1, int dy1, int playerx, int playery) {
            dx = dx1;
            dy = dy1;
            distance = (int) (Math.pow(Math.abs(playerx-locX + dx), 2) + Math.pow(Math.abs(playery-locY + dy), 2));
            System.out.println("DX: " + dx + " DY: " + dy + " distance " + distance);
        }

        @Override
        public int compareTo(StateInfo other) {
            return other.distance - distance;
        }


    }



}