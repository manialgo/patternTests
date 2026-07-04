package test02072026;

import java.util.Scanner;
public class CollatzConjecture{
    private static int processedSteps(int n){
        if(n == 1) return 0;
        if(n % 2 ==0 ) return (1+ processedSteps(n/2));
        return (1+ processedSteps(3*n + 1));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1) System.out.println("Steps: 0");
        else System.out.println("Steps: "+processedSteps(n));
        sc.close();
    }
}

/*

Problem Statement﻿:-
A researcher is studying the Collatz conjecture (also known as the 3n + 1 problem). The sequence is defined as follows for any positive integer n:
- If n is even, divide it by 2.
- If n is odd, multiply it by 3 and add 1.
- Repeat the process until n becomes 1.

Write a program that inputs an integer n and counts the number of steps required for n to reach 1.
Input format :-
The input consists of a single integer n.

Output format :-
Print a single line in the format:

"Steps: [Count]"

Refer to the sample output for the formatting specifications.

Code constraints :-
The given testcases fall under the following constraints :
n ≥ 1

Sample test cases :-
Input 1 :-
1
Output 1 :-
Steps: 0

Input 2 :-
2
Output 2 :-
Steps: 1

Input 3 :-
6
Output 3 :-
Steps: 8

*/
