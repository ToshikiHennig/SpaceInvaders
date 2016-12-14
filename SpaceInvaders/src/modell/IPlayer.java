package modell;

import javafx.scene.layout.Pane;

public interface IPlayer extends IMovement, ICombat{
		
	void shootRocket();
	
	void updateScore(int score);
	
	void createPlayer(Pane pane);
	
}
