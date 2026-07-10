package test10072026;

import java.util.Scanner;

/*
LONGEST PALINDROME EFFICIENT

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
*/

public class LengthOfLongestPalindrome{
//   BRUTE FORCE APPROACH
    private static boolean isPalindrome(String s){
        char[] chArr = s.toCharArray();
        int start=0, end=chArr.length-1;
        while(start <= end){
            if(chArr[start] != chArr[end]) return false;
            start++;
            end--;
        }
        return true;
    }
  
    private static int longestPalindrome(String s){
        int size = s.length();
        int len=0, result=0;
        
        for(int i=0; i<size; i++){
            for(int j=i; j<size; j++){
                if(isPalindrome(s.substring(i, j+1))){
                    len = j-i+1;
                    result = Math.max(len, result);
                }
            }
        }
        return result;
    }
  
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(longestPalindrome(s));
        sc.close();
    }
  
}

/*

Problem Statement:-
Sharon is fascinated by palindromes and wants to find the length of the longest palindromic substring in a given string. 

Write a program for Sharon that takes a string as input and outputs the length of the longest palindromic substring.

Example:-
Input:-
bananas

Output:-
5

Explanation:-
The longest palindromic substring is 'anana' with a length of 5.

Input format :-
The input consists of a string.

Output format :-
The output prints the integer, representing the length of the longest palindromic substring.

Refer to the sample output for formatting specifications.

Code constraints :-
The string contains lowercase letters with at most 50 characters.

Sample test cases :-
Input 1 :-
bananas
Output 1 :-
5

Input 2 :-
acacacab
Output 2 :-
7

*/
