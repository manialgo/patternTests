package test13062026;
import java.util.Scanner;

public class ReverseANumber {
	   public static int reverse(int n){
	        int dig=0, rev=0;
	        while(n > 0){
	            dig = n %10;
	            rev = rev*10+dig;
	            n /= 10;
	        }
	        return rev;
	    }
	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        System.out.println(reverse(n));
	        sc.close();
	    }
}

/*

Problem Statement:-
In the Mini Project, the 7th module is to reverse a number. Rita allotted this task to Malini. Test the program and report the results obtained. Help Malini to write a program to reverse a number. 

Input format :-
The input consists of an integer.

Output format :-
The output prints the reverse of the number.

Refer to the sample output for formatting specifications.

Sample test cases :-
Input 1 :-
123
Output 1 :-
321

Input 2 :-
4567
Output 2 :-
7654

*/
