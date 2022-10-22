package com.example.new_project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle ;
import javafx.scene.shape.Line ;
import javafx.scene.shape.Polygon ;
import javafx.scene.shape . Rectangle ;
import javafx.scene.text . Font ;
import javafx.scene.text.Text ;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        Scene scene = new Scene(root,600,600,Color.rgb(38, 50, 56));
        Image icon = new Image(getClass().getResourceAsStream("/C:\\Users\\25194\\IdeaProjects\\New_Project\\src\\main\\resources\\logo-Resize.png"));
        stage.getIcons().add(icon);
        stage.setFullScreen(false);
        stage.setTitle("DEEZ");

        Text text = new Text();
        text.setText("Welcome Human");
        text.setX(100);
        text.setY(75);
        text.setFont(Font.font("Poppins",30));
        text.setFill(Color.WHITESMOKE);

        Image image = new Image(getClass().getResourceAsStream("File: /resources/logo-Resize.png"));
        ImageView imageView = new ImageView(image);
        imageView.setX(200);
        imageView.setY(250);

        root.getChildren().add(text);
        root.getChildren().add(imageView);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        launch();
    }
}