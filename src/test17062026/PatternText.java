package test17062026;

import java.util.Scanner;
public class PatternText {
    public static void search(char[]text, String patt){
        int textSize = text.length;
        int pattSize = patt.length();
        if(pattSize > textSize) {
        	System.out.println("Pattern not found!");
        	return ;
        }
        int i=0, j;
        StringBuilder sb = new StringBuilder();
        while(i <= textSize-pattSize){
            j=0;
            while(j<pattSize){
                sb.append(text[i+j]);
                //i+j only repeats the substring
                j++;
            }
            if(sb.toString().equals(patt)) System.out.println("Pattern found at index "+ i);
            sb.delete(0, sb.length());
            i++;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        char[] text = str1.toCharArray();
        search(text, str2);
        sc.close();
        
    }
}

/*

Problem Statement:-
Given a text txt [0 . . . N-1] and a pattern pat [0 . . . M-1], write a function search (char pat [], char txt []) that prints all occurrences of pat [] in txt []. You may assume that N > M. Use zero-based indexing while returning the indices. 

Example:-
Input:-
txt [] = “THIS IS A TEST TEXT”, pat [] = “TEST”

Output:-
Pattern found at index 10

Input:-
txt [] = “AABAACAADAABAABA”, pat [] = “AABA”

Output:-
Pattern found at index 0, Pattern found at index 9, Pattern found at index 12

Input format :-
The first line of input consists of a string txt, in which the pattern is to be searched.
The second line of input consists of a string pat, the pattern that needs to be found in the text.

Output format :-
For each occurrence of the pattern in the text, print "Pattern found at index X" in a new line, where X the indices where the pattern is found within the text string.

Refer to the sample output for the formatting specifications.

Code constraints :-
The text and the pattern will only contain uppercase and lowercase English letters.
1 ≤ length of txt ≤ 50
1 ≤ length of pat ≤ 10

Sample test cases :-
Input 1 :-
THIS IS A TEST TEXT
TEST
Output 1 :-
Pattern found at index 10

Input 2 :-
AABAACAADAABAABA
AABA
Output 2 :-
Pattern found at index 0
Pattern found at index 9
Pattern found at index 12

Input 3 :-
agd
g
Output 3 :-
Pattern found at index 1

Input 4 :-
ABABDABACDABABCABAB
ABABCABAB
Output 4 :-
Pattern found at index 10

*/
