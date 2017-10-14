package main.java.View;

import javafx.scene.layout.BorderPane;

public class GameScreen extends BorderPane {


    private static TopPanel topPanel;
    private static LeftPanel leftPanel;
    private static RightPanel rightPanel;
    private static MessageBox messageBox;

    private GameScreen instance;

    public GameScreen() {
        topPanel = new TopPanel();
        leftPanel = new LeftPanel();
        rightPanel = new RightPanel();
        messageBox = new MessageBox();
        instance = this;
        setTop(topPanel.getRootNode());
        setLeft(leftPanel);
        setRight(rightPanel);
        //setCenter(GridFX.getInstance());
        setBottom(messageBox.getChatBox());
        setMaxSize(700, 700);
    }
}
