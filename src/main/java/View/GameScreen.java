package main.java.View;

import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import main.java.Model.ChatManager;
import main.java.Model.GameManager;

public class GameScreen extends BorderPane {


    private static TopPanel topPanel;
    private static LeftPanel leftPanel;
    private static RightPanel rightPanel;
    private static MessageBox messageBox;
    private static MapView mapView;

    private static GameScreen instance;

    public GameScreen() {
        topPanel = new TopPanel();
        leftPanel = new LeftPanel();
        rightPanel = new RightPanel();
        messageBox = new MessageBox();
        mapView = new MapView();
        instance = this;
        setTop(topPanel.getRootNode());
        setLeft(leftPanel);
        setRight(rightPanel);
        setCenter(mapView);
        setBottom(messageBox);
        setMaxSize(700, 700);
        updateMessageBox();
    }

    public void updateAllScreen() {
        topPanel.update();
        leftPanel.update();
        rightPanel.updateInventory();
        rightPanel.updateOptionsBox();
        updateMessageBox();
    }

    public static void updateMessageBox() {
        messageBox.updateMessageBox();
    }
}
