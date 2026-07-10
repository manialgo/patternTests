package test10072026;

import java.util.Scanner;

public class SmallestSubArraySum{
  
    private static int smallSubArray(int[] nums, int size, int target){
        int sum=0, start=0, end, len=0, result=size;
        for(end=0; end<size; end++){
            sum  += nums[end];
            while(sum > target){
                len = end-start+1;
                sum -= nums[start];
                start++;
                result = Math.min(result, len);
            }
        }
        if(result==size) return -1;
        return result;
    }
  
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i=0; i<size; i++) nums[i]=sc.nextInt();
        int target = sc.nextInt();
        
        int result = smallSubArray(nums, size, target);
        
        if(result==-1) System.out.println("Not Possible");
        else System.out.println(result);
        
        sc.close();
    }
  
}

/*

Problem Statement:-
Given an array arr[] of integers and a number x, write a program to find the smallest subarray with a sum greater than the given value. 

Example 1:
Input:-
arr[] = {1, 4, 45, 6, 0, 19}, x = 51

Output: -
3

Explanation:-
The sum of the subarray {4, 45, 6} is 55, which is greater than the given value 51. So, return 3, the length of the subarray.

Example 2:-
Input:-
arr[] = {1, 2, 4},  x = 8

Output:-
Not Possible

Explanation:-
The whole array sum is smaller than 8. So, print "Not Possible".

Input format :-
The input consists of an integer n, representing the number of elements in the array.
The second line of input consists of n integers, arr[i] representing the array elements, separated by space.
The third line of input consists of the value of x.

Output format :-
The output prints the smallest subarray with a sum greater than x, separated by a space.
If no such sum exists, print "Not Possible".

Refer to the sample output for the formatting specifications.

Code constraints :-
1 ≤ n ≤ 15
0 ≤ arr[i] ≤ 1000
0 ≤ x ≤ 1000

Sample test cases :-
Input 1 :-
6
1 4 45 6 0 19
51
Output 1 :-
3

Input 2 :-
3
1 2 4
8
Output 2 :-
Not Possible

*/
