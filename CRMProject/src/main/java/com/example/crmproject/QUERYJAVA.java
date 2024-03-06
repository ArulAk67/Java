package com.example.crmproject;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class QUERYJAVA {

    @FXML
    private TextField mail;
    @FXML
    private TextField query;
    @FXML
    private Label label;
    @FXML
    private Button backbutton;
    @FXML
    private Button button;


    public void submitquery(ActionEvent event) throws IOException
    {
        query();
    }
    public void backquery(ActionEvent event)throws IOException{
        goback();
    }
    private void query() throws IOException{
        HelloApplication m = new HelloApplication();
        if(mail.getText().isEmpty() && query.getText().isEmpty())
        {
            label.setText("PLEASE ENTER A QUERY AND MAILID");
        }
        else {
            //label.setText("YOUR QUERY HAS BEEN SENT");
            dbutils db = new dbutils();
            db.connect(mail.getText(),query.getText());

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("alert.fxml"));
            Stage window = (Stage) button.getScene().getWindow();
            window.setScene(new Scene(fxmlLoader.load(), 600, 400));
        }
    }
    private void goback()throws IOException{

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("first.fxml"));
        Stage window = (Stage) backbutton.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(), 600, 400));

    }
}
