package test13062026;

import java.util.Scanner;
public class SwimmingPool {
    public static double circleArea(int radius){
        return (3.14*radius*radius);
    }
    public static double rectArea(int length, int breadth){
        return length*breadth;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rad = sc.nextInt();
        double circle = circleArea(rad);
        int len = sc.nextInt();
        int bre = sc.nextInt();
        double rect = rectArea(len, bre);
        
        //System.out.printf("Hello World!%n%n");
        
        System.out.printf("%.2f%n",circle);
        System.out.printf("%.2f%n", rect);
        System.out.println((circle>rect)?"Circular Swimming pool covers larger area" : "Rectangular swimming pool has larger area");
        sc.close();
    }


}

/*

Problem Statement:-
Arshad works on a project to construct a 20-story building. In that building, the swimming pool area should be circular or rectangular in shape. If it is circular, then the radius of the swimming pool is X meters. If it is rectangular, then the length and breadth of the swimming pool are Y and Z meters. Arshad has to know the total area of the swimming pool (both circular and rectangular). Write a Java program to find the total area of the swimming pool (both circular and rectangular shapes) and print which swimming pool covers the largest area. The pi value is 3.14.

[Note: don’t use if else statement]

Input format :-
The first line of the input consists of a value which is the radius of the circular swimming pool
The second and third line consists of the length and breadth of the rectangular swimming pool

Output format :-
The first and second lines of the output consist of a double value with only two numbers after the decimal point.
The third line is a string that represents the largest area of the swimming pool, like a circular or rectangular one.

Refer to the sample output for format specifications.

Sample test cases :-
Input 1 :-
75
100
75
Output 1 :-
471.00
350.00
Circular Swimming pool covers larger area

Input 2 :-
2
5
6
Output 2 :-
12.56
22.00
Rectangular swimming pool has larger area

Blacklist:-
if
else
elif
else if

*/
