package com.example.tvelia;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        primaryStage.setTitle("Profile Settings");
//        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene( new Scene(root,1920, 1080));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}