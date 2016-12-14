package controller;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
import modell.IInvaderBlock;

public class InvaderBlock implements IInvaderBlock{
	private boolean endRight = false;
	Group invaderRowList = new Group();
	Invader invader;
	int invaderId = 1;
	Timeline timeline;
	HBox invaderrow1, invaderrow2;
	int min = 0;
	int max = 5;
	int randomInvader = ThreadLocalRandom.current().nextInt(min, max + 1);
	@Override
	public void moveLeft() {
		if(invaderRowList.getLayoutX() > 0){
			invaderRowList.setLayoutX(invaderRowList.getLayoutX() - 50);
		}
		else{
			endRight = false;
			timeline.stop();
			timeline.setCycleCount(0);
			moveDown();
			return;
		}
		
	}

	@Override
	public void moveRight() {
		if(invaderRowList.getLayoutX() < 650){
			invaderRowList.setLayoutX(invaderRowList.getLayoutX() + 50);
		}
		else{
			endRight = true;
			timeline.stop();
			timeline.setCycleCount(0);
			moveDown();
			return;
		}
	
		
	}

	@Override
	public void edge() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveDown() {
		invaderRowList.setLayoutY(invaderRowList.getLayoutY() + 50);
		if(endRight){
			timeLeft();
		}else{
			timeRight();
		}
		
	}
	
	public void addInvaderBlock(Group invaderList){
//		invaderRowList.getChildren().addAll(invaderList);
	}

	@Override
	public void createInvaderBlock(Pane pane) {
		invaderrow1 = new HBox();
		invaderrow2 = new HBox();
		VBox invaderColumns = new VBox();
		invaderColumns.getChildren().addAll(invaderrow1, invaderrow2);
		invaderRowList.getChildren().addAll(invaderColumns);
		int a = 0;
		int b = 0;
//		Invader invader = new Invader();
//		invader.createInvader();
		for(int i = 0; i < 10; i++){
			if(a == 5){
				invader = new Invader();
				invader.createInvader(invaderrow1, pane);
				System.out.println(invaderrow1.getChildren().size());
			}else{
				invader = new Invader();
				invader.createInvader(invaderrow2, pane);
				a++;	
			}
		
		}
		pane.getChildren().addAll(invaderRowList);

	}

	@Override
	public void timeRight() {
		timeline = new Timeline(new KeyFrame(
		        Duration.millis(1500),
		        ae -> moveRight()));
		timeline.setCycleCount(Animation.INDEFINITE);
		timeline.play();
		
	}

	@Override
	public void timeLeft() {
		timeline = new Timeline(new KeyFrame(
		        Duration.millis(1500),
		        ae -> moveLeft()));
		timeline.setCycleCount(Animation.INDEFINITE);
		timeline.play();
		
	}

	@Override
	public void shoot(Pane pane) {
		invader.shoot(pane);
		
	}

}
