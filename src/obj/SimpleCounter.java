package obj;

public class SimpleCounter<T> {
	private static int count = 0;

	public SimpleCounter() {
		count++;
	}

	public static int getCount() {
		return count;
	}
}
