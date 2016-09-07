package ocpjp.executer.simpleexample;

import java.util.concurrent.Executor;

public class RepeatedExecuter implements Executor{

	@Override
	public void execute(Runnable command) {
		new Thread(command).start();
	}
	
	public void execute (Runnable runnable, int times) {
		System.out.println("Execute number of times" + times);
		for (int i = 0; i < times; i++) {
			execute(runnable);
		}
	}
}
