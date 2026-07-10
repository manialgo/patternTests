package test07072026;

import java.util.Scanner;

public class InterchangeCharacter{
	
	private static String characterInterchange(String s, char ch1, char ch2) {
		StringBuilder sb = new StringBuilder(s);
		if(s==null || s.length()==0) return null;

		boolean chk1 = false, chk2=false;
		for(char c : s.toCharArray()) {
			if(c == ch1) chk1 = true;
			if(c == ch2) chk2 = true;
		}
		if(!chk1 && !chk2) return s;
		
		for(int i=0; i<sb.length(); i++) {
			if(sb.charAt(i)==ch1) {
				sb.setCharAt(i, ch2);
			}else if(sb.charAt(i)==ch2) {
				sb.setCharAt(i, ch1);
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char ch1 = sc.next().charAt(0);
		char ch2 = sc.next().charAt(0);
		
		System.out.println(characterInterchange(s, ch1, ch2));
		sc.close();
	}
	
}


/*

Problem Statement:-
Write a program that accepts a string ‘ str’ of length n and two characters ‘ch1’ and ‘ch2’ as its arguments. Implement the function to modify and return the string ‘ str’ in such a way that all occurrences of ‘ch1’ in the original string are replaced by ‘ch2’ and all occurrences of ‘ch2’ in the original string are replaced by ‘ch1’. 

Assumption:-
String Contains only lower-case alphabetical letters. 

Note:-
Return null if the string is null. 
If both characters are not present in the string or both of them are the same, then return the string unchanged. 

Example:-
Input:-
Str: apples 
ch1:a 
ch2:p 

Output:-
paales 

Explanation:-
‘a’ in the original string is replaced with ‘p’ and ‘p’ in the original string is replaced with ‘a’, thus output is paales. 

Input format :-
The first input is the string.
The next two char inputs are ch1 & ch2 respectively.

Output format :-
Output is the modified string.

Sample test cases :-
Input 1 :-
apples 
a p
Output 1 :-
paales 

Input 2 :-
iamneo 
i n 
Output 2 :-
namieo

*/
