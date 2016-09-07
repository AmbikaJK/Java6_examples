package ocpjp.concurrent.semaphore;

import java.util.concurrent.Semaphore;

public class Test {
	
	public static void main(String[] args) {
		Semaphore semaphore = new Semaphore(2);
		new Person(semaphore, "Vipul");
		new Person(semaphore, "Vipul1");
		new Person(semaphore, "Vipul2");
		new Person(semaphore, "Vipul3");
		new Person(semaphore, "Vipul4");
		
		
	}

}
