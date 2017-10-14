package main.java.Runner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import main.java.Model.GameManager;
import main.java.View.GameScreen;

public class Runner extends Application {

    private static Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        primaryStage.setTitle("The Martian");
        GameScreen screen = new GameScreen();

        Scene scene = new Scene(screen, 900 , 1600);
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
        stage = primaryStage;
        GameManager.getInstance().getChatManager().addMessage("What", Color.BLACK);
        GameManager.getInstance().getChatManager().addMessage("is this!", Color.BLACK);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
