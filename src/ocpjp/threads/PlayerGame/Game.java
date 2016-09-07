package ocpjp.threads.PlayerGame;

public class Game {
	
	public static void main(String[] args) throws InterruptedException {
		
		Player1 p1 = new Player1();
		Player2 p2 = new Player2();
		
		System.out.println("Game is starting");
		p1.start();
		p2.start();
		
		p1.join();
		p2.join();
		
		System.out.println("Game Finish!!");
	}

}
