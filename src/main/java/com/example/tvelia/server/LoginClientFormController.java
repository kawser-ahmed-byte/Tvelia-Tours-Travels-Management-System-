package com.example.tvelia.server;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.atomic.AtomicReference;
public class LoginClientFormController {

    public AnchorPane root;
    public Button btnLogin;
    public TextField txtUsername;

    public static String username;

    public void loginOnAction(KeyEvent keyEvent) throws IOException {
        if (keyEvent.getCode() == KeyCode.ENTER){
            ActionEvent mouseevent = null;
            loginToChatRoomOnAction(mouseevent);
        }
    }

    public void loginToChatRoomOnAction(ActionEvent actionEvent) throws IOException {

        username = txtUsername.getText();
        loadChat();

    }

    private void loadChat() throws IOException {
        //URL resource = this.getClass().getResource("src/main/java/com/example/tvelia/server/ClientForm.fxml");

        URL url = new File("src/main/java/com/example/tvelia/server/ClientForm.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(url);
        Scene scene2 = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setTitle("Tvelia Community Chat");
        stage2.setScene(scene2);
        enableMove(scene2,stage2);
        stage2.show();
    }

    private void enableMove(Scene scene, Stage stage) {
        AtomicReference<Double> xOffset = new AtomicReference<>((double) 0);
        AtomicReference<Double> yOffset = new AtomicReference<>((double) 0);
        scene.setOnMousePressed(event -> {
            xOffset.set(stage.getX() - event.getScreenX());
            yOffset.set(stage.getY() - event.getScreenY());
        });
        //Lambda mouse event handler
        scene.setOnMouseDragged(event -> {
            stage.setX(event.getScreenX() + xOffset.get());
            stage.setY(event.getScreenY() + yOffset.get());
        });
    }
}
