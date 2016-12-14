package controller;

import java.util.concurrent.ThreadLocalRandom;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.util.Duration;
import modell.IGame;
import modell.IInvaderBlock;
import modell.IPlayer;

public class Game implements IGame{
	private IPlayer player = new Player();
	private IInvaderBlock invaders = new InvaderBlock();
	int minTime = 1500;
	int maxTime = 2000;
	int random = ThreadLocalRandom.current().nextInt(minTime, maxTime + 1);
	@Override
	public void startGame(Pane pane) {
		player.createPlayer(pane);
		invaders.createInvaderBlock(pane);
		invaders.timeRight();
		
		
	}

	@Override
	public void leftMovement() {
		player.moveLeft();
		
	}

	@Override
	public void rightMovement() {
		player.moveRight();
		
	}

	@Override
	public void fire(Pane pane) {
		player.shoot(pane);
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onhit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseclickPause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseclickExit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseclickNewGame() {
		// TODO Auto-generated method stub
		
	}


}
