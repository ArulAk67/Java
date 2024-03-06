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

public class complaint {
    @FXML
    private TextField mail;
    @FXML
    private TextField complaint;
    @FXML
    private Label label;
    @FXML
    private Button backbutton;
    @FXML
    private Button button;

    public void submitcomp(ActionEvent event) throws IOException
    {
        complaint();
    }

    public void backcomp(ActionEvent event)throws IOException{
        goback();
    }
    private void complaint() throws IOException{
        HelloApplication m = new HelloApplication();
        if(mail.getText().isEmpty() && complaint.getText().isEmpty())
        {
            label.setText("PLEASE ENTER A COMPLAINT AND MAILID");
        }
        else {
            label.setText("YOUR COMPLAINT HAS BEEN SENT");
            dbutils db = new dbutils();
            db.connect(mail.getText(),complaint.getText());

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
