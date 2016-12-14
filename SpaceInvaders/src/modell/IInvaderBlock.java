package modell;

import javafx.scene.Group;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public interface IInvaderBlock extends IMovement{

	void moveDown();
	
	void createInvaderBlock(Pane pane);
	
	void timeRight();
	
	void timeLeft();
}
