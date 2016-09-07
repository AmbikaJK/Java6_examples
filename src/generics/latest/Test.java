package generics.latest;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;


public class Test {
	
	public static void main(String[] args) {
		

		Set<String> ss = new HashSet<String>();
		
		String palindromeStr = "abcba";
		
		List<Character> palindromeLst = new LinkedList<Character>();
		for(Character c : palindromeStr.toCharArray())
			palindromeLst.add(c);
		
		ListIterator<Character> palindromeIter = palindromeLst.listIterator();
		ListIterator<Character> palindromeIterRev = palindromeLst.listIterator(palindromeLst.size());
		
		boolean isPalindrome = true;
		while(palindromeIter.hasNext() && palindromeIterRev.hasPrevious()) {
			if(palindromeIter.next() != palindromeIterRev.previous()) {
				isPalindrome = false;
				break;
			}
		}
		
		if(isPalindrome) {
			System.out.println("Input strong is palindrome");
		} else {
			System.out.println("Input strong is not palindrome");
		}
		
		
		/*BoxExample<Integer> b = new BoxExample<Integer>();
		b.setVal(new Integer(10));
		System.out.println(b);
		Integer i = b.getVal();
		
		BoxExample<String> b1 = new BoxExample<String>();
		b1.setVal("Hello World");
		System.out.println(b1);
		//Below mention line not poosible, this is the main use of generics
		//Integer i1 = b1.getVal();
		
		
		
		
		
		List<String> l = new LinkedList();
		l.add("1");
		//l.
		l.add("2");
		List l1 = l;
		l1.add(10);
		
		System.out.println(l1);
		
		List<Integer> ll = new ArrayList<Integer>();
		*/
	}
	
}
