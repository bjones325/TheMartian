package main.java.Model;

public class GameManager {

    private int time;
    private int date;
    private int temperature;

    private Player player;

    private static GameManager instance = new GameManager();

    private GameManager() {
        instance = this;
        time = 0;
        date = 0;
        player = new Player();
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

    public void incrementTime() {
        if (++time % 24 == 0) {
            time = 0;
            date++;
        }
    }

    public Player getPlayer() {
        return player;
    }
}
