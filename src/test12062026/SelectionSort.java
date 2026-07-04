package test12062026;
import java.util.Scanner;
public class SelectionSort {
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++) arr[i] = sc.nextInt();
		int run, minInt;
		for(int j=0; j<size-1; j++) {
			minInt = j;
			run = j +1;
			while(run < size) {
				if(arr[run] < arr[minInt]) minInt = run;
				run++;
			}
			//if(j != minInt) If not there no issues just a swap happens between the same element we know
				swap(arr, j, minInt);
		}
		for(int num:arr)System.out.print(num+" ");
		sc.close();
	}
}

/*

Problem Statement:-
Given an array nums with n objects colored red, white, or blue, sort them in place so that objects of the same color are adjacent, with the colors in the order red, white, and blue. We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function. Use the Selection sort algorithm.

Example 1:-
Input:-
6
2 0 2 1 1 0

-Output:
0 0 1 1 2 2 

Input format :-
The first line contains an integer n, representing the number of elements in the array.

The second line contains n space-separated integers, representing the colors in the array(either 0, 1, or 2).

Output format :-
The output prints a single line containing the sorted array of colors separated by a comma within a square bracket.

Code constraints :-
n == nums.length
1 ≤ n ≤ 300
nums[i] is either 0, 1, or 2.

Sample test cases :-

Input 1 :-
6
2 0 2 1 1 0
Output 1 :-
0 0 1 1 2 2 


Input 2 :-
3
2 0 1
Output 2 :-
0 1 2 

*/
