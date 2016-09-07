package ocpjp.concurrent.locks;

import java.util.concurrent.locks.Lock;

public class Person extends Thread{

	private Lock machine;
	public Person(Lock machine, String name) {
		this.machine = machine;
		this.setName(name);
		this.start();
	}
	
	@Override
	public void run() {
		try {
			System.out.println(getName() + "is doing its work");
			machine.lock();
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			machine.unlock();
			System.out.println(getName() + "has done its work");
		}
	}
}
