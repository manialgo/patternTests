import java.util.Scanner;

public class SearchInsertPosition {
	
	private static int binarySearchForTargetIndex(int[] nums, int target) {
		int left=0, right = nums.length-1;
		int mid=0;
		while(left <= right) {
			mid = right - (right - left)/2;
			if(nums[mid] == target) return mid;
			else if(nums[mid] > target) right = mid-1;
			else left = mid+1;
		}
		return left;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine().trim();
		String[] parts = line.split(" ");
		int size = parts.length;
		
		int[] nums = new int[size];
		for(int i=0; i<size; i++){
			nums[i] = Integer.parseInt(parts[i]);
		}
		
		int target = sc.nextInt();
		
		int targetIdx = binarySearchForTargetIndex(nums, target);
		System.out.println(targetIdx);
		
		sc.close();
	}
	
}

/*

Problem Statement:-

Search Insert Position:-
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O (log n) runtime complexity.

Example 1:-
Input: nums = [1,3,5,6], target = 5

Output: 2

Example 2:-
Input: nums = [1,3,5,6], target = 2

Output: 1

Example 3:-
Input: nums = [1,3,5,6], target = 7

Output: 4

Input format :-
The first line contains a space-separated integers representing the sorted array nums.
The second line contains a single integer target.

Output format :-
The output prints an integer representing the index at which the target is found or should be inserted.

Refer to the sample output for the formatting specifications.

Code constraints :-
1 ≤ length of nums ≤ 10
-102 ≤ nums[i] ≤ 102
All integers in nums are distinct and sorted in ascending order.
-10 ≤ target ≤ 25

Sample test cases :-
Input 1 :-
1 3 5 6
5
Output 1 :-
2

Input 2 :-
1 3 5 6
2
Output 2 :-
1

Input 3 :-
1 3 5 6
7
Output 3 :-
4

*/
