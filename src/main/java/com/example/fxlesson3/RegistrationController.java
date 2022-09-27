package com.example.fxlesson3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class RegistrationController {
    @FXML
    TextField nameTextField, surnameTextField, groupTextField, classroomTextField, emailTextField, phonenumberTextField;
    @FXML
    Button cancelButton, registerButton;

    public void cancelButtonClicked(ActionEvent event){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("login.fxml"));
            Scene scene = new Scene(fxmlLoader.load(),600, 400);
            Stage stage = new Stage();
            stage.setTitle("Login  form");
            stage.setScene(scene);
            stage.show();
            ((Node)(event.getSource())).getScene().getWindow().hide();
        }catch (IOException e){
            System.out.println(e.toString());
        }
    }


    public void registerButtonClicked(ActionEvent event){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Welcomepage.fxml"));
            Scene scene = new Scene(fxmlLoader.load(),600, 400);
            Stage stage = new Stage();
            stage.setTitle("Welcome page");
            stage.setScene(scene);
            stage.show();
            ((Node)(event.getSource())).getScene().getWindow().hide();
        }catch (IOException e){
            System.out.println(e.toString());
        }
    }
}