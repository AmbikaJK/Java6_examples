package pretest;

public class NullInstanceOf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = null;
		if (str instanceof Object) {
			System.out.println("str is object");
		} else {
			System.out.println("str is not object");
		}
				
	}

}
