package main.java.controllers;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BingoMainApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        HomeController homeController = new HomeController();
       // homeController.setText("Hello!");
        
        stage.setScene(new Scene(homeController));
        stage.setTitle("Welcome to bingo game");
        stage.setWidth(800);
        stage.setHeight(600);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}




