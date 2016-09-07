package ocpjp.threads;

public class MyThread2 implements Runnable {
	
	@Override
	public void run() {
		try {
			for (int i = 9; i > 0; i--) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Starting Timer!!!!!!!!!!......");
		Thread t = new Thread(new MyThread2());
		t.start();
		t.join(5000);
		System.out.println("BOOM !!!!!!!");
	}
}
