/**
 * 
 */
package threads;

class Waiter extends Thread {
	public void getCoffee() {
		synchronized (CoffeeMachine.lock) {
			if (CoffeeMachine.coffeeMade == null) {
				try {
					System.out.println("Waiter: Will get orders till coffee machine notifies me ");
					CoffeeMachine.lock.wait();
				} catch (InterruptedException ie) {
					ie.printStackTrace();
				}
			}
			System.out.println("Waiter: Delivering " + CoffeeMachine.coffeeMade);
			CoffeeMachine.coffeeMade = null;
			CoffeeMachine.lock.notifyAll();
			System.out.println("Waiter: Notifying coffee machine to make another one");
		}
	}

	public void run() {
		// keep going till the user presses ctrl-C and terminates the program
		while (true) {
			getCoffee();
		}
	}
}
