package test30062026;

import java.util.Scanner;
public class ClockWiseRotation {
    private static void clockwiseRotation(int[] nums){
        int size = nums.length, temp = nums[size-1];
        for(int i=size-1; i>=1; i--) nums[i] = nums[i-1];
        nums[0] = temp;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i=0; i<size; i++) nums[i] = sc.nextInt();
        int K = sc.nextInt();
        for(int i=0; i<K; i++) clockwiseRotation(nums);
        for(int num: nums) System.out.println(num);
        sc.close();
    }
}

/*

Problem Description -: 
Given an array Arr[ ] of N integers and a positive integer K. The task is to cyclically rotate the array clockwise by K.

Input format :
First input consists of array size.
Second input consists of array elements.
Third input consists of positive integer

Output format :
Output consists of values of clockwise rotation

Sample test cases :
Input:-
5

1
2
3
4
5

2

Output:-
4
5
1
2
3

*/