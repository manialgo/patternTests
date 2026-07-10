package test08062026;

import java.util.Scanner;
import java.util.Arrays;

public class FreqOfChar{
  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		int[] freq = new int[128];
		Arrays.fill(freq, 0);
		for(char ch : s.toCharArray())	freq[ch]++;
		
		char ch='a';
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<128; i++) {
			if(max < freq[i]) {
				max = freq[i];
				ch = (char) i;
			}
		}
		
		System.out.println("Highest frequency character : "+ch);
		System.out.println("Number of times : "+max);
		
		sc.close();
	}
}

/*

Problem Statement:-
Write a program to find the maximum occurring character in a string.

Input format :-
The input consists of a string.

Output format :-
The output prints the highest frequency of character and frequency in separate lines.

Sample test cases :-
Input 1 :-
Welcome to tulipflowers.com
Output 1 :-
Highest frequency character : o
Number of times : 4 

*/
