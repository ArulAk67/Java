package com.example.crmproject;




import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import org.w3c.dom.events.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.PrimitiveIterator;
import java.util.ResourceBundle;
import java.sql.DriverManager;
public class dbutils {
    @FXML
    private Button submit;
    @FXML
    private TextField name;
    @FXML
    private TextField dpt;
    @FXML
    private TextField date;
    @FXML
    private TextField time;
    @FXML
    private TextField reason;
    @FXML
    private TextField venue;
    @FXML
    private TextField advisor;
    @FXML
    private TextField rollno;
    String databaseName = "crm";
    String databaseUser = "root";
    String databasePassword = "arul";
    String url = "jdbc:mysql://localhost/" + databaseName;


    public void connect(String mail,String issue)  {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {

        }
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, databaseUser, databasePassword);
        } catch (SQLException e) {
            System.out.println(e);
        }


        Statement statement = null;
        try {
            assert con != null;
            statement = con.createStatement();
        } catch (SQLException e) {

        }
        try {
            String details = "INSERT INTO crm.crmtable (EmailID,Issues)VALUES('"+mail+"','"+issue+"') ;";
            System.out.println(details);
            assert statement != null;
            statement.executeUpdate(details);
        } catch (SQLException e) {

        }


        System.out.println(mail);
        System.out.println(issue);




    }
}

