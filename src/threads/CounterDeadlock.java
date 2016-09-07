package threads;

public class CounterDeadlock implements Runnable{

	@Override
	public void run() {
		incrementBallAfterRun();
		incrementRunAfterBall();
	}

	private void incrementRunAfterBall() {
		synchronized (Runs.class) {
			synchronized (Balls.class) {
				Runs.count++;
				Balls.count++;
			}
		}
	}

	private void incrementBallAfterRun() {
		synchronized (Balls.class) {
			synchronized (Runs.class) {
				Balls.count++;
				Runs.count++;
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		CounterDeadlock cd = new CounterDeadlock();
		Thread t1 = new Thread(cd);
		Thread t2 = new Thread(cd);
		t1.start();
		t2.start();
		System.out.println("waiting for threads to complete");
		t1.join();
		t2.join();
		System.out.println("Done..");
	}
}
