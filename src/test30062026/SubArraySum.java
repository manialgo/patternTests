package test30062026;

import java.util.Scanner;
public class SubArraySum {
	private static int[] indexFound(int size, int[] nums, int target) {
		int start = 0, end=0, sum=0;
		while(start<=end && end<size) {
			sum += nums[end];
			if(sum == target) return new int[] {start+1, end+1};
			else if(sum < target) end++;
			else {
				sum -= nums[start];
				start++;
			}
		}
		return new int[] {0,0};
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int target = sc.nextInt();
		int[] nums = new int[size];
		for(int i=0; i<size; i++) nums[i] = sc.nextInt();
		int[] result = indexFound(size, nums, target);
		if(result[0]==0 && result[1]==0) System.out.println("-1");
		else System.out.println(result[0]+" "+result[1]);
		sc.close();
	}
}



/*

Problem Statement:-

Given an array A of size N that contains only non-negative integers, find a continuous sub-array that adds to a given number S and return the left and right indexes of that sub-array. In the case of multiple subarrays, return the subarray indexes that come first when moving from left to right.
Note: Both the indexes in the array should be according to 1-based indexing. You have to return an array list consisting of two elements, left and right. If no such subarray exists, return an array consisting of element -1.

Example:-

Input:-
N = 5, S = 12
A[5] = {1,2,3,7,5}

Output:-
2 4

Explanation:-
The sum of elements from the 2nd position to the 4th position is 12.

Input format :-
The first line of input consists of the length of the array, N.
The second line of input consists of the sum of the sub-arrays to be searched, S.
The third line of input consists of N space-separated array elements.

Output format :-
The output prints two space-separated integers, representing the start and end index positions of the subarray respectively whose sum is S.
If no such subarray exists, return an array consisting of element -1.

Code constraints :-
In this scenario, the test cases fall under the following constraints:
1 ≤ N ≤ 105
1 ≤ array elements ≤ 109

Sample test cases :-

Input:-
5
12
1 2 3 7 5

Output:-
2 4

*/
