package main.java.Runner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import main.java.Model.GameManager;
import main.java.Model.Tiles.BuildingEnum;
import main.java.Model.Tiles.BuildingManager;
import main.java.View.GameScreen;

import java.io.File;
import java.nio.file.Paths;

public class Runner extends Application {

    private static Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("The Martian");
        GameScreen screen = new GameScreen();
        Scene scene = new Scene(screen, 800 , 700);
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
        stage = primaryStage;
        if (scene.getWidth() == 800 && scene.getHeight() == 700) {
            GameScreen splen = new GameScreen();
            scene = new Scene(splen, 810, 710);
            primaryStage.setResizable(false);
            primaryStage.setScene(scene);
            primaryStage.show();
            stage = primaryStage;
        }
        GameManager.getInstance().getChatManager().addMessage("You slowly open your eyes...", Color.BLACK);
        GameManager.getInstance().getChatManager().addMessage("Your head hurts and you remember nothing...", Color.BLACK);
        GameManager.getInstance().getChatManager().addMessage("You look around...", Color.BLACK);
        GameManager.getInstance().getChatManager().addMessage("And notice you're on the surface of Mars!", Color.BLACK);
        Media sound = new Media(Paths.get("Music.wav").toUri().toString());
        MediaPlayer mp = new MediaPlayer(sound);
        mp.play();

        scene.setOnKeyPressed(e -> {
            if (!GameManager.getInstance().isPlayersTurn()) return;
            if (e.getCode() == KeyCode.UP) {
                GameManager.getInstance().getPlayer().moveUp();
            } else if (e.getCode() == KeyCode.LEFT) {
                GameManager.getInstance().getPlayer().moveLeft();
            } else if (e.getCode() == KeyCode.RIGHT) {
                GameManager.getInstance().getPlayer().moveRight();
            }  else if (e.getCode() == KeyCode.DOWN) {
                GameManager.getInstance().getPlayer().moveDown();
            } else {
                return;
            }
            GameManager.getInstance().setPlayersTurn(false);
            GameManager.getInstance().endOfTurnTick();
            screen.updateAllScreen();
            GameManager.getInstance().setPlayersTurn(true);
        });
        System.out.println(scene.getWidth() + "--" + scene.getHeight());
    }




    public static void main(String[] args) {
        launch(args);
    }
}
