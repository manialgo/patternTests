package test09062026;

import java.util.Scanner;

public class LuckyWinner{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n%10 ==3 || n%10 ==8) System.out.println("Lucky Winner");
        else System.out.println("Not a Lucky Winner");
        sc.close();
    }

}

/*

Problem Statement:-
Create a program to determine if the last digit of a visitor's ticket is 3 or 8. The "Fantasy Kingdom" amusement park held its opening ceremony, and the park administration offered several lucky prizes to the guests on the first day. The attendees whose ticket numbers have the last digit of 3 or 8 are therefore determined to be the lucky winners, and appealing rewards are waiting to be presented.

Input format :-
The input consists of an integer representing the ticket number.

Output format :-
The output displays the following format:

If the last digit of the ticket number is 3 or 8, print "Lucky Winner".
If the last digit is not 3 or 8, print "Not a Lucky Winner."

Refer to the sample output for the formatting specifications.

Code constraints :-
1 <= n <= 109

Sample test cases :-
Input 1 :-
43
Output 1 :-
Lucky Winner

Input 2 :-
41
Output 2 :-
Not a Lucky Winner
Code Size : 1024 kb

Whitelist:-
if
else

*/
