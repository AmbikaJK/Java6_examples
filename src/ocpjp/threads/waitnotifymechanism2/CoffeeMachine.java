package ocpjp.threads.waitnotifymechanism2;

public class CoffeeMachine extends Thread {
	
	static String coffeeMade = null;
	static final Object lock = new Object();
	int coffeeNumber = 1;
	
	private void makeCoffee () {
		synchronized (CoffeeMachine.lock) {
			if (coffeeMade != null) {
				try {
					System.out.println("Coffee Machine is waiting for waiter to notify for a another cup of coffee");
					CoffeeMachine.lock.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			coffeeMade = "Coffee Number : " + coffeeNumber ++;
			System.out.println("Coffee Prepared " + coffeeMade);
			CoffeeMachine.lock.notifyAll();
			System.out.println("Coffee Machine notify waiter to pick the coffee");
		}
	}
	
	@Override
	public void run() {
		while (true) {
			makeCoffee();
			try {
				System.out.println("Coffee Machine whether to make a coffee");
				sleep(10000);
			} catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}