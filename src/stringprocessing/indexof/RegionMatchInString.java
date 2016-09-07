package stringprocessing.indexof;

public class RegionMatchInString {

	public static void main(String[] args) {
		
		String chat = "Hi Jane ! \nHi Hw are u?";
		
		//System.out.println(chat);
		
		String matchContent = "Hi Hw";
		
		int startIndex = chat.indexOf("\n");
		if (startIndex > -1) {
			//boolean doesMatch = chat.regionMatches(startIndex, matchContent, 0, matchContent.length());
			boolean doesMatch1 = chat.regionMatches(true, startIndex, matchContent, 0, matchContent.length());
			/*if (doesMatch) {
				System.out.println("String region Matches!");
			}
			*/if (doesMatch1) {
				System.out.println("ignorecase true String region Matches!");
			}
		}
		
		
	}

}
