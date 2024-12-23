package com.example.tvelia;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GuideBook
{
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToSceneHome(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root, 1920, 1080));
        stage.show();
    }
}
