import java.util.Scanner;

public class CountSubarrays{
    
    private static int countOfSubarray(int[] nums, int n, int target){
        int count=0, sum;
        for(int i=0; i<n; i++){
            sum=0;
            for(int j=i; j<n; j++){
                sum += nums[j];
                if(sum % target == 0) count++;
            }
        }
        
        return count;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++) nums[i] = sc.nextInt();
        int target = sc.nextInt();
        
        int res = countOfSubarray(nums, n, target);
        System.out.println(res);
        
        sc.close();
    }

}


/*

Problem Statement:-
Given an integer array nums and an integer k, return the number of non-empty subarrays that have a sum divisible by k.

A subarray is a contiguous part of an array.

Example 1:-
Input: -
6
4 5 0 -2 -3 1
5

Output: -
7

Explanation:-
There are 7 subarrays with a sum divisible by k = 5:
[4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]

Example 2:-
Input:-
1
5
9

Output:-
0
Explanation:-
The sum of elements from 1st position to 5th position is 15.

Input format :-
The first line contains a single integer n, representing the size of the array nums.
The second line contains n space-separated integers arr[i], representing the elements of the array nums.
The third line contains a single integer k, representing the divisor.

Output format :-
The output displays a single integer representing the number of subarrays in nums whose sum is divisible by k.

Refer to the sample output for the formatting specifications.

Code constraints :-
1 ≤ n ≤ 10
1 ≤ arr[i] ≤100
1 ≤ k ≤ 1000

Sample test cases :-
Input 1 :-
6
4 5 0 -2 -3 1
5
Output 1 :-
7

Input 2 :-
1
5
9
Output 2 :-
0

*/
