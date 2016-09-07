package ocpjp.threads.PlayerGame;

public class Dice {
	
	static Integer NoOfThrows = 0;
	static final Object lock = new Object();
	static State flags = State.ACTIVE;
	
	public enum State {
		ACTIVE,
		INACTIVE
	}
}
