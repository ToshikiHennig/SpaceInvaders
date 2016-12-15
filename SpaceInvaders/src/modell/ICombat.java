package modell;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

public interface ICombat {

	void shoot(Pane pane);
	
	void checkIfLaserOnScreen(Pane pane);
	
	void hit();
	
	void destroy();
}
