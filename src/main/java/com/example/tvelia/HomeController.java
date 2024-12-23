package com.example.tvelia;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {
    public Button community;
    @FXML
    private ImageView closeWindow;
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
        public void switchToSceneLogIn(ActionEvent event) throws IOException
        {
            root = FXMLLoader.load(getClass().getResource("login.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root, 1920, 1080));
            stage.show();
        }
        public void switchToSceneSignUp(ActionEvent event) throws IOException
        {
            root = FXMLLoader.load(getClass().getResource("signup.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root, 1920, 1080));
            stage.show();
        }
        public void switchToSceneAbout(ActionEvent event) throws IOException
        {
            root = FXMLLoader.load(getClass().getResource("about.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root, 1920, 1080));
            stage.show();
        }
        public void switchToSceneBlog(ActionEvent event) throws IOException
        {
            root = FXMLLoader.load(getClass().getResource("blog.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root, 1920, 1080));
            stage.show();
        }
    public void switchToSceneExplore(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("explore.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root, 1920, 1080));
        stage.show();
    }
        public void switchToTour(ActionEvent event) throws IOException
        {
            root = FXMLLoader.load(getClass().getResource("tour.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root, 1920, 1080));
            stage.show();
        }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        closeWindow.setOnMouseClicked(event ->
        {
            System.exit(0);
        });
    }

    public void switchToCommunity(ActionEvent e) throws IOException {
        Parent source = FXMLLoader.load(getClass().getResource("pane.fxml"));
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        Scene scene = new Scene(source);
        stage.setScene(scene);
        stage.show();
    }
}