package test02072026;

import java.util.Scanner;
public class CipherKey {
    private static void keyTool(String s){
        char[] sArr = s.toCharArray();
        int size = sArr.length;
        int[] freqLower = new int[26];
        int[] freqUpper = new int[26];
        char temp;
        int maxLower=Integer.MIN_VALUE, maxUpper=Integer.MIN_VALUE;
        int valUpper=0, valLower=0;
        for(int i=0; i<size; i++){
            temp = sArr[i];
            if(temp >= 'A' && temp <= 'Z')  freqUpper[temp-'A']++;
            if(temp >= 'a' && temp <= 'z')  freqLower[temp-'a']++;
        }
        for(int i=0; i<26; i++){
            if(freqUpper[i] > maxUpper) {
                maxUpper = freqUpper[i];
                valUpper = i;
            }
            if(freqLower[i] > maxLower) {
                maxLower = freqLower[i];
                valLower = i;
            }
        }
        if(maxUpper > maxLower) System.out.println((char) (97+valUpper) + " " + maxUpper);
        else System.out.println((char) (97+valLower) + " " + maxLower);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        keyTool(s);
        sc.close();
    }
}

/*

Problem Statement:-
In cryptography, frequency analysis is used to break substitution ciphers. You need to create a tool that analyzes a string and finds the character that appears most frequently.
Write a program that takes a string as input and prints the character with the highest frequency. If there is a tie, print the one that appears first alphabetically (based on ASCII value).

Input format :-
The input consists of a single string.

Output format :-
Print the most frequent character followed by its count, separated by a space.
If more than one character had the same count print the one that appears first.

Refer to the sample output for the formatting specifications.

Code constraints :-
The given testcases fall under the following constraints :
String length ≤ 100

Sample test cases :-

Input 1 :-
success
Output 1 :-
s 3

Input 2 :-
banana
Output 2 :-
a 3

*/