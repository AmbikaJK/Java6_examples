package ocpjp.threads;

public class MyThread1 extends Thread {
	
	@Override
	public void run() {
		
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println("In Run Method : " + getName());
	}
	
	
	public static void main(String[] args) {
		Thread t = new MyThread1();
		t.start();
		System.out.println("In Main method : " + Thread.currentThread().getName());
		
		
	}

}
