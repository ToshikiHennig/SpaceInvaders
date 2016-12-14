package controller;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import modell.IGame;

public class Main extends Application{
	IGame game = new Game();
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("../view/GameView.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("Space Invaders");
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setResizable(false);

		
	}

}
