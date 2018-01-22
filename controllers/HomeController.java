package main.java.controllers;

import java.io.IOException;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Sample custom control hosting a text field and a button.
 */
public class HomeController extends VBox{
    @FXML private TextField textField;
    @FXML private Button continueButton;
	private Stage stage;
    
    public HomeController() {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("../FXMLs/Home.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        
        try {
            fxmlLoader.load();            
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
        
    //When user clicks on continue button
    @FXML
    protected void continueClicked() throws IOException {	
   
    	//Check whether user filled two text fields.
    	
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("../FXMLs/GamePlay.fxml"));
        GamePlayController gamePlayController = new GamePlayController("Anusha", "Abhilash");
        loader.setController(gamePlayController);
        Parent root = loader.load();
        continueButton.getScene().setRoot(root);
    }
}
