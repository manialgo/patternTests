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