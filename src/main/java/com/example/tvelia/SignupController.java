package com.example.tvelia;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SignupController implements Initializable
{
    @FXML
    private Button button_signup;
    @FXML
    private Button button_signin;
    @FXML
    private TextField tf_username;
    @FXML
    private TextField tf_mail;
    @FXML
    private TextField tf_password;
    @FXML
    private RadioButton rb_male;
    @FXML
    private RadioButton rb_female;

    @FXML
    private RadioButton rb_say;
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

    public void switchToSceneLogin(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        ToggleGroup toggleGroup = new ToggleGroup();
        rb_male.setToggleGroup(toggleGroup);
        rb_female.setToggleGroup(toggleGroup);
        rb_say.setToggleGroup(toggleGroup);
        rb_male.setSelected(true);

        button_signup.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event)
            {
                String toggleName = ((RadioButton) toggleGroup.getSelectedToggle()).getText();

                if(!tf_username.getText().trim().isEmpty() && !tf_password.getText().trim().isEmpty())
                {
                    DBUtils.signUpUser(event, tf_username.getText(), tf_password.getText(), toggleName);
                }else {
                    System.out.println("Please fill all info");
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText("Provided info is not correct.");
                    alert.show();
                }
            }
        });

//        button_signin.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event)
//            {
//                DBUtils.changeScene(event, "signIn.fxml", "Tvelia", null);
//            }
//        });
    }
}
