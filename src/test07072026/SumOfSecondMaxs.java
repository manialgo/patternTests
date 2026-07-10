package test07072026;

import java.util.Scanner;

public class SumOfSecondMaxs{
  
    private static int secondMaxSum(int[] nums, int size){
        int maxEven = Integer.MIN_VALUE;
        int sMaxEven = Integer.MIN_VALUE;
        for(int i=0; i<size; i+=2){
            if(maxEven < nums[i]) {
                sMaxEven = maxEven;
                maxEven = nums[i];
            }
            else if(sMaxEven < nums[i]) sMaxEven = nums[i];
        }

    	  int maxOdd = Integer.MIN_VALUE;
        int sMaxOdd = Integer.MIN_VALUE;
        for(int i=1; i<size; i+=2){
            if(maxOdd < nums[i]) {
                sMaxOdd = maxOdd;
                maxOdd = nums[i];
            }
            else if(sMaxOdd < nums[i]) sMaxOdd = nums[i];
        }
        
        return sMaxOdd+sMaxEven;
    }
  
    public static void main(String[] args){
      
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i=0; i<size; i++) nums[i] = sc.nextInt();
        System.out.println(secondMaxSum(nums, size));
        sc.close();
      
    }
  
}

/*

Problem Statement:-
Write a Program that accepts an integer arr of size ’length’ as its arguments you are required to return the sum of the second largest element from the even positions and the second smallest from the odd position of the given ‘arr’.

Assumption:-
All array elements are unique.
Treat the 0th position as even.

Note:-
Return 0, if the array is empty 
Return 0, if the array length is 3 or less than 3 

Example:-
Input:-
6
3 2 1 7 5 4 
Output:-
7 

Explanation:-
Second largest among even position elements (1 3 5) is 3 
Second smallest among odd position elements (7 4 2) is 4 
Thus the output is 3+4 = 7 

Input format :-
The first input is the size of the array.
The next line of integers is the array of elements.

Output format :-
The output prints the sum of the second largest element from the even positions and the second smallest from the odd position of the given ‘arr’.

Sample test cases :-
Input 1 :-
6
3 2 1 7 5 4
Output 1 :-
7

Input 2 :-
7
1 4 2 5 7 3 9
Output 2 :-
11

*/
