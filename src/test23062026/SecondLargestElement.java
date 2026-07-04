package test23062026;
import java.util.Scanner;
public class SecondLargestElement{
    public static int secondLargestInArray(int arr[], int N){
        int max1=arr[0], max2=Integer.MIN_VALUE;
        for(int i=1; i<N; i++){
            if(max1 < arr[i]){
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i] > max2)   max2 = arr[i];
        }
        return max2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++)  arr[i] = sc.nextInt();
        System.out.println(secondLargestInArray(arr, N));
        sc.close();
    }
}

/*

Problem Statement﻿:-
In a school sports event, the judges need to identify the runner-up (the student with the second-highest score). The scores are provided as a list. Note that multiple students might have the same score.

Write a program to find the second-largest distinct value in the array of scores. If no second-largest value exists (e.g., all scores are the same), print "No Second Largest".

Input format :-
The first line of input contains an integer N (number of scores).
The second line of input contains N integers separated by a space.

Output format :-
The output prints the second largest distinct score, or prints:
"No Second Largest"

Refer to the sample output for the formatting specifications.

Code constraints :-
The given testcases fall under the following constraints :
2 ≤ N ≤ 20
Scores ≥ 0

Sample test cases :-
Input 1 :-
5
10 20 30 40 50
Output 1 :-
40

Input 2 :-
5
50 50 40 30 20
Output 2 :-
40

Input 3 :-
3
10 10 10
Output 3 :-
No Second Largest

*/
