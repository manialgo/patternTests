package test15062026;

import java.util.Scanner;
public class NumberOfCarriesCount {
    public static int NumberOfCarries(int num1, int num2){
        int dig1 = 0, dig2=0, carry =0;
        int count=0;
        while(num1 > 0 && num2 > 0){
            dig1 = num1 % 10;
            dig2 = num2 % 10;
            if(dig1 + dig2 + carry >= 10) {
                count++;
                carry = 1;
            }
            num1 /= 10;
            num2 /= 10;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(NumberOfCarries(num1, num2));
        sc.close();
    }
}

/*

Problem Statement :-
A carry is a digit that is transferred to the left if the sum of digits exceeds 9 while adding two numbers from right-to-left one digit at a time.

You are required to implement the following function:
int NumberOfCarries(int num1, int num2); 

The functions accept two numbers ‘num1’ and ‘num2’ as their arguments. You are required to calculate and return the total number of carriers generated while adding digits of two numbers ‘num1’ and ‘ num2’.

Assumption:-
num1, num2 >= 0 

Example:-
Input:-
451 
349 
Output:-
2 

Explanation:-
Adding ‘num 1’ and ‘num 2’ right-to-left results in 2 carries since ( 1+9) is 10. 1 is carried and (5+4=1) is 10, again 1 is carried. Hence 2 is returned. 

Input format :-
Input integers are the values of num1 & num2 respectively in separate lines.

Output format :-
The output prints the number of carrying operations.

Sample test cases :-
Input 1 :-
451
349
Output 1 :-
2

Input 2 :-
456
789
Output 2 :-
3

*/
