package main.java.View;

import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import main.java.Model.GameManager;

import java.util.LinkedList;

public class MessageBox extends VBox {

    public void updateMessageBox() {
        getChildren().clear();
        LinkedList<Label> chatQueue = GameManager.getInstance().getChatManager().getChatQueue();
        int i = 0;
        for (Label l : chatQueue) {
            //l.setOpacity((i / 5.0) + 0.2);
            getChildren().add(l);
            i++;
        }
    }

    public static String formatString(String s) {
        String newString = "";
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (i != 0 && Character.isUpperCase(c)
                    && s.charAt(i - 1) != ' '
                    && !(Character.isUpperCase(s.charAt(i - 1)))) {
                newString += " ";
            }
            newString += c;
        }
        return newString;
    }
}
