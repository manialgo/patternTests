#include <stdio.h>

int total_steps_in_n_days(int n){
    if(n==1) return 1;
    return n + total_steps_in_n_days(n-1);
}

int main(){
    int n;
    scanf("%d", &n);
    int total_steps = total_steps_in_n_days(n);
    printf("%d", total_steps);
    return 0;
}

/*

Problem Statement:-
Rio is training for a fitness challenge. He climbs a certain number of stairs each day, starting from 1 stair on the first day, 2 stairs on the second day, and so on. He wants to know how many total stairs he climbs in N days.

Write a program that reads N (number of days) and calculates the total number of stairs Rio climbs using a loop.

Input format :-
The input contains a single integer representing the upper limit n.

Output format :-
The output prints an integer representing the total number of stairs rio climbs.

Refer to the sample output for formatting specification

Code constraints :-
The given testcases falls under the following constrains:
﻿1 ≤ N ≤ 100000

Sample test cases :-
Input 1 :-
5
Output 1 :-
15

Input 2 :-
10
Output 2 :-
55

*/
