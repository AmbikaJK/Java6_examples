package ocpjp.executer.simpleexample;

public class Test {
	
	public static void main(String[] args) {
		
		new Thread(new Task()).start();
		
		new RepeatedExecuter().execute(new Task());
		
		new RepeatedExecuter().execute(new Task(), 2);
	}
}
