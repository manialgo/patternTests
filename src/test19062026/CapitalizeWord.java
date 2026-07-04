package test19062026;

import java.util.Scanner;
public class CapitalizeWord {
	private static String capitalizeWords(String str) {
		String[] strArr = str.split(" ");
		String temp;
		StringBuilder result = new StringBuilder();
		for(int i=0; i<strArr.length; i++) {
			temp = strArr[i];
			if(!temp.isEmpty()) {
				result.append(Character.toUpperCase(temp.charAt(0)));
				result.append(temp.substring(1));
				if(i < strArr.length-1) result.append(" ");
			}
		}
		return result.toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(capitalizeWords(str));
		sc.close();
	}
}

/*

Problem Statement:-
Vijay is working in a software company and he is preparing a document about his project. As per requirement, the first letter in each word should be in the upper case. But Vijay typed the entire document in lowercase. Help Vijay to capitalize the first letter in each word of a sentence.

Input format :-
The input consists of a sentence.

Output format :-
The output prints the string with the first letter in upper case.

Sample test cases :-
Input 1 :-
a quick brown fox jumps over the lazy dog
Output 1 :-
A Quick Brown Fox Jumps Over The Lazy Dog 

*/
