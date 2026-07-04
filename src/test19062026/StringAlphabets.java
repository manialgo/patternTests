package test19062026;

import java.util.Scanner;
import java.util.HashSet;

public class StringAlphabets{
	//simple method
	/*
	private static boolean stringMatch2(String str1, String str2){
		HashSet<Character> set1 = new HashSet<>();
		HashSet<Character> set2 = new HashSet<>();
		
		for(char ch:str1.toCharArray()) set1.add(ch);
		for(char ch:str2.toCharArray()) set2.add(ch);
		
		return set1.equals(set2);
	}
	*/
    private static boolean stringMatch(String str1, String str2){
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        
        char[] chArr1 = str1.toCharArray();
        char[] chArr2 = str2.toCharArray();
        
        boolean flag1 = true, flag2 = true;
        
        for(int i=0; i<chArr1.length; i++){
            if(!set1.contains(chArr1[i])) set1.add(chArr1[i]);
        }
        
        for(int i=0; i<chArr2.length; i++){
            if(!set2.contains(chArr2[i])) set2.add(chArr2[i]);
        }
        
        for(int i=0; i<chArr2.length; i++){
            if(!set1.contains(chArr2[i]))    {
            	flag1 = false;
            	break;
            }
        }
        
        for(int i=0; i<chArr1.length; i++){
            if(!set2.contains(chArr1[i])) {
            	flag2 = false;
            	break;
            }
        }
		
        return flag1 && flag2;
    }
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if(stringMatch(str1, str2)) System.out.println("True");
        else System.out.println("False");
        sc.close();
    }
}

/*

Problem Statement:-
Ramu and Raju are playing a word game. They need to write a program to check if the two strings use the same base alphabets. Two strings are said to be the same if they have the same base alphabets to form the word.

Input format :-
The input contains two strings in separate lines.

Output format :-
The output displays 'True' if two strings have the same base alphabets.

Otherwise, the output displays 'False' if two strings have different base alphabets.

Code constraints :-
Input Size : |S| <= 1000000

Sample test cases :-
Input 1 :-
rescue
curse
Output 1 :-
True

Input 2 :-
domain
network
Output 2 :-
False

*/
