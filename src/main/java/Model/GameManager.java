package main.java.Model;

import main.java.Model.Enemies.Enemy;
import main.java.Model.Enemies.EnemyManager;
import main.java.Model.Tiles.TileManager;

public class GameManager {

    private int time;
    private int date;
    private int temperature;
    private Player player;
    private ChatManager chatManager;
    private TileManager tm = TileManager.getInstance();
    private EnemyManager em = EnemyManager.getInstance();

    private static GameManager instance = new GameManager();

    private GameManager() {
        instance = this;
        time = 0;
        date = 0;
        player = Player.getPlayer();
        chatManager = ChatManager.getInstance();

    }

    public static GameManager getInstance() {
        return instance;
    }

    public int getTime() {
        return time;
    }

    public int getDate() {
        return date;
    }

    public int getTemperature() {
        return temperature;
    }

    public Player getPlayer() { return player; }

    private void incrementTime() {
        if (++time % 24 == 0) {
            time = 0;
            date++;
        }
    }

    public ChatManager getChatManager() {
        return chatManager;
    }

    public void endOfTurnTick() {
        //When a player completes his turn it will call this

        em.onTick();
        tm.getTile(getPlayer().getLocX(), getPlayer().getLocY()).effect();
        incrementTime();
    }
}
