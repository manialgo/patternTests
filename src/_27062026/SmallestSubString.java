package _27062026;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class SmallestSubString {
	private static int conversion(int[] arr, int size) {
		Map<Integer, Integer> count = new HashMap<>();
		Map<Integer, Integer> firstSeen = new HashMap<>();
		Map<Integer, Integer> lastSeen = new HashMap<>();
		
		int degree = 0, num, result=size, left, right, length;
		for(int i=0; i<size; i++) {
			num = arr[i];
			if(!firstSeen.containsKey(num)) firstSeen.put(num, i);
			lastSeen.put(num, i);
			count.put(num, count.getOrDefault(num, 0)+1);
			
			if(count.get(num) > degree)	degree = count.get(num);
		}
		for(Integer val : count.values()) {
			if(val==degree) {
				left = firstSeen.get(val);
				right = lastSeen.get(val);
				length = right - left + 1;
				result = (length < result) ? length: result;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size  = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++)	arr[i] = sc.nextInt();
		System.out.println(conversion(arr, size));
		sc.close();
	}
}

/*

Problem Statement:-

Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements. Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.

Example:-

Input
n = 5, nums = [1,2,2,3,1]
Output
2

Explanation:-

The input array has a degree of 2 because both elements 1 and 2 appear twice.
Of the subarrays that have the same degree:
[1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
The shortest length is 2. So return 2.


Input format :-
The first line of the input is the length of the array.
The second line of the input is the space-separated array of integer elements.

Output format :-
The output is the integer element representing the degree of the element.

Refer to the sample input and output for formatting specifications.

Code constraints :-
nums length will be between 1 and 50,000.
nums[i] will be an integer between 0 and 49,999.

Sample test cases :-
Input 1 :-
5
1 2 2 3 1
Output 1 :-
2

Input 2 :-
7
1 2 2 3 1 4 2
Output 2 :-
6

*/
