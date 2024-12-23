package com.example.tvelia;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class pane implements Initializable {

    @FXML
    private Pane pane;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("LoginClientForm.fxml"));
        pane.getChildren().add(root);
    }catch (Exception e){
        System.out.println(e);
    }
}
}