package test09062026;

import java.util.Scanner;

public class TicketAllocation{
  
    private static String ticketSystem(int n){
        if(n<15) return "Child Ticket";
        return "Adult Ticket";
    }
  
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(ticketSystem(n));
        sc.close();
    }
  
}

/*

Problem Statement:-
Rani is managing an entertainment venue, and she wants to automate the ticketing process based on the age of the attendees. She needs a simple program that can classify tickets as either "Child Ticket" or "Adult Ticket" based on the age provided.

Write a program named TicketType that takes an integer input representing the age of the attendee and determines the type of ticket they should receive.

If the age is less than 15, the attendee gets a "Child Ticket"; otherwise, they get an "Adult Ticket."

Input format :-
The input consists of an integer representing the age of the attendee.

Output format :-
The output displays the following format:

If the age is less than 15, print "Child Ticket".
If the age is 15 or older, print "Adult Ticket".

Refer to the sample output for the formatting specifications.

Code constraints :-
1 <= age <= 200

Sample test cases :-
Input 1 :-
20
Output 1 :-
Adult Ticket

Input 2 :-
12
Output 2 :-
Child Ticket

*/
