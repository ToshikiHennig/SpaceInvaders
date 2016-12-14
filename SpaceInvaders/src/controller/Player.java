package controller;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
import modell.IPlayer;

public class Player implements IPlayer{
	private boolean laserOnScreen = false;
	private Rectangle player = new Rectangle(100, 100);
	private int score;
	@Override
	public void moveLeft() {
		if(player.getLayoutX() > 0){
			player.setLayoutX(player.getLayoutX() - 10);
		}else{
			return;
		}
		
	}

	@Override
	public void moveRight() {
		if(player.getLayoutX() < 910){
			player.setLayoutX(player.getLayoutX() + 10);
		}
		else{
			return;
		}
	
	}

	@Override
	public void edge() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void shoot(Pane pane) {
			Rectangle laser = new Rectangle(5, 10);
			laser.setFill(Color.RED);
			pane.getChildren().add(laser);
			laser.relocate(player.getLayoutX() + 48, (pane.getPrefHeight() - 100));
			Timeline timeline = new Timeline(new KeyFrame(
			        Duration.millis(2),
			        ae -> laser.setLayoutY(laser.getLayoutY() - 1)));
			timeline.setCycleCount(Animation.INDEFINITE);
			timeline.play();
//			laserOnScreen = true;

	
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
	public void shootRocket() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateScore(int score) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createPlayer(Pane pane) {
		Image image = new Image("spaceship.png");
		ImagePattern imagepattern = new ImagePattern(image);
		player.setFill(imagepattern);
		pane.getChildren().add(player);
		player.relocate((pane.getPrefWidth() / 2), (pane.getPrefHeight() - 100));
		
		
	}

	@Override
	public void checkIfLaserOnScreen(Pane pane) {

		
	}

}
