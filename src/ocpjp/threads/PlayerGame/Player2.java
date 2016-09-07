package ocpjp.threads.PlayerGame;

public class Player2 extends Thread{
	
	@Override
	public void run() {
		while(Dice.NoOfThrows < 12) {
			synchronized (Dice.lock) {
				if (Dice.flags == Dice.State.ACTIVE) {
					try {
						System.out.println("Player2 is wating for his turn");
						Dice.lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				System.out.println("Player2 is throwing : " + ++Dice.NoOfThrows);
				Dice.flags = Dice.State.ACTIVE;
				Dice.lock.notifyAll();
				System.out.println("Player2 is notifying other player to run");
				
			}
			
			try {
				System.out.println("Player2 is attempting to play...");
				sleep(10000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			
		}
		
	}
}
