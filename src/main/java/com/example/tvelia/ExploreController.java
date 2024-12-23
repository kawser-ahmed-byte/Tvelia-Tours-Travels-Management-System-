package com.example.tvelia;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ExploreController implements Initializable
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

    public void switchToLocation(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("location.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root, 1920, 1080));
        stage.show();
    }
    public void switchToTourGuide(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("tourGuideController.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root, 1920, 1080));
        stage.show();
    }

    public void switchToDashboard(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("dashBoard.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root, 1920, 1080));
        stage.show();
    }

    public void switchToBus(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("buOperator.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root, 1920, 1080));
        stage.show();
    }
    public void switchToShip(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("ship.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root, 1920, 1080));
        stage.show();
    }
    public void switchToAir(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("air.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root, 1920, 1080));
        stage.show();
    }
    public void switchToCarRental(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("car.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root, 1920, 1080));
        stage.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        closeWindow.setOnMouseClicked(event ->
//        {
//            System.exit(0);
//        });
    }
}
