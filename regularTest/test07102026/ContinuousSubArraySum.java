/*
Problem Statement:
Given a binary array nums and an integer goal, return the number of non-empty subarrays with a sum goal.
A subarray is a contiguous part of the array.

Example 1
Input: 
5
1 0 1 0 1
2
Output: 
4

Explanation:
The 4 subarrays are:
[1,0,1]
[1,0,1,0]
[0,1,0,1]
[1,0,1]

Example 2
Input:
5
0 0 0 0 0
0

Output:
15

Explanation:
In the given array [0, 0, 0, 0, 0], all elements are 0. So, multiple subarrays have a sum of 0. These include single-element subarrays [0], double-element subarrays [0, 0], triple-element subarrays [0, 0, 0], and so on, up to the entire array [0, 0, 0, 0, 0].

Additionally, any combination of contiguous zeros within the array will also have a sum of 0. This results in a total of 15 non-empty subarrays with a sum equal to 0.
Input format :
The first line contains an integer N representing the size of the array.
The second line contains n integers separated by space, representing the elements of the array (0 or 1).
The third line contains an integer goal, the target sum.

Output format :
The output displays an integer, representing the number of non-empty subarrays with a sum equal to the goal.

Refer to the sample output for the formatting specifications.

Code constraints :
1 ≤ N ≤ 10
Array elements should be either 0 or 1.
0 ≤ goal ≤ 10

Sample test cases :
Input 1 :
5
1 0 1 0 1
2
Output 1 :
4

Input 2 :
5
0 0 0 0 0
0
Output 2 :
15
*/

import java.util.Scanner;

public class ContinuousSubArraySum{
    private static int atMost(int nums[], int k) {
        if(k < 0) return 0;
        int start = 0, count = 0, sum = 0;
        for(int end = 0; end < nums.length; end++) {
            sum += nums[end];
            while(sum > k) {
                sum -= nums[start++];
            }
            count += end - start + 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        
        int res = atMost(nums, k) - atMost(nums, k-1);
        System.out.println(res);
        sc.close();
    }

}
