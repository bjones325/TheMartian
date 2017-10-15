package main.java.Model;

import javafx.scene.paint.Color;
import main.java.Model.Enemies.Enemy;
import main.java.Model.Enemies.EnemyManager;
import main.java.Model.Enemies.EnemyTypeEnum;
import main.java.Model.Items.ItemManager;
import main.java.Model.Tiles.*;
import main.java.View.GameScreen;

import static javax.print.attribute.standard.Chromaticity.COLOR;

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

    private Tile selectedTile;

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

        player.setThirst(player.getThirst() - 1);
        im.onTick();
        bm.onTick();
        tm.getTile(getPlayer().getLocX(), getPlayer().getLocY()).effect();
        em.onTick();

        checkPlayerStatus();
        incrementTime();

        GameScreen.updateAllScreen();
    }

    public boolean isPlayersTurn() {
        return playersTurn;
    }

    public void setPlayersTurn(boolean state) {
        playersTurn = state;
    }

    public boolean checkPlayerStatus() {
        if (player.getTemp() > 100) {
            player.setHealth(player.getHealth() - (player.getTemp() - 100) / 10);
            getChatManager().addMessage("Your suit is unbearably hot! Find a way to cool down or you will die", Color.RED);
        }

        if (player.getTemp() < 0) {
            player.setHealth(player.getHealth() + (player.getTemp() / 10));
            getChatManager().addMessage("Your suit is unbearably cool! Find a way to heat up or you will die", Color.RED);
        }

        if(player.getHealth() <= 0) {
            getChatManager().addMessage("You died of injury...", Color.RED);
            return false;
        }

        if(player.getThirst() < 0) {
            getChatManager().addMessage("You died of thirstation", Color.RED);
            return false;
        }

        return true;
    }

    public void setSelectedTile(Tile t) {
        selectedTile = t;
        GameScreen.updateAllScreen();
    }

    public Tile getSelectedTile() {
        return selectedTile;
    }
}
