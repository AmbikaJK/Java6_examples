package ocpjp.concurrent.exchanger;

import java.util.concurrent.Exchanger;

public class Test {
	
	public static void main(String[] args) {
		Exchanger<String> sillyTalk = new Exchanger<String>();
		new Person1(sillyTalk).start();
		new Person2(sillyTalk).start();
	}
}
