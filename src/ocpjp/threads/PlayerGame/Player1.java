package ocpjp.threads.PlayerGame;

public class Player1 extends Thread {

	@Override
	public void run() {
		while(Dice.NoOfThrows < 12) {
			synchronized (Dice.lock) {
				if (Dice.flags == Dice.State.INACTIVE) {
					try {
						System.out.println("Player1 is wating for his turn");
						Dice.lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				System.out.println("Player1 is throwing : " + ++Dice.NoOfThrows);
				Dice.flags = Dice.State.INACTIVE;
				Dice.lock.notifyAll();
				System.out.println("Player1 is notifying other player to run");
				
			}
			
			try {
				System.out.println("Player1 is attempting to play...");
				sleep(10000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			
		}
		
	}
	
	
}
