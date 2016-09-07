/**
 * 
 */
package threads;

/**
 * @author vgoyal
 *
 */
public class MyThread2 implements Runnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread myThread1 = new Thread(new MyThread2());
		Thread myThread2 = new Thread(new MyThread2());
		myThread1.setPriority(Thread.MIN_PRIORITY);
		myThread2.setPriority(Thread.NORM_PRIORITY);
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		myThread1.start();
		myThread2.start();
		System.out.println("In main thread : " + Thread.currentThread().getName()+ ", pririty : " + Thread.currentThread().getPriority());
	}

	@Override
	public void run() {
		
		for (int i = 0; i < 3; i++) {
			try {
				Thread.currentThread().sleep(1000);
				System.out.println("name : "  + Thread.currentThread().getName()  + ", i = " + i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("In run method : " + Thread.currentThread().getName() + ", pririty : " + Thread.currentThread().getPriority());
	}

}
