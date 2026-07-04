package test13062026;
import java.util.Scanner;
public class APGP {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++) arr[i]=sc.nextInt();
        int term=0;
        if((arr[size-1]-arr[size-2]) == (arr[size-2]-arr[size-3])){
            //int a = arr[0];
            int d = arr[size-1]-arr[size-2];
            //term = a + (size*d);
            term = arr[size-1]+d;
        }
        if((arr[size-1]*arr[size-3]) == (arr[size-2]*arr[size-2])){
            //int a = arr[0];
            int r = arr[size-1]/arr[size-2];
            //for(int i=0; i<size; i++)   r *= r;
            //term = a*r;
            term = arr[size-1]*r;
        }
        System.out.println(term);
        sc.close();
    }

}
/*

Problem Statement:-
Tamil isn't really good at math, but his sadistic teacher still gave him some math exercises about sequences. He needs to find the next number of the given sequence, which can be one of the following two types:
1.Arithmetic progression
2.Geometric progression

You are given numbers in the series as a string n, in which the numbers are separated by commas. Write a program to help Tharun to figure out what type of sequence it is, and return the next number.

Note:-
The input string contains a minimum of four integers separated by a comma.
   1) Arithmetic Progression - It is a sequence of numbers such that the difference between the consecutive terms is constant.
   2) Geometric progression - It is a sequence of numbers where each term after the first is found by multiplying the previous one by a fixed, non-zero number called the common ratio.

Example 1:-

Input
4
2 4 6 8

Output:-
10

Explanation:-
For sequence = "5,10,20,40,80", the output should be 160.
The sequence has a common ratio, r = 2.

Input format :-
The first line consists of a string that denotes n.

Output format :-
The output is an integer that denotes the number which completes the sequence

Sample test cases :-
Input 1 :-
4
2 4 6 8
Output 1 :-
10

Input 2 :-
5
5 10 20 40 80
Output 2 :-
160

*/
