package threads;

class CoffeeShop {
	public static void main(String[] s) {
		CoffeeMachine coffeeMachine = new CoffeeMachine();
		Waiter waiter = new Waiter();
		coffeeMachine.start();
		waiter.start();
	}
}
