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