/**
 * 
 */
package tostring;

public class Test {

	public static void main(String[] args) {
		String str = "abc";
		int a = 12;
		String[] abcObj = {"a","b"};
		
		System.out.println("str : " + str);
		System.out.println("str.toString() : " + str.toString());
		System.out.println("a : " + a);
		System.out.println("Integer.toString(a) : " + Integer.toString(a));
		System.out.println("abcObj.toString()" + abcObj.toString());
		for (String st : abcObj) {
			System.out.println("st : " + st);
			System.out.println("st.toString() : " + st.toString());
		}
	}

}
