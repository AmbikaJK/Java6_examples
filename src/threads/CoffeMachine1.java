/**
 * 
 */
package threads;

/**
 * @author vgoyal
 *
 */
public class CoffeMachine1 extends Thread{

	static String coffeeMade = null;
	static final Object lock = new Object();
	static int coffeeNumber = 1;
	
	void makeCoffee() {
		synchronized (CoffeMachine1.lock) {
			
			try {
				
				if (coffeeMade != null) {
					
					
					
					
				}
				
				
			} catch(Exception ie) {
				System.out.println(ie);
			}
			
			
		}
	}
	
	@Override
	public void run() {
		while (true) {
			makeCoffee();
			try {
				System.out.println("Coffee machine: Making another coffee now");
				sleep(1000);
			} catch(Exception ie) {
				System.out.println(ie);
			}
		}
	}
	
	
	
	
}
