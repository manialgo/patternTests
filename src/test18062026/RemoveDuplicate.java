package test18062026;
import java.util.Scanner;
import java.util.HashSet;

public class RemoveDuplicate{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(char ch: str.toCharArray()){
            if(!set.contains(ch)){
                sb.append(ch);
                set.add(ch);
            }
        }
        System.out.println(sb.toString());
        sc.close();
    }
}

/*

Problem Statement:-
A user mistakenly entered a string with repeated characters, and they need to remove the duplicates to ensure each character appears only once while maintaining the original order. Neha, who is working on a text processing tool, needs to implement a function that will clean up strings by removing duplicate characters. 

Your task is to write a program that removes all duplicate characters from the string while keeping the order of the characters unchanged. 

Example:-
Input:-
aabccdeff

Output:-
abcdef

Explanantion:-
The first occurrence of each character is kept, and the duplicates are removed.

Input format :-
The first line contains a string s, which may contain repeated characters.

Output format :-
Print the string with duplicates removed, keeping the original order of characters.

Refer to the sample output for the formatting specifications.

Code constraints :-
1 ≤ len(s) ≤ 1000

Sample test cases :-
Input 1 :-
aabccdeff
Output 1 :-
abcdef

Input 2 :-
AaBbCcAa
Output 2 :-
AaBbCc

Input 3 :-
abc123abc1
Output 3 :-
abc123

Input 4 :-
hello, world,
Output 4 :-
helo, wrd

*/
