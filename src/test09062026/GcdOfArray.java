package test09062026;

import java.util.Scanner;
import java.util.Arrays;

public class GcdOfArray{
	
    private static int gcd(int dividend, int divisor){
        int remainder = dividend % divisor;
        while(remainder != 0){
            dividend = divisor;
            divisor = remainder;
            remainder = dividend % divisor;
        }
        return divisor;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i]=sc.nextInt();
        
        Arrays.sort(arr);
        /* initial sort for traversing from the last highest element
         * go for finding the gcd of last two element and traverse from the last to 0th index
         */
        
        int val, move=n-1;
        val = gcd(arr[move], arr[move-1]);
        move -= 2;
        
        while(move >= 0){
            val = gcd(val, arr[move]);
            move--;
        }
        
        System.out.println(val);
        sc.close();
    }
    
}

/*

Problem description:-
The greatest common divisor (GCD), also called the highest common factor (HCF) of N numbers is the largest positive integer that divides all numbers without giving a remainder. Write an algorithm to determine the GCD of N positive integers.	

Example:-
Input:-
5
2 4 6 8 10

Output:-
2

Explanation:-
The largest positive integer that divides all the positive integers 2, 4, 6, 8, 10 without a remainder is 2. So, the output is 2.

Input format :-
The first line of the input consists of an integer num, representing the number of positive integers (N). The second line consists of N space-separated integers representing the list of positive integers.

Output format :-
Print an integer representing the GCD of the given positive integers.

Sample test cases :-
Input 1 :-
5
2 4 6 8 10
Output 1 :-
2

Input 2 :-
4
12 36 72 144
Output 2 :-
12

*/
