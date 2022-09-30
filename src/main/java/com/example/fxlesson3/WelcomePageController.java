package com.example.fxlesson3;


import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class WelcomePageController implements Initializable {

    @FXML
    private ImageView Exit;
    Stage stage = null;
    @FXML
    private Label Menu2;

    @FXML
    private AnchorPane AnchorPane;
    @FXML
    private Label Menu1;

    @FXML
    private AnchorPane Anchoslider;

    @FXML
    private AnchorPane panee;



    @Override
    public void initialize(URL location, ResourceBundle resources) {

        Exit.setOnMouseClicked(event -> {
            System.exit(0);
        });
        Anchoslider.setTranslateX(-176);






        Menu2.setOnMouseClicked(event -> {
            TranslateTransition slide = new TranslateTransition();
            slide.setDuration(Duration.seconds(0.4));
            slide.setNode(Anchoslider);

            slide.setToX(0);
            slide.play();

            Anchoslider.setTranslateX(-176);

            slide.setOnFinished((ActionEvent e) -> {
                Menu2.setVisible(false);
                Menu1.setVisible(true);
            });
        });




        Menu1.setOnMouseClicked(event -> {
            TranslateTransition slide = new TranslateTransition();
            slide.setDuration(Duration.seconds(0.4));
            slide.setNode(Anchoslider);

            slide.setToX(-176);
            slide.play();

            Anchoslider.setTranslateX(0);

            slide.setOnFinished((ActionEvent e) -> {
                Menu2.setVisible(true);
                Menu1.setVisible(false);
            });
        });
    }





    @FXML
    private  void showDashboard(ActionEvent event) throws IOException{

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("dashboard.fxml"));

        try {
            Pane registerPane = fxmlLoader.load();
            panee.getChildren().clear();
            panee.getChildren().add(registerPane);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    private  void showAdd(ActionEvent event) throws IOException{

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("add.fxml"));

        try {
            Pane registerPane = fxmlLoader.load();
            panee.getChildren().clear();
            panee.getChildren().add(registerPane);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @FXML
    private  void showReport(ActionEvent event) throws IOException{

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("report.fxml"));

        try {
            Pane registerPane = fxmlLoader.load();
            panee.getChildren().clear();
            panee.getChildren().add(registerPane);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    private  void showBackup(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BackUp.fxml"));

        try {
            Pane registerPane = fxmlLoader.load();
            panee.getChildren().clear();
            panee.getChildren().add(registerPane);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}