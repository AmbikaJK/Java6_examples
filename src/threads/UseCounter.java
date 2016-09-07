package threads;

public class UseCounter implements Runnable{

	void increment () {
		synchronized (this) {
			Counter.count++;
			System.out.println("current thread : " + Thread.currentThread().getName() + "Counter " + Counter.count);
		}
	}
	
	/*public synchronized void increment() {
		Counter.count++;
		System.out.print(Counter.count + " ");
	}*/
	
	@Override
	public void run() {
		increment();
		increment();
		increment();
	}
	
	public static void main(String[] args) {
		Thread myThread = new Thread(new UseCounter());
		Thread myThread1 = new Thread(new UseCounter());
		Thread myThread2 = new Thread(new UseCounter());
		
		myThread.start();
		myThread1.start();
		myThread2.start();
		
	}
}
