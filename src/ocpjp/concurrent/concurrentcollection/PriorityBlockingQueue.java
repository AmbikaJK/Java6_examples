package ocpjp.concurrent.concurrentcollection;

import java.util.PriorityQueue;

public class PriorityBlockingQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final java.util.concurrent.PriorityBlockingQueue<Integer> pq = new java.util.concurrent.PriorityBlockingQueue<Integer>();
		
		new Thread() {
			public void run() {
				
				try {
					System.out.println("Deleting an element " + pq.take());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			};
		}.start();;
		
		new Thread() {
			public void run() {
				
				System.out.println("add an element " + pq.add(10));
				
				
			};
		}.start();;

	}

}
