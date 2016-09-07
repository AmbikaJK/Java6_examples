package ocpjp.concurrent.exchanger;

import java.util.concurrent.Exchanger;

public class Person2 extends Thread{
	
	Exchanger<String> sillyTalk;
	
	public Person2(Exchanger<String> sillyTalk) {
		this.sillyTalk = sillyTalk;
	}
	
	@Override
	public void run() {
		
		try {
			System.out.println("P2" + sillyTalk.exchange("I am good, Hw r u"));
			
			System.out.println("P2" + sillyTalk.exchange("Delhi!!"));
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
