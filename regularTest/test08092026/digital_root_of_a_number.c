#include<stdio.h>

int digital_root(int n){
    int sum;
    while(n >= 10){
        sum = 0;
        while(n > 0){
            sum += n %10;
            n /= 10;
        }
        n = sum;
    }
    return sum;
}

int main(){
    int n, sum;
    scanf("%d", &n);
    int root_value = digital_root(n);
    printf("%d", root_value);
    return 0;
}

/*

Problem Statement:-
Swetha is working with numbers and wants to calculate the digital root of a number. The digital root is obtained by repeatedly summing the digits of a number until a single-digit number is left.

Write a program that reads a number and finds its digital root using a while loop.

Input format :-
The input contains a single integer representing the number n.

Output format :-
The output prints a single integer representing the final single-digit result.

Refer to the sample output for formatting specification

Code constraints :-
The given testcases falls under the following constrains:
﻿1 ≤ N ≤ 109

Sample test cases :-
Input 1 :-
9875
Output 1 :-
2

Input 2 :-
999
Output 2 :-
9

*/
