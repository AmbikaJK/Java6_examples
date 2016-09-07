package ocpjp.threads.threadstates;

public class MyThread extends Thread {

	@Override
	public void run() {
		synchronized (MyThread.class) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		
		t1.start();
		t2.start();
		
		System.out.println("thread name : " + t1.getName() + ", state : " + t1.getState());
		System.out.println("thread name : " + t2.getName() + ", state : " + t2.getState());
		
	}
}
