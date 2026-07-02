package test12062026;

import java.util.Scanner;

public class LengthOfLongestPalindrome {
	private static int palindrome(String str) {
		int[] count = new int[128];
		for(char ch:str.toCharArray())	count[ch]++;
		int ans=0;
		boolean flag = false;
		for(int val:count) {
			ans += (val/2)*2;
			if(val % 2 == 1) flag = true;
		}
		return flag ? ans+1:ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(palindrome(str));
		sc.close();
	}
}