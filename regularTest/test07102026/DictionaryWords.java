/*
Problem Statement
Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.
Note that the same word in the dictionary may be reused multiple times in the segmentation.
Example 1:
Input: s = "applepenapple", wordDict = ["apple","pen"]
Output: true
Explanation: Return true because "applepenapple" can be segmented as "apple pen apple". Note that you are allowed to reuse a dictionary word.

Example 2:
Input: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
Output: false

Input format :
The first line of input consists of a string s, representing the input string.
The second line consists of an integer n, indicating the number of words in the dictionary.
The next line consists of n space-separated strings representing the words of the dictionary.

Output format :
If the input string can be segmented into words from the dictionary, output "true".
If the input string cannot be segmented into words from the dictionary, output "false".

Refer to the sample output for the formatting specifications.
Code constraints :
1 ≤ s.length ≤ 100
1 ≤ wordDict.length ≤ 10
1 ≤ wordDict[i].length ≤ 100
s and wordDict[i] consist of only lowercase English letters.
All the strings of wordDict are unique.

Sample test cases :
Input 1 :
applepenapple
2
apple pen
Output 1 :
true

Input 2 :
catsandog
5
cats dog sand and cat
Output 2 :
false
*/

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class DictionaryWords {

	private static boolean consistMethod(String s, String dict[]) {
		Set<String> words = new HashSet<>();
		for(String word : dict) {
			words.add(word);
		}
		int n = s.length();
		boolean dp[] = new boolean[n+1];
		dp[0] = true;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < i; j++) {
				if(dp[j] && words.contains(s.substring(j, i))) {
					dp[i] = true;
					break;
				}
			}
		}
		return dp[n];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = sc.nextInt();
		String dict[] = new String[n];
		for(int i = 0; i < n; i++) {
			dict[i] = sc.next();
		}
		
		boolean res = consistMethod(s, dict);
		if(res) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		sc.close();
	}

}
