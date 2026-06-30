package test30062026;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class StringGame{
	private static void backtrack(String str, int start, Set<String> set, List<String> path, List<String> result) {
		if(start == str.length()) {
			result.add(String.join(" ",path));
			return ;
		}
		for(int end=start+1; end<=str.length(); end++) {
			String word = str.substring(start, end);
			if(set.contains(word)){
				path.add(word);
				backtrack(str, end, set, path, result);
				path.remove(path.size()-1);
			}
		}
	}
	private static List<String> sentenceFormed(String str, String[] strArr, int size){
		Set<String> set = new HashSet<>();
		for(String s:strArr) set.add(s);
		List<String> result = new ArrayList<>();
		backtrack(str, 0, set, new ArrayList<>(), result);
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int size = sc.nextInt();
		String[] strArr = new String[size];
		for(int i=0; i<size; i++) strArr[i] = sc.next();
		List<String> result = sentenceFormed(str, strArr, size);
		System.out.println(result);
		sc.close();
	}
}


/*
Given a string s and a dictionary of string wordDict of size n, add spaces in s to construct a sentence where each word is a valid dictionary word. Return all such possible sentences in any order.

Note: The same word in the dictionary may be reused multiple times in the segmentation. & All the strings of wordDict are unique.

Input format :
The first line of input is a string 's' consisting of lowercase English letters.
The second line of input is an integer 'n' represents the size of the dictionary.
The next n lines consists of strings denoting the words in the dictionary.

Output format :
The output displays a list of strings, where each string is a space-separated sequence of dictionary words that form the input string s.
If no such sequence exists, an empty list is returned.

Code constraints :
1 <= n <= 10
The string s contains both uppercase and lowercase.

Example:-

Input:
s = "catsanddog"
n = 5
wordDict = ["cat","cats","and","sand","dog"]

Output:
["cats and dog","cat sand dog"]

Sample test cases :-

Input:
catsanddog
5
cat
cats
and
sand
dog

Output:
[cats and dog, cat sand dog]
*/
