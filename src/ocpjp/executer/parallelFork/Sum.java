package ocpjp.executer.parallelFork;

class SumOfNUsingForkJoin {
	private static long N = 1000000; // one million - we want to compute sum
	private static final int NUM_THREADS = 10; // number of threads to create
	static class RecursiveSumOfN extends RecursiveTask<Long> {
		long from, to;

		// from and to are range of values to sum-up
		public RecursiveSumOfN(long from, long to) {
			this.from = from;
			this.to = to;
		}

		public Long compute() {
			if ((to - from) <= N / NUM_THREADS) {
				long localSum = 0;
				for (long i = from; i <= to; i++) {
					localSum += i;
				}
				System.out.printf("\t Summing of value range %d to %d is %d %n", from, to, localSum);
				return localSum;
			} else {
				long mid = (from + to) / 2;
				System.out.printf("Forking computation into two ranges: "
						+ "%d to %d and %d to %d %n", from, mid, mid, to);
				RecursiveSumOfN firstHalf = new RecursiveSumOfN(from, mid);
				firstHalf.fork();
				RecursiveSumOfN secondHalf = new RecursiveSumOfN(mid + 1, to);
				long resultSecond = secondHalf.compute();
				return firstHalf.join() + resultSecond;
			}
		}
	}

	public static void main(String[] args) {
		ForkJoinPool pool = new ForkJoinPool(NUM_THREADS);
		long computedSum = pool.invoke(new RecursiveSumOfN(0, N));
		long formulaSum = (N * (N + 1)) / 2;
		System.out.printf("Sum for range 1..%d; computed sum = %d, formula sum = %d %n",
				N, computedSum, formulaSum);
	}
}