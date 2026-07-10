package test08062026;

import java.util.Scanner;

public class StringSet{
  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
    
		String[] strArr= s.split(" ");
		String s1 = strArr[0];	
		String s2 = strArr[1];
		
		boolean one = s1.contains(s2);
		boolean two = s2.contains(s1);
				
		if(one || two) System.out.println("Yes");
		else System.out.println("No");
		
		sc.close();
	}
  
}

/*

Problem Statement:-
You are given two strings ‘s1’ and ‘s2’. You have to tell whether these two form a pair of strset. A pair of strings is said to be strset if one string is a substring of the other.

Input format :-
The input contains two space-separated strings.

Output format :-
The output displays 'Yes' if the given strings form strset.
The output displays 'No' if the given strings do not form strset.

Sample test cases :-
Input 1 :-
abcd bcd
Output 1 :-
Yes

Input 2 :-
abcd cde
Output 2 :-
No

*/
