package com.example.tvelia;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SylhetController
{
    private Stage stage;
    private Scene scene;
    private Parent root;
    public void switchToSceneSingleRoom(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("single.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root, 1920, 1080));
        stage.show();
    }
    public void switchToSceneTwinRoom(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("twin.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root, 1920, 1080));
        stage.show();
    }
    public void switchToSceneStudioRoom(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("studio.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root, 1920, 1080));
        stage.show();
    }
    public void switchToSceneDeluxeRoom(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("deluxe.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root, 1920, 1080));
        stage.show();
    }
}
