package stringprocessing.indexof;

public class IndexOfExample {
	
	public static void main(String[] args) {
		String str = "I am preparaing for OCPJP";
		System.out.println("J is at index : " + str.indexOf("for"));
		int fromIndex = 0;
		while((fromIndex = str.indexOf("a", fromIndex)) > -1) {
			System.out.println("a at index : " + fromIndex);
			fromIndex ++;
		}
	}
}
