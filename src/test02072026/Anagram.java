package test02072026;

import java.util.Scanner;
public class Anagram {
    private static boolean isAnagram(String s1, String s2){
        int[] freq = new int[26];
        char[] s1Arr = s1.toCharArray();
        char[] s2Arr = s2.toCharArray();
        int size1 = s1.length();
        int size2 = s2.length();
        if(size1 != size2) return false;
        char temp;
        for(int i=0; i<size1; i++){
            temp = s1Arr[i];
            if(temp >= 'a' && temp <='z') freq[temp-'a']++;
            if(temp >= 'A' && temp <= 'Z') freq[temp-'A']++;
            temp = s2Arr[i];
            if(temp >= 'a' && temp <='z') freq[temp-'a']--;
            if(temp >= 'A' && temp <= 'Z') freq[temp-'A']--;
        }
        for(int j=0; j<26; j++) if(freq[j] !=0) return false;
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if(isAnagram(s1, s2)) System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        sc.close();
    }
}



/*

Problem Statement ﻿:-
A digital archivist is restoring ancient text files where two words are believed to be related if they are Anagrams of each other. Anagrams contain the exact same characters with the same frequencies, just arranged differently.
Write a program that accepts two strings and determines if they are Anagrams. The check should be case-insensitive (treat 'A' and 'a' as the same).

Input format :-
The input consists of two strings separated by a space on a single line.

Output format :-
Print "Anagrams" if they are anagrams, otherwise print "Not Anagrams".

Refer to the sample output for the formatting specifications.

Code constraints :-
The given testcases fall under the following constraints :-
String length ≤ 100
Strings contain alphanumeric characters.

Sample test cases :-
Input 1 :-
listen silent

Output 1 :-
Anagrams

Input 2 :-
Hello World

Output 2 :-
Not Anagrams

*/