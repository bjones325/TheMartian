package main.java.Model.Enemies;
import java.util.LinkedList;

public class EnemyManager {
    LinkedList<Enemy> enemies;

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
