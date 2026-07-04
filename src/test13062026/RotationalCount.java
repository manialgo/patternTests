package test13062026;
import java.util.Scanner;

public class RotationalCount {
    private static int[] reverse(int[] arr){
        int size = arr.length, temp, i=0;
        temp = arr[0];
        while(i<size-1) {
        	arr[i] = arr[i+1];
        	i++;
        }
        arr[size-1]=temp;
        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++)arr[i]=sc.nextInt();
        int sum, maxSum=0, j=0;
        for(int i=0; i<size; i++){
            sum=0;j=0;
            for(int num:arr) {
            	sum = sum + (num*j);
            	j++;
            }
            maxSum = (maxSum > sum) ? maxSum : sum; 
            reverse(arr);
        }
        System.out.println(maxSum);
        sc.close();
    }
}

/*

Problem Statement:-
Ram wants to test Raju's knowledge of her programming skills, so she gave her a tough task to test her. Given an array arr[] of N integers, write a program to find the maximum that maximizes the sum of the value of i*arr[i] where i varies from 0 to n-1.

Example:-
Input:-
4
8 3 1 2

Output:-
29

Explanation:-
Let us see all rotations
{8, 3, 1, 2} = 8*0 + 3*1 + 1*2 + 2*3 = 11
{3, 1, 2, 8} = 3*0 + 1*1 + 2*2 + 8*3 = 29
{1, 2, 8, 3} = 1*0 + 2*1 + 8*2 + 3*3 = 27
{2, 8, 3, 1} = 2*0 + 8*1 + 3*2 + 1*1 = 17

The maximum value among them is 29.

Input format :-
The first input is an integer that denotes N, the size of the array.
The second input consists of series of integers separated by space that denotes the array values.

Output format :-
Output is an integer that denotes the maximum sum.

Sample test cases :-
Input 1 :-
4
8 3 1 2
Output 1 :-
29

Input 2 :-
5
32 45 89 56 12
Output 2 :-
613

*/
