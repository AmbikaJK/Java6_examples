package ocpjp.threads.deadlock;

public class MyThread3 implements Runnable {
	
	private void incrementRunAfterBall() {
		synchronized (Runs.class) {
			synchronized (Balls.class) {
				Balls.ball++;
				Runs.run++;
			}
		}
	}
	
	private void incrementBallAfterRun() {
		synchronized (Balls.class) {
			synchronized (Runs.class) {
				Runs.run++;
				Balls.ball++;
			}
		}
	}
	
	@Override
	public void run() {
		incrementRunAfterBall();
		incrementBallAfterRun();
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		MyThread3 myThread3 = new MyThread3();
		
		Thread t1 = new Thread(myThread3);
		Thread t2 = new Thread(myThread3);
		Thread t3 = new Thread(myThread3);
		
		t1.start();
		t2.start();
		t3.start();
		System.out.println("Waiting For A Thread to Complete");
		t1.join();
		t2.join();
		t3.join();
		System.out.println("Done");
		
	}
}
