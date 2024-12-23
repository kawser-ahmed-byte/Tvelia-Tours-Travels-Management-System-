package com.example.tvelia;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;

public class DBUtils
{
    public static void changeScene(ActionEvent event, String fxmlFile, String title, String username)
    {
        Parent root = null;

        if(username != null)
        {
            try {
                FXMLLoader loader = new FXMLLoader(DBUtils.class.getResource(fxmlFile));
                root = loader.load();
                DashboardController dashBoardController= loader.getController();
              //  dashBoardController.setUserInformation(username);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        else {
            try {
                root = FXMLLoader.load(DBUtils.class.getResource(fxmlFile));
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle(title);
        stage.setScene(new Scene(root));
        stage.show();
    }
    public static void signUpUser(ActionEvent event, String username, String password, String gender)
    {
        Connection connection = null;
        PreparedStatement psInsert = null;
        PreparedStatement psCheckUserExits = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_proj", "root", "kawsEr13@");
            psCheckUserExits = connection.prepareStatement("SELECT * FROM users WHERE username = ?");
            psCheckUserExits.setString(1, username);
            resultSet = psCheckUserExits.executeQuery();

            if(resultSet.isBeforeFirst())
            {
                System.out.println("User already exists.");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("You cannot use this username");
                alert.show();
            }
            else
            {
                psInsert=connection.prepareStatement("INSERT INTO users (username, password, gender) VALUES (?, ?, ?)");
                psInsert.setString(1, username);
                psInsert.setString(2, password);
                psInsert.setString(3, gender);
                psInsert.executeUpdate();
                changeScene(event, "dash.fxml", "Tvelia", null);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        } finally {
            if (resultSet!=null)
            {
                try {
                    resultSet.close();
                }catch (SQLException e)
                {
                    e.printStackTrace();
                }
            }
            if(psCheckUserExits != null)
            {
                try {
                    psCheckUserExits.close();
                }
                catch (SQLException e)
                {
                    e.printStackTrace();
                }
            }

            if(psInsert != null)
            {
                try {
                    psInsert.close();
                }catch (SQLException e)
                {
                    e.printStackTrace();
                }
            }

            if(connection != null)
            {
                try {
                    connection.close();
                }
                catch (SQLException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void submitUser(ActionEvent event, String date, String duration, String roomNo)
    {
        Connection connection = null;
        PreparedStatement psInsert = null;
        PreparedStatement psCheckUserExits = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_proj", "root", "kawsEr13@");
            psCheckUserExits = connection.prepareStatement("SELECT * FROM roominfo WHERE date = ?");
            psCheckUserExits.setString(1, date);
            resultSet = psCheckUserExits.executeQuery();

            if(resultSet.isBeforeFirst())
            {
                System.out.println("already booked.");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Please choose other days!");
                alert.show();
            }
            else
            {
                psInsert=connection.prepareStatement("INSERT INTO roominfo (date, duration, roomNo) VALUES (?, ?, ?)");
                psInsert.setString(1, date);
                psInsert.setString(2, duration);
                psInsert.setString(3, roomNo);
                psInsert.executeUpdate();
                changeScene(event, "payment.fxml", "Payment gateway", null);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        } finally {
            if (resultSet!=null)
            {
                try {
                    resultSet.close();
                }catch (SQLException e)
                {
                    e.printStackTrace();
                }
            }
            if(psCheckUserExits != null)
            {
                try {
                    psCheckUserExits.close();
                }
                catch (SQLException e)
                {
                    e.printStackTrace();
                }
            }

            if(psInsert != null)
            {
                try {
                    psInsert.close();
                }catch (SQLException e)
                {
                    e.printStackTrace();
                }
            }

            if(connection != null)
            {
                try {
                    connection.close();
                }
                catch (SQLException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }



    public static void logInUser(ActionEvent event, String username, String password)
    {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_proj", "root", "kawsEr13@");
            preparedStatement= connection.prepareStatement("SELECT password FROM  users WHERE username =?");
            preparedStatement.setString(1, username);
            resultSet=preparedStatement.executeQuery();

            if(!resultSet.isBeforeFirst()){
                System.out.println("user not found in the database!");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Provided info is not correct.");
                alert.show();
            }else {
                while (resultSet.next())
                {
                    String retrievePassword = resultSet.getString("password");
                    //String retrieveChannel = resultSet.getString("favChannel");
                    if(retrievePassword.equals(password))
                    {
                        changeScene(event, "dash.fxml", "Tvelia", null);
                    }else {
                        System.out.println("Pass did not matched");
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setContentText("Provided info is not correct.");
                        alert.show();
                    }
                }
            }
        }catch (SQLException e)
        {
            e.printStackTrace();
        } finally {
            if (resultSet!=null)
            {
                try {
                    resultSet.close();
                }catch (SQLException e)
                {
                    e.printStackTrace();
                }
            }
            if(preparedStatement != null)
            {
                try {
                    preparedStatement.close();
                }
                catch (SQLException e)
                {
                    e.printStackTrace();
                }
            }

            if(connection != null)
            {
                try {
                    connection.close();
                }
                catch (SQLException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
