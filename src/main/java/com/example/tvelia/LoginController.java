package com.example.tvelia;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable
{
    @FXML
    private Button button_login;
    @FXML
    private Button button_signup;

    @FXML
    private TextField tf_username;

    @FXML
    private TextField tf_password;
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToSceneHome(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToSceneSignUp(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("signup.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        button_login.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                DBUtils.logInUser(event, tf_username.getText(), tf_password.getText());
            }
        });
//        button_signup.setOnAction(new EventHandler<ActionEvent>()
//        {
//            @Override
//            public void handle(ActionEvent event) {
//                DBUtils.changeScene(event, "signup.fxml", "Tvelia", null);
//            }
//        });
    }
}
