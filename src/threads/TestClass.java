package threads;

public class TestClass { 
	public Mumbo mumbo = new Mumbo(); 
	public Jumbo jumbo = new Jumbo(); 
	class Mumbo {
		public synchronized void doIt() {
			try {
				wait();
				System.out.println("done");
			} catch (Exception e) {
				
			}
		} 
	}
	class Jumbo extends Thread {
		public void run() {
			mumbo.doIt();
		}
	} 
	public TestClass() throws Exception {
		jumbo.start(); 
		Thread.sleep(1000);
		synchronized(mumbo){ 
			mumbo.notifyAll(); 
		}
	}
	
	public static void main(String[] args) throws Exception {
		new TestClass();
	}
	 
}
