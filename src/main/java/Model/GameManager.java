package main.java.Model;

import main.java.Model.Enemies.Enemy;
import main.java.Model.Enemies.EnemyManager;
import main.java.Model.Enemies.EnemyTypeEnum;
import main.java.Model.Items.ItemManager;
import main.java.Model.Tiles.*;
import main.java.View.GameScreen;

public class GameManager {

    private int time;
    private int date;
    private int temperature;
    private Player player;
    private ChatManager chatManager;
    private TileManager tm;
    private EnemyManager em;
    private BuildingManager bm;
    private ItemManager im;

    private boolean playersTurn;

    private static GameManager instance = new GameManager();

    private GameManager() {
        playersTurn = false;
        instance = this;
        time = 0;
        date = 0;
        temperature = -70;
        player = Player.getPlayer();
        chatManager = ChatManager.getInstance();
        tm = TileManager.getInstance();
        em = EnemyManager.getInstance();
        bm = BuildingManager.getInstance();
        im = ItemManager.getInstance();
        playersTurn = true;
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

    public TileManager getTileManager() { return tm;}

    public EnemyManager getEnemyManager() { return em;}

    public TileEnum getPlayerTileType() {
        return instance.tm.getTile(player.getLocX(),player.getLocY()).getTileType();
    }

    public int[] getPlayerLoc() {
        int[] tmp = new int[2];

        tmp[0] = player.getLocX();
        tmp[1] = player.getLocY();

        return tmp;
    }

    public void endOfTurnTick() {
        //When a player completes his turn it will call this
        em.onTick();
        bm.onTick();
        tm.getTile(getPlayer().getLocX(), getPlayer().getLocY()).effect();
        im.onTick();
        incrementTime();

        GameScreen.updateAllScreen();
    }

    public boolean isPlayersTurn() {
        return playersTurn;
    }

    public void setPlayersTurn(boolean state) {
        playersTurn = state;
    }
}
