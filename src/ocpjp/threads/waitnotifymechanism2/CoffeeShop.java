package ocpjp.threads.waitnotifymechanism2;

public class CoffeeShop {
	public static void main(String[] args) {
		CoffeeMachine coffeeMachine = new CoffeeMachine();
		Waiter waiter = new Waiter();
		coffeeMachine.start();
		waiter.start();
	}
	
}
