package test07072026;

import java.util.Scanner;

class Solution{

    int[] zeroMover(int[] nums, int size){
        int temp, i, j=0;
        for(i=0; i<size; i++){
            if(nums[i]==0){
                for(j=i+1; j<size; j++) if(nums[j] != 0) break;
            }
            if(j==size) break;
            else{
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;                
            }
        }
        return nums;
    }
}

public class ZeroMovingProblem{
  
    public static void main(String[] args){
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i=0; i<size; i++) nums[i]=sc.nextInt();
      
        int[] result = sol.zeroMover(nums, size);
        for(int i=0; i<size; i++) System.out.print((i==size-1) ? result[i] : result[i]+" ");
        sc.close();
    }
  
}

/*

Problem Statement:-
Write a program that takes an integer array and its length as input. Implement the function to modify the array such that all the 0’s are moved to the end of the array. 

Input format :-
The first input integer is the size of the array.
The next line of integers is the array elements.

Output format :-
The output is the modified array with all zeros moved to the right side.

Sample test cases :-
Input 1 :-
10
1 9 8 4 0 3 0 7 9 0
Output 1 :-
1 9 8 4 3 7 9 0 0 0 

Input 2 :-
8
1 2 0 3 2 0 9 0
Output 2 :-
1 2 3 2 9 0 0 0 

*/
