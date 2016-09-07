package javafundamentalsio.console;

import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console console = System.console();
		
		if (console == null) {
			System.out.println("Console null; using IDE");
		}
		
		console.printf(console.readLine());
		

	}

}
