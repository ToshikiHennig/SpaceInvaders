package modell;

public interface IPlayer extends IMovement, ICombat{
		
	void shootRocket();
	
	void updateScore(int score);
	
}
