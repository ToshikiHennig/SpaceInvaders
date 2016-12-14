package controller;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import modell.ICombat;

public class Invader implements ICombat{
	InvaderRow invaderRow = new InvaderRow();
	Rectangle invader;
	Rectangle bomb;
	int invaderId = 0;
	private int lives;
	@Override
	public void shoot(Pane pane) {
		bomb = new Rectangle(50, 50);
		Image image = new Image("bomb.png");
		ImagePattern imagepattern = new ImagePattern(image);
		bomb.setFill(imagepattern);
		pane.getChildren().addAll(bomb);
		bomb.relocate(invader.getLayoutX() + 15, invader.getLayoutY() + 50);
		
	}
	
	
	public void createInvader(HBox invaderRow, Pane pane){
		Image image = new Image("invader1.png");
		invader = new Rectangle(70, 70);
		ImagePattern imagepattern = new ImagePattern(image);
		invader.setFill(imagepattern);
		invader.setId("" + invaderId);
		invaderRow.getChildren().addAll(invader);
		shoot(pane);
	}

	@Override
	public void hit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkIfLaserOnScreen(Pane pane) {
		// TODO Auto-generated method stub
		
	}


}
