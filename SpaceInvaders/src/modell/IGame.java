package modell;

public interface IGame extends IPlayer, IInvaderBlock{

	void createInvader();
	
	void leftArrowPressed();
	
	void rightArrowPressed();
	
	void spacePressed();
	
	void escapePressed();
	
	void mouseclickPause();
	
	void mouseclickExit();
	
	void mouseclickNewGame();
}
