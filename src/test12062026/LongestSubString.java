package test12062026;

import java.util.Scanner;
public class LongestSubString {
	public static int longestSubString(String str) {
		int left = 0, right = 0,result=0;
		boolean[] existance = new boolean[26];
		while(left<= right && right < str.length()) {
			
			while(existance[str.charAt(right) - 'a']) {
				existance[str.charAt(left) - 'a'] = false;
				left++;
			}
			
			existance[str.charAt(right) - 'a'] = true;
			
			result = (result > (right-left+1)) ? result : (right-left+1); 
			
			right++;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(longestSubString(str));
		sc.close();
	}
}

/*

Problem Statement:-
Given a string s, find the length of the longest substring without repeating characters.

Example 1:-

Input: s = "abcabcbb"

Output: 3

Explanation:-
The answer is "abc", with a length of 3.

Example 2:-

Input: s = "bbbbb"

Output: 1

Explanation:-
The answer is "b", with a length of 1.     

Example 3:-

Input: s = "pwwkew"

Output: 3

Explanation:-
The answer is "wke", with a length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.                                                                                                        

Input format :-
The input consists of a string s.

Output format :-
The output prints the length of the longest substring without repeating characters.

Refer to the sample output for the formatting specifications.

Code constraints :-
1 ≤ s.length ≤ 100

Sample test cases :-
Input 1 :-
abcabcbb
utput 1 :-
3

Input 2 :-
bbbb
Output 2 :-
1 

*/
