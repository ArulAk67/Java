package com.example.crmproject;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;

public class faqjava {

    @FXML
    private Button backb;
    @FXML
    private TextArea qlist;

    public void question(ActionEvent event) throws IOException{
        checkquestion();
    }
    public void back(ActionEvent event)throws IOException{
        goback();
    }
    private void checkquestion() throws IOException
    {
        String databaseName = "crm";
        String databaseUser = "root";
        String databasePassword = "arul";
        String url = "jdbc:mysql://localhost/" + databaseName;


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ignored) {

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
        ResultSet resultSet = null;
        try {
            assert statement != null;
            resultSet = statement.executeQuery("select * from crmtable");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        int i=0;
        while (true) {
            try {
                if (!resultSet.next()) break;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

            String S =" ";
            String l=" ";
            try {
                S=S+ ++i/*(resultSet.getString("id"))*/+"\t";
//                S=S+ (resultSet.getString("EmailID"))+"\t";
                S= "\t"+S+ (resultSet.getString("Issues"))+"\t ";
                // System.out.println(S);
                l=l+ S +"\n";
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            System.out.println(l);
            qlist.appendText(l);
        }


    }
    private void goback()throws IOException{

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("first.fxml"));
        Stage window = (Stage) backb.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(), 600, 400));

    }
}
