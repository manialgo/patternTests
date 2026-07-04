package test13062026;
import java.util.Scanner;
public class HillClimb {
	public static int steps(int n) {
		if(n<=1) return 1;
		if(n==2) return 2;
		return steps(n-1)+steps(n-2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		if(n < 3) System.out.println(n);
		else {
			int prev1 = 2;
			int prev2 = 1;
			for(int i=3; i <=n; i++) {
				sum = prev1 + prev2;
				prev2 = prev1;
				prev1 = sum;
			}
		}
		System.out.println(sum);
		sc.close();
	}
}

/*

Problem Statement:-
Ram is climbing a Hill temple that contains steps that are made of stones. There are total 'n' steps on the hill.
Each time he can either climb 1 or 2 steps. In how many distinct ways can he climb to the top?

Write a program to find the number of distinct ways to reach the top.

Note:-
Given n will be a positive integer.

Example:-

Input:-
3

Output:-
3

Explanation:-
The number of steps = 3.
The distinct ways to climb to the top are:
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
Therefore there are 3 distinct ways.

Input format :-
The first line contains a single integer the denotes the number of steps, n.

Output format :-
The output is an integer that denotes the number of ways to climb to the top.

Sample test cases :-
Input 1 :-
3
Output 1 :-
3

*/
