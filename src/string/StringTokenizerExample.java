/**
 * 
 */
package string;

import java.util.StringTokenizer;

/**
 * @author vgoyal
 *
 */
public class StringTokenizerExample {
	public static void main(String[] args) {
		String str = "1,2,3,4";
		StringTokenizer stn = new StringTokenizer(str);
		
		//stn 
		while (stn.hasMoreTokens()) {
			System.out.println(stn.nextToken(","));
		}
		
		/*for (String s : stn){
			
		}*/
	}
}
