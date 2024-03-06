package com.example.crmproject;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.PrimitiveIterator;

public class FIRSTJAVA {
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    public void launchfaq(ActionEvent event)throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("faq.fxml"));
        Stage window = (Stage) button1.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(), 600, 400));
    }
    public void launchquery(ActionEvent event)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("query.fxml"));
        Stage window = (Stage) button2.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(), 600, 400));
    }
    public void launchcomplaint(ActionEvent event)throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("complaint.fxml"));
        Stage window = (Stage) button3.getScene().getWindow();
        window.setScene(new Scene(fxmlLoader.load(), 600, 400));
    }
}
