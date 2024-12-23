package com.example.tvelia;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HotelController
{

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToHotel(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("hotel.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(new Scene(root, 1920,3024));
        stage.show();
    }
}
