package test20062026;

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

Problem  statement:-
Write a program to get an integer array find the second largest element (where array has only distinct elements)

Input format :-
Value of N in first line
N number of elements separated by single space in next line

Output format :-
Second largest number in array

Code constraints :-
N>0

Sample test cases :-
Input 1 :-
10
2 10 11 20 -5 40 60 90 1 100
Output 1 :-
90

*/
