package test22062026;

import java.util.Scanner;

public class StrongNumber{ 
    private static int factorial(int n){
        if(n == 1 || n == 0)  return 1;
        return n*factorial(n-1);
    }
    private static int digitFactorialSum(int n){
        int result = 0;
        while(n != 0){
            result += factorial(n % 10);
            n /= 10;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(digitFactorialSum(n) == n)   System.out.println(n+" Strong Number");
        else System.out.println(n+" Not Strong Number");
        sc.close();
    }
}

/*

Problem Statement:-
The factorial concept was explained in Seetha's math class. Ankit discovered a connection between the sum of the factorial of digits in a number and the number itself when experimenting with numbers after understanding the idea of a factorial.

He began looking for additional numbers like this since he was so excited. Write a suitable program to check the supplied numbers to aid Ankit.

Example:-
Input:-
145
Output:-
145 Strong Number

In this case, the program reads the input integer 145 and calculates the factorial of each digit of the number (1! + 4! + 5!). It then checks if the sum of the factorials is equal to the original number, which is true for 145, so the program prints "145 Strong Number" on the console as the output.

Input format :-
The input consists of n as an integer.

Output format :-
The output displays the input integer followed by Strong Number or Not Strong Number.

Refer to the sample output for the formatting specifications.

Code constraints :-
1 <= n <= 105

Sample test cases :-
Input 1 :-
145
Output 1 :-
145 Strong Number

Input 2 :-
140
Output 2 :-
140 Not Strong Number

*/
