package ocpjp.concurrent.exchanger;

import java.util.concurrent.Exchanger;

public class Person1 extends Thread{
	
	Exchanger<String> sillyTalk;
	
	public Person1(Exchanger<String> sillyTalk) {
		this.sillyTalk = sillyTalk;
	}
	
	@Override
	public void run() {
		
		try {
			System.out.println("P1" + sillyTalk.exchange("Hi, Hw r u"));
			
			System.out.println("P1" + sillyTalk.exchange("I am good \n where r u putting"));
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
