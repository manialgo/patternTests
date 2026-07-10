package test09062026;

import java.util.Scanner;

public class MadNumber{
	
	private static int digSum(int n){
        int sum=0;
        while(n>0){
            sum += (n%10);
            n /= 10;
        }
        return sum;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        
        int count=0;
        for(int i=1; i<=m; i++)	if((digSum(i) % 2) == 0) count++;

        System.out.println(count);
		
		sc.close();
	}
}


/*

Problem Statement:-
You have been given a Positive integer num,  A Mad is a number of positive integers less than or equal to the num whose digit sum  are even. Given a positive integer num return mad num.

Input format :-
5

Output format :-
2

Sample test cases :-
Input 1 :
5
Output 1 :-
2

*/
