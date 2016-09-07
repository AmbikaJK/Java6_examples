/**
 * 
 */
package exceptions;

import java.util.Scanner;

/**
 * @author vgoyal
 *
 */
public class TryWithResources1 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("try with resources methods   :::   ");
		} catch (Exception ex) {
			System.out.println("Error in printstream");
		}
	}

}
