package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import modell.IGame;
import modell.IPlayer;

public class GameController implements Initializable{
	
	@FXML
	private Pane gamePane;
	@FXML
	private VBox invaderLayout;
	@FXML
	private HBox invaderColumn1, invaderColumn2;
	@FXML
	private Group invaderGroup;
	
	private IGame game = new Game(); 

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		game.startGame(gamePane);
		gamePane.requestFocus();
		
	}
	
	@FXML
	private void move(KeyEvent event){
		switch(event.getCode()){
		case LEFT: game.leftMovement(); break;
		case RIGHT: game.rightMovement(); break;
		case SPACE: game.fire(gamePane); break;
		default: break;
		
		}
		
	}

}
