package main.java.Model;

import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import main.java.View.GameScreen;
import main.java.View.MessageBox;

import java.util.LinkedList;
import java.util.Queue;

public class ChatManager {

    private LinkedList<Label> chatQueue;

    private static ChatManager instance = new ChatManager();

    private ChatManager() {
        instance = this;
        chatQueue = new LinkedList<Label>();
    }

    public void addMessage(String msg, Color c) {
        Label l = new Label(msg);
        l.setTextFill(c);
        l.setFont(Font.font("Agency FB", FontWeight.NORMAL, 15));
        chatQueue.add(l);
        if (chatQueue.size() > 5) {
            chatQueue.removeLast();
        }
        GameScreen.updateMessageBox();
    }

    public LinkedList<Label> getChatQueue() {
        return chatQueue;
    }

    public static ChatManager getInstance() {
        return instance;
    }
}
