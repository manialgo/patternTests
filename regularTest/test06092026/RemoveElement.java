import java.util.Scanner;

public class RemoveElement {
	
	private static int[] alignElement(int[] nums, int val) {
		int left=0, right=nums.length-1;
		while(left<right) {
			while(left < right && nums[right] == val) {
				nums[right] = -1;
				right--;
			}
			if(nums[left] == val) {
				nums[left] = nums[right];
				nums[right] = -1;
				right--;
			}
			left++;
		}
		return nums;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine().trim();
		line = line.substring(1, line.length()-1);
		
		String[] parts = line.split(",");
		int size = parts.length;
		
		int[] nums = new int[size];
		for(int i=0; i<size; i++){
			nums[i] = Integer.parseInt(parts[i].trim());
		}
		
		int val = sc.nextInt();
		int[] res = alignElement(nums, val);
		int count=0;
		for(int num : res) if(num != -1) count++;
		
		System.out.print(count+", nums = [");
		for(int i=0; i<size; i++) {
			if(res[i]!= -1) {
				System.out.print(res[i]);
				if(i<count-1) System.out.print(", ");
			}
		}
		System.out.print("]");
		
		sc.close();
	}

}

/*

Problem Statement:-
Remove Element:-

Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.

Return k.

Example 1:-
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]

Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).

Example 2:-
Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]

Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.

Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).

Input format :-
The first line of input contains the array in the format: [num1, num2, num3, ...].
The second line of input contains the integer val (the element to be removed from the array)

Output format :-
The output prints an integer, representing the new length of the array after removing all instances of the given value, followed by the modified array in the format: length, nums = [remaining elements]
Only the first length elements of the array should be printed in the result.

Refer to the sample output for formatting specifications.

Code constraints :-
0 ≤ nums.length ≤ 100
0 ≤ nums[i] ≤ 50
0 ≤ val ≤ 100

Sample test cases :-
Input 1 :-
[3, 2, 2, 3]
3
Output 1 :-
2, nums = [2, 2]

Input 2 :-
[0, 1, 2, 2, 3, 0, 4, 2]
2
Output 2 :-
5, nums = [0, 1, 3, 0, 4]

*/
