package ocpjpII.javaio;

import java.io.Console;

public class Test {
	public static void main(String[] args) {
		Console console = System.console();
		if (console != null) {
			String userName = console.readLine();
			char[] charArr = console.readPassword();
			String password = new String(charArr);
			if ("vipul".equalsIgnoreCase(userName) && "vipul".equalsIgnoreCase(password)) {
				console.printf("%s", "login successfully");
			} else {
				console.printf("%s", "wrong credentials");
			}
		} else {
			System.out.println("console object is not present, pls use command line instead of IDE");
		}
	}
}
