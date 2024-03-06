package com.example.crmproject;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class login {

    @FXML
    private Button login;
    @FXML
    private TextField passwordTextField;
    @FXML
    private Label label;
    @FXML
    private Button signupb1;

    @FXML
    private TextField usernameTextField;


    public void loginbuttonOnAction(ActionEvent event)throws IOException{
        HelloApplication m = new HelloApplication();
        if ( passwordTextField.getText().isEmpty()) {
            label.setText("Please Enter a Your Details");
        }
        else if ((passwordTextField.getText().toString().equals("admin"))) {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("admin.fxml"));
            Stage window = (Stage) login.getScene().getWindow();
            window.setScene(new Scene(fxmlLoader.load(), 600, 400));
        } else {

            DatabaseConnection connectNow = new DatabaseConnection();
            Connection connectDB = connectNow.getConnection();

            String verifyLogin = "SELECT count(1) FROM crm.details WHERE Username = '" + usernameTextField.getText() + "' AND Password = '" + passwordTextField.getText() + "'";
            try {
                Statement statement = connectDB.createStatement();
                ResultSet queryResult = statement.executeQuery(verifyLogin);

                while (queryResult.next()) {
                    if (queryResult.getInt(1) == 1) {
                        //loginMessageLabel.setText("Welcome");
                        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("first.fxml"));
                        Stage window = (Stage) login.getScene().getWindow();
                        window.setScene(new Scene(fxmlLoader.load(), 600, 400));
                    } else {
                        label.setText("Please enter the correct username and password!");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
    public void signupbutton1(ActionEvent event) throws IOException{
        HelloApplication m = new HelloApplication();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("signup.fxml"));
        Stage window = (Stage) signupb1.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(), 600, 400));
    }

}
