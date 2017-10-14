package main.java.View;

import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class MessageBox extends VBox {
    private static Label[] messages = new Label[5];
    private static int numElements = 0;
    private static VBox chatBox;

    public MessageBox() {
        chatBox = new VBox();
        chatBox.setPrefSize(100, 300);
        addMessage(" ", null, false);
        addMessage("You crash land on Mars...",
                Color.BLACK, false);
        addMessage("You wake up with no memory.",
                Color.BLACK, false);
    }

    public void addMessage(String s, Color c, boolean format) {
        if (format) {
            s = formatString(s);
        }
        Label l = new Label(s);
        l.setTextFill(c);
        l.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        if (numElements  == 5) {
            for (int i = 0; i < 4; i++) {
                messages[i] = messages[i + 1];
            }
            messages[4] = l;
        } else {
            for (int i = 0; i < 5; i++) {
                if (messages[i] == null) {
                    messages[i] = l;
                    break;
                }
            }
            numElements++;
        }
        updateChatBox();
    }

    public void clearMessages() {
        for (int i = 0; i < 5; i++) {
            messages[i] = null;
        }
        chatBox.getChildren().clear();
        numElements = 0;
    }

    public StackPane getChatBox() {
        StackPane sp = new StackPane();
        sp.getChildren().add(chatBox);
        return sp;
    }

    public void updateChatBox() {
        chatBox.getChildren().clear();
        for (int i = 0; i < 5; i++) {
            if (messages[i] != null) {
                Label l = messages[i];
                l.setOpacity((i / 5.0) + 0.2);
                chatBox.getChildren().add(l);
            }
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
