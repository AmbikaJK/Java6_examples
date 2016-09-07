package ocpjp.executer.simpleexample;

public class Task implements Runnable {

	@Override
	public void run() {
		System.out.println("Execute run mention in task class");
	}
}
