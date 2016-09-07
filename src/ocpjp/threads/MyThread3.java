package ocpjp.threads;

public class MyThread3 implements Runnable {
	
	private void increment() {
		synchronized (this) {
			Counter.count++;
			System.out.println(Counter.count);
		}
	}
	
	
	@Override
	public void run() {
		increment();
		increment();
		increment();
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		MyThread3 myThread3 = new MyThread3();
		
		Thread t1 = new Thread(myThread3);
		Thread t2 = new Thread(myThread3);
		Thread t3 = new Thread(myThread3);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
