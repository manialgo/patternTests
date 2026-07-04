package test02072026;

import java.util.Scanner;
public class SpyNumber{
    private static boolean isSpyNumber(int N){
        int sum=0, prod=1, dig;
        while(N > 0){
            dig = N % 10;
            sum += dig;
            prod *= dig;
            N /= 10;
        }
        return sum==prod;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(isSpyNumber(N)) System.out.println("Spy Number");
        else System.out.println("Not a Spy Number");
        sc.close();
    }
}

/*

Problem Statement﻿:-
A secret service agency uses a specific number property to validate agent IDs. An ID number is considered a Spy Number if the sum of its digits equals the product of its digits.

For example, 1124 is a Spy Number because:
Sum = 1 + 1 + 2 + 4 = 8
Product = 1 * 1 * 2 * 4 = 8

Write a program to accept a number and check if it is a Spy Number.

Input format :-
The input consists of a single positive integer N.

Output format :-
Print "Spy Number" if the condition is met, otherwise print "Not a Spy Number".

Refer to the sample output for the formatting specifications.

Code constraints :-
The given testcases fall under the following constraints :
N > 0

Sample test cases :-
Input 1 :-
1124
Output 1 :-
Spy Number

Input 2 :-
224
Output 2 :-
Not a Spy Number

*/
