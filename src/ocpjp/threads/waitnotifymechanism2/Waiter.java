package ocpjp.threads.waitnotifymechanism2;

public class Waiter extends Thread {
	
	private void getCoffee () {
		synchronized (CoffeeMachine.lock) {
			if (CoffeeMachine.coffeeMade == null) {
				try {
					System.out.println("Waiter is waiting for coffee machine to notify..");
					CoffeeMachine.lock.wait();
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}	
				
			System.out.println("Coffee delivered, pls make a another cup of coffee");
			CoffeeMachine.coffeeMade = null;
			CoffeeMachine.lock.notifyAll();
			System.out.println("Notifying to coffee machine for making a coffee");
		}
	}
	
	@Override
	public void run() {
		while(true) {
			getCoffee();
		}
	}

}
