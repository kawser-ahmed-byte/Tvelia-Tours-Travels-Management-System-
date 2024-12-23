package com.example.tvelia;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LocationController
{
    private Stage stage;
    private Scene scene;
    private Parent root;
    public void switchToSceneHome(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("home.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
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

    public void switchToSceneCox(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("ctg.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root, 1920, 1080));
        stage.show();
    }
    public void switchToSceneDhaka(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("dhaka.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root, 1920, 1080));
        stage.show();
    }
    public void switchToSceneCTG(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("cox.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root, 1920, 1080));
        stage.show();
    }
    public void switchToSceneRangamati(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("rangamati.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root, 1920, 1080));
        stage.show();
    }
    public void switchToSceneSylhet(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("sylhet.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root, 1920, 1080));
        stage.show();
    }
}
