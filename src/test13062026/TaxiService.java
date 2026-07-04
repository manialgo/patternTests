package test13062026;
import java.util.Scanner;
public class TaxiService {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long D = sc.nextInt();
        
        long Oc = sc.nextInt();
        long Of = sc.nextInt();
        long Od = sc.nextInt();
        
        long Cs = sc.nextInt();
        long Cb = sc.nextInt();
        long Cm = sc.nextInt();
        long Cd = sc.nextInt();
        
        long onlineTaxi = Oc + ((D-Of)*Od);
        
        
        long time= (long) D/Cs;
        long classicTaxi = Cb + (time*Cm) +(D*Cd);
        
        if(onlineTaxi<=classicTaxi)  System.out.println("Online Taxi");
        else System.out.println("Classic Taxi");
        
        sc.close();
    }
}

/*

Problem Statement:-
Taxi Service

Alice has the following two types of taxis:-
Online taxi: It can be booked by using an online application on phones 
Classic taxi: It can be booked anywhere on the road

Write a C program that helps to determine whether to choose an online taxi or a classic taxi based on the distance to travel, the fare for an online taxi, and the fare for a classic taxi.

Question Instructions:-
The program then calculates the total cost of taking the online taxi as "o_cost" and the total cost of taking the classic taxi as "c_cost."
It then compares both costs and prints the output as "Online Taxi" if "o_cost" is less than or equal to "c_cost," or else it prints "Classic Taxi."

Input format :-
The first line consists of the single integer D that denotes the distance from your house to the office
The next line consists of the three integers Oc , Of and Od 

Oc is the fares for online taxi 'Oc'
The fares for the first 'Of' km is 'Of'
'Od' for every km afterward.
The next line consists of the four integers Cs , Cb ,Cm and Cd

the fares for classic taxi 'Cs' for speed in km per minute,
'Cb' for base fare
'Cm' for cost per minute
'Cd' for cost per km.

Output format :-
The output consists of a string. If you select an online taxi to travel, then print the string 'Online Taxi'. Otherwise, select "Classic Taxi". It can print this string on a new, single line.

Refer to the sample output for formatting specifications.

Code constraints :-
1<= D, Oc , Of , Od , Cs , Cb ,Cm and Cd <=109

Sample test cases :-
Input 1 :-
13
6 7 4
4 2 1 2
Output 1 :-
Online Taxi

Input 2 :-
636374903
1 616932249 809021696
1 6946106 8702338 8810711
Output 2 :-
Classic Taxi

*/
