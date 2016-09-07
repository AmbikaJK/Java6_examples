package ocpjp.concurrent.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
	public static void main(String[] args) {
		Lock machine = new ReentrantLock();
		new Person(machine, "1");
		new Person(machine, "2");
		new Person(machine, "3");
		new Person(machine, "4");
		new Person(machine, "5");
	}
}