package test;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Palindrome {
	
	public static void main(String[] args) {
		
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
		
	}
	
}
