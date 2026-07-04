package test02072026;

import java.util.Scanner;
public class FibonacciPattern{
    private static void fiboprint(int N){
        if(N == 1)  System.out.println("0");
        else if(N == 2)  System.out.println("0 1");
        else if(N>2){
            int[] arr = new int[N];
            arr[0] = 0;
            arr[1] = 1;
            for(int i=2; i<N; i++) arr[i] = arr[i-2] + arr[i-1];
            for(int val : arr) System.out.print(val+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        fiboprint(N);
        sc.close();
    }
}

/*

Problem Statement:-
A nature enthusiast observes the growth of a specific plant sequence that mimics the Fibonacci series. In this series, the next number is found by adding up the two numbers before it. The first two numbers are 0 and 1.

Write a program to generate the first N terms of the Fibonacci series.

Input format :-
The input consists of a single integer N denoting the number of terms.

Output format :-
Print the first N terms of the series separated by space.

Refer to the sample output for the formatting specifications.

Code constraints :-
The given testcases fall under the following constraints :
N ≥ 1

Sample test cases :-
Input 1 :-
1
Output 1 :-
0

Input 2 :-
2
Output 2 :-
0 1

Input 3 :-
5
Output 3 :-
0 1 1 2 3

*/
