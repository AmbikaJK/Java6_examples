package ocpjp.concurrent.semaphore;

import java.util.concurrent.Semaphore;

public class Person extends Thread{

	
	private Semaphore machines;
	
	public Person(Semaphore semaphore, String name) {
		this.machines = semaphore;
		this.setName(name);
		this.start();
	}
	
	@Override
	public void run() {
		try {
			System.out.println(getName() + " waiting to access an ATM machine");
			machines.acquire();
			System.out.println(getName() + " is accessing an ATM machine");
			Thread.sleep(1000); // simulate the time required for withdrawing amount
			System.out.println(getName() + " is done using the ATM machine");
			machines.release();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
}
