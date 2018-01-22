package main.java.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

/**
 * Sample custom control hosting a text field and a button.
 */
public class GamePlayController implements Initializable{
   @FXML private Label playerName1;
   @FXML private Label playerName2;
   private final String playerName1Value;
   private final String playerName2Value;
   

    public GamePlayController(String playerName1Value, String playerName2Value) {
		super();
		//Setting both user names values 
		this.playerName1Value = playerName1Value;
		this.playerName2Value = playerName2Value;
		System.out.println("Setting players names values inside constructor: "+ this.playerName1Value +" "+ this.playerName2Value);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		//Setting Labels of both player names
		System.out.println("Setting players names label inside initializer: "+ getPlayerName1Value() + " "+ getPlayerName2Value());
		this.playerName1.setText(getPlayerName1Value());
		this.playerName2.setText(getPlayerName2Value());
	}
	
	/**
	 * Getters and setters starts here
	 * @return
	 */
	public String getPlayerName1Value() {
		return playerName1Value;
	}

	public String getPlayerName2Value() {
		return playerName2Value;
	}
}
