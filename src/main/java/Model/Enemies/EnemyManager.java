package main.java.Model.Enemies;
import main.java.Model.GameManager;

import java.util.LinkedList;
import java.util.Random;

public class EnemyManager {
    LinkedList<Enemy> enemies;

    private static EnemyManager instance = new EnemyManager();
    public static EnemyManager getInstance() { return instance; }

    private EnemyManager() {
        enemies = new LinkedList<Enemy>();
        spawn(EnemyTypeEnum.MARTIAN_DOG, 53, 52);
    }

    public void spawn(EnemyTypeEnum type, int locX, int locY ) {
        switch (type) {
            case MARTIAN_DOG :
                enemies.add(new MartianDog(locX,locY));
                break;
            case ASTRONAUT :
                enemies.add(new Astronaut(locX,locY));
                break;
            case MYSTERIOUS_BLOB :
                enemies.add(new MysteriousBlob(locX,locY));
                break;
            case ALIEN :
                enemies.add(new Alien(locX,locY));
                break;
        }
        GameManager.getInstance().getTileManager().getTile(locX, locY).setOccupant(enemies.getLast());
    }

    public void onTick() {
        for (Enemy temp : enemies) {
            temp.onTick();
        }
        spawnNewEnemies();
    }

    private void spawnNewEnemies() {
        double day = GameManager.getInstance().getDate();
        double time = GameManager.getInstance().getTime();

        double chance = 0;

        if (day < 3) return;
        chance += day * .02;
        chance *= (12 - time) / -15;

        System.out.println("Spawn Chance:" + chance);
        while (chance > 0) {
            chance--;
            Random r = new Random();
            EnemyTypeEnum et = EnemyTypeEnum.values()[r.nextInt(EnemyTypeEnum.values().length)];
            int x = -1;
            int y = -1;
            int max = GameManager.getInstance().getTileManager().getWidthHeight();
            while (x < 0 || y < 0 || x > max - 1 || y > max - 1 || GameManager.getInstance().getTileManager().getTile(x, y).isOccupied()) {
                if (r.nextInt(2) == 0) {
                    x = r.nextInt(10) + 5 + GameManager.getInstance().getPlayer().getLocX();
                } else {
                    x = - r.nextInt(10) - 5 + GameManager.getInstance().getPlayer().getLocX();
                }
                if (r.nextInt(2) == 0) {
                    y = r.nextInt(10) + 5 + GameManager.getInstance().getPlayer().getLocY();
                } else {
                    y = - r.nextInt(10) - 5 + GameManager.getInstance().getPlayer().getLocY();
                }
             }
            spawn(et, x, y);
        }
    }


}
