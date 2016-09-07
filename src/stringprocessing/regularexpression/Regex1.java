/**
 * 
 */
package stringprocessing.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author vgoyal
 *
 */
public class Regex1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Vipul goyal, A - 40, New Krishna Park, Vikas Puri, New Delhi, 110018, vipulgoyal112@gmail.com, 9999220806";
		Pattern pattern = Pattern.compile("\\D\\d{6}\\D");
		Matcher matcher = pattern.matcher(str);
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
