package ocpjp.executer.simplecallbackexample;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Callable<Long> task = new Factorial(4);
		ExecutorService service = Executors.newSingleThreadExecutor();
		Future<Long> f = service.submit(task);
		System.out.println("output value is " + f.get());
		service.shutdown();
	}
}
