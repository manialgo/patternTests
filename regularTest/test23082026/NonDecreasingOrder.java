import java.util.Scanner;
public class NonDecreasingOrder{
    
    private static boolean isNonDecreasing(int n, int[] nums){
        int count = 0;
        for(int i=0; i<=n-2; i++){
            if(nums[i] > nums[i+1]) count++;
        }
        return count <= 1;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++) nums[i] = sc.nextInt();
        
        for(int num : nums) System.out.print(num+" ");
        System.out.println();
        
        boolean result = isNonDecreasing(n, nums);
        if(result) System.out.println("true");
        else System.out.println("false");
        
        sc.close();
    }
}

/*

Problem Statement:-
Given an array nums with n integers, your task is to check if it could become non-decreasing by modifying at most one element.
We define an array as non-decreasing if nums[i] <= nums[i + 1] holds for every i (0-based) such that (0 <= i <= n - 2).

Example 1:-
Input: -
3
4 2 3

Output: -
4 2 3
true

Explanation: You could modify the first 4 to 1 to get a non-decreasing array.

Example 2:-
Input: -
3
4 2 1

Output: -
4 2 1
false

Explanation: You cannot get a non-decreasing array by modifying at most one element.

Input format :-
The first line of input consists of an integer n, representing the size of the array numbers.
The second line of input consists of n integers separated by space arr[i], representing the elements of the array numbers.

Output format :-
The first output displays the space-separated integers, representing the input array.
The second output displays a single line containing "true" if it is possible to make the array non-decreasing by modifying at most one element, and "false" otherwise.

Refer to the sample output for the formatting specifications.

Code constraints :-
1 ≤ n ≤ 10
1 ≤ arr[i] ≤ 109

Sample test cases :-
Input 1 :-
3
4 2 3

Output 1 :-
4 2 3 
true


Input 2 :-
3
4 2 1

Output 2 :-
4 2 1 
false

*/
