package modell;

import javafx.scene.layout.Pane;

public interface ICombat {

	void shoot(Pane pane);
	
	void checkIfLaserOnScreen(Pane pane);
	
	void hit();
	
	void destroy();
}
