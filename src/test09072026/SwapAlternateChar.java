package test09072026;

import java.util.Scanner;

public class SwapAlternateChar{
  
    private static String swapping(char[] chArr, int size){
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<size; i+=2){
            sb.append(chArr[i]);
            sb.append(chArr[i-1]);
        }
        if(size % 2 != 0) sb.append(chArr[size-1]);
        return sb.toString();
    }
  
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] chArr = s.toCharArray();
        int size = chArr.length;
        System.out.println(swapping(chArr, size));
        sc.close();
    }
  
}

/*

Problem Statement:-
A text formatting tool modifies a given string by swapping alternate characters to create a stylized output.

The swapping rules are:-
Swap the characters at positions 0 and 1, 2 and 3, 4 and 5, and so on.
If the string has an odd length, the last character remains unchanged.
The swapping must preserve the original character cases and spaces.

Write a program to generate and print the modified string after swapping alternate characters.

Input format :-
The input consists of a string S.

Output format :-
The output prints a string representing the modified string after swapping alternate characters.

Refer to the sample output for the formatting specifications.

Code constraints :-
The given testcases fall under the following constraints:
1 ≤ Length of string ≤ 200
String contains alphabetic characters

Swapping is done based on character positions

Sample test cases :-
Input 1 :-
listen
Output 1 :-
iltsne

Input 2 :-
hello
Output 2 :-
ehllo

Input 3 :-
rat
Output 3 :-
art

*/
