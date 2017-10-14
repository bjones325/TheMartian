package main.java.View;

import javafx.scene.layout.BorderPane;

public class GameScreen extends BorderPane {


    private static TopPanel topPanel;
    private static LeftPanel leftPanel;
    //private static RightPanel rightPanel;
    //private static MessageBox messageBox;

    private GameScreen instance;

    public GameScreen() {
        topPanel = new TopPanel();
        leftPanel = new LeftPanel();
        instance = this;
        setTop(topPanel.getRootNode());
        setLeft(leftPanel);
        //setCenter(GridFX.getInstance());
        //setBottom(cb.getChatBox());
        setMaxSize(700, 700);
        System.out.println();
    }
}
