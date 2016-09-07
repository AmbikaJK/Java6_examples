/**
 * 
 */
package threads;

/**
 * @author vgoyal
 *
 */
public class MyThread1 extends Thread{

	@Override
	public void run() {
		try {
			sleep(100);
		} catch (InterruptedException ie) {
			System.out.println("Error in sleep method : " + ie);
		}
		//System.out.println("In run thread : " + getName());
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread myThread1 = new MyThread1();
		System.out.println("states : " + myThread1.getState());
		myThread1.start();
		System.out.println("states : " + myThread1.getState());
		myThread1.join();
		System.out.println("states : " + myThread1.getState());
		
		/*try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		//System.out.println("In main method : " + Thread.currentThread().getName());
	}

}
