package ocpjp.executer.simplecallbackexample;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SumOfN {
	
	static Long n = 100000L;
	static int numOfThreads = 10;

	static class SumCalc implements Callable<Long> {

		long from, to, localSum = 0L;
		public SumCalc(long from, long to) {
			this.from = from;
			this.to = to;
		}
	
		@Override
		public Long call() throws Exception {
			for (long i = from; i <= to; i++) {
				localSum += i;
			}
			//System.out.println(localSum);
			return localSum;
		}
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService service = Executors.newFixedThreadPool(numOfThreads);
		List<Future<Long>> fLst = new ArrayList<Future<Long>>();
		
		for (int i = 0; i < 10; i++) {
			long from = ((n/10)*i) + 1;//1
			long to = (n/10) * (i+1);//100000
			System.out.println(from + ",," + to);
			Callable<Long> task = new SumCalc(from, to);
			Future<Long> f = service.submit(task);
			fLst.add(f);
		}
		
		long calculateSum = 0L; 
		for (Future<Long> future : fLst) {
			System.out.println("!!!!!!!!!!!!!!!!!    : " + calculateSum + "," + future.get());
			calculateSum += future.get();
		}
		
		System.out.println("calculated sum is " + calculateSum);
		System.out.println("Formula, value is" + (n*(n+1))/2);
		
	}
	
}
