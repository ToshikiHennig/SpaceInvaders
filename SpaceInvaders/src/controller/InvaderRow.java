package controller;

import java.util.List;

import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public class InvaderRow {
	InvaderBlock invaderBlock = new InvaderBlock();
	Group invaderList = new Group();
	void addInvader(Rectangle invader){
		invaderList.getChildren().addAll(invader);
		invaderBlock.addInvaderBlock(invaderList);
	}
}
