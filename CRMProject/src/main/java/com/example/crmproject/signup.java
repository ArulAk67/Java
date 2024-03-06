package com.example.crmproject;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class signup {

    @FXML
    private TextField usernameTextField;

    @FXML
    private PasswordField passwordTextField;

    @FXML
    private Button signupb;
    @FXML
    private Button loginb;
    @FXML
    private Label labelm;

    public void signuponAction(ActionEvent e) throws Exception {
        if ( passwordTextField.getText().isEmpty() || usernameTextField.getText().isEmpty()) {
            labelm.setText("Please Enter a Your Details");
        }else {
            try {

                String databaseName = "crm";
                String databaseUser = "root";
                String databasePassword = "arul";
                String url = "jdbc:mysql://localhost/" + databaseName;

                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection con = DriverManager.getConnection(url, databaseUser, databasePassword);
                // databaseLink = DriverManager.getConnection(url,databaseUser,databasePassword);

                Statement statement = con.createStatement();
                // ResultSet queryResult = statement.executeQuery(verifyLogin);

                String verifyLogin = "INSERT INTO crm.details (Username,Password) VALUES ('" + usernameTextField.getText() + "','" + passwordTextField.getText() + "');";


                statement.executeUpdate(verifyLogin);

                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("first.fxml"));
                Stage window = (Stage) signupb.getScene().getWindow();
                window.setScene(new Scene(fxmlLoader.load(), 600, 400));
            } catch (Exception ae) {
                // MessageLabel.setText("Invalid Username");

//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.setContentText("Invalid Username!");
//            alert.show();
                labelm.setText("Invalid Username!");

            }
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("first.fxml"));
            Stage window = (Stage) signupb.getScene().getWindow();
            window.setScene(new Scene(fxmlLoader.load(), 600, 400));
        }
    }

    public void loginButtonOnAction(ActionEvent e) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Stage window = (Stage) loginb.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(), 600, 400));
    }
}
