package main.java.Model.Enemies;
import main.java.Model.GameManager;

import java.util.LinkedList;

public class EnemyManager {
    LinkedList<Enemy> enemies;

    private static EnemyManager instance = new EnemyManager();
    public static EnemyManager getInstance() { return instance; }

    private EnemyManager() {
        enemies = new LinkedList<Enemy>();
        spawn(EnemyTypeEnum.MARTIANDOG, 53, 52);
    }

    public void spawn(EnemyTypeEnum type, int locX, int locY ) {
        switch (type) {
            case MARTIANDOG : enemies.add(new MartianDog(locX,locY));
        }
    }

    public void onTick() {
        for (Enemy temp : enemies) {
            temp.onTick();
        }
    }


}
