package controller;

import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import modell.ICombat;

public class Invader implements ICombat{
	InvaderRow invaderRow = new InvaderRow();
	private int lives;
	@Override
	public void shoot(Pane pane) {
		// TODO Auto-generated method stub
		
	}
	
	public void createInvader(){
		Image image = new Image("invader1.png");
		Rectangle invader = new Rectangle(50, 50);
		ImagePattern imagepattern = new ImagePattern(image);
		invader.setFill(imagepattern);
		invaderRow.addInvader(invader);
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
