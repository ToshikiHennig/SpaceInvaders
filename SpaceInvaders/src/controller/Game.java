package controller;
import javafx.scene.layout.Pane;
import modell.IGame;
import modell.IInvaderBlock;
import modell.IPlayer;

public class Game implements IGame{
	private IPlayer player = new Player();
	private IInvaderBlock invaders = new InvaderBlock();
	int minTime = 1500;
	int maxTime = 2000;
	
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
