package ocpjp.threads.threadstates;

public class MyThread2 extends Thread {

	@Override
	public synchronized void run() {
		while (true) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
	}
	
	public static void main(String[] args) {
		MyThread2 t2 = new MyThread2();
		t2.start();
		
		
		Thread t1 = new Thread() {
			public void run() { System.out.print("t2 "); }
		};
		
		t1.start();
		
		System.out.println(t2.getState());
	}
}
