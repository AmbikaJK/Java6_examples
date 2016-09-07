package ocpjp.executer.simplecallbackexample;

import java.util.concurrent.Callable;

public class Factorial implements Callable<Long>{
	
	long n;
	public Factorial(long n) {
		this.n = n;
	}
	@Override
	public Long call() throws Exception {
		
		if (n < 1) {
			throw new IllegalArgumentException("n can't be less than 1 for factorial");
		}
		
		long fact = 1;
		while (n > 0) {
			fact = fact * n;
			n = n-1;
		}
		return fact;
	}
}
