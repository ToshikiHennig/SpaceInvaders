package controller;

import java.util.ArrayList;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.geometry.Bounds;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.util.Duration;
import modell.ICombat;

public class Invader implements ICombat{
	boolean collisionDetected = false;
	InvaderRow invaderRow = new InvaderRow();
	Rectangle invader;
	Rectangle bomb;
	Timeline timeline;
	Player player = new Player();
	private boolean bombOnField = false;
	ArrayList<Integer> numberofRows = new ArrayList<Integer>();
	ArrayList<Integer> numberofInvader = new ArrayList<Integer>();
	int invaderId = 0;
	double layoutX, layoutY;
	
	
	@Override
	public void shoot(Pane pane) {
		if(bombOnField){
			return;
		}else{
			addNumberOf();
			bombOnField = true;
			bomb = new Rectangle(50, 50, 50, 50);
			Image image = new Image("bomb.png");
			ImagePattern imagepattern = new ImagePattern(image);
			bomb.setFill(imagepattern);
			pane.getChildren().addAll(bomb);
			bomb.relocate(getLayoutX() + numberofInvader.get((int)(Math.random() * 5)), getLayoutY() + numberofRows.get((int)(Math.random() * 2)));
			timelineOfBomb(pane);
		}

	}
	
	



	private void moveBombDown(Pane pane){
		if(bomb.getLayoutY() < 645){
			bomb.setLayoutY(bomb.getLayoutY() + 2);
			onHit();
		}else{
			timeline.stop();
			timeline.setCycleCount(0);
			pane.getChildren().remove(bomb);
			bombOnField = false;
			return;
		}

	}

	
	void timelineOfBomb(Pane pane){
		timeline = new Timeline(new KeyFrame(
		        Duration.millis(10),
		        ae -> moveBombDown(pane)));
		timeline.setCycleCount(Animation.INDEFINITE);
		timeline.play();
	}
	
	private void addNumberOf(){
		numberofRows.add(50);
		numberofRows.add(120);
		numberofInvader.add(15);
		numberofInvader.add(85);
		numberofInvader.add(155);
		numberofInvader.add(225);
		numberofInvader.add(295);
				
	}
	public void createInvader(HBox invaderRow, Pane pane){
		Image image = new Image("invader1.png");
		invader = new Rectangle(70, 70);
		ImagePattern imagepattern = new ImagePattern(image);
		invader.setFill(imagepattern);
		invader.setId("" + invaderId);
		invaderRow.getChildren().addAll(invader);
		
		
	}

	@Override
	public void hit() {

		
	}
	
	public void onHit(){
		if(bomb.getBoundsInParent().intersects(player.getPlayer().getBoundsInParent())){
		}

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkIfLaserOnScreen(Pane pane) {
		// TODO Auto-generated method stub
		
	}


	public double getLayoutX() {
		return layoutX;
	}





	public void setLayoutX(double invader) {
		this.layoutX = invader;
	}





	public double getLayoutY() {
		return layoutY;
	}





	public void setLayoutY(double invader) {
		this.layoutY = invader;
	}





	public Rectangle getInvader() {
		return invader;
	}





	public void setInvader(Rectangle invader) {
		this.invader = invader;
	}
	




}
