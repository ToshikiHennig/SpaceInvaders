package modell;

import javafx.scene.Group;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public interface IGame{
	
	void startGame(Pane pane);
	
	void leftMovement();
	
	void rightMovement();
	
	void fire(Pane pane);
	
	void pause();
	
	void onhit();
	
	void mouseclickPause();
	
	void mouseclickExit();
	
	void mouseclickNewGame();
}
