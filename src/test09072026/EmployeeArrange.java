package test09072026;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeArrange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<Integer> tech = new ArrayList<>();
        List<Integer> creative = new ArrayList<>();
        
        int size = sc.nextInt();
        int[] nums = new int[size];
        
        for(int i=0; i<size; i++) {
            nums[i]=sc.nextInt();
            if(nums[i] >=0) tech.add(nums[i]);
            else creative.add(nums[i]);
        }
        //	case I
        for(int i=0; i<size; i++) {
            System.out.print((i==size-1) ? nums[i] : nums[i]+" ");
        }
        
        System.out.println();
        
        List<Integer> result = new ArrayList<>();
        /*
         * crucial idea is to move the up and down motion between the tech and creative lists
         * 
         * 	creative: -5 -2 -8
         *  tech: 5 2 4 7 1 8 0
         *  
         *  flow: from creative to tech and tech to creative
         *  
         *  -5 => 5 => -2 => 2 => -8 => 4 => 7 => 1 => 8 => 0
         */
        
        for(int i=0; i<size; i++){
            if(i<creative.size()) result.add(creative.get(i));
            if(i<tech.size()) result.add(tech.get(i));
        }
        
        for(int i=0; i<result.size(); i++) {
            System.out.print((i==size-1) ? result.get(i) : result.get(i)+" ");
        }
        
        sc.close();
    }
    
}

/*

Problem Statement:-
Your company is organizing a team-building activity where you need to arrange employees into two distinct groups: one group for technical activities and the other for creative activities.

The arrangement must ensure that:-
Technical employees (represented by positive integers) and creative employees (represented by negative integers) are alternated.
The relative order within each group should be preserved.
You have a list of employees where each employee is represented by a unique integer (positive for technical and negative for creative).


Your task is to rearrange the list such that technical and creative employees are alternated while maintaining the order within each group.

Write a program to rearrange the employees' list based on the given conditions.

Example:-
Input :-
6
1 2 3 -4 -1 4

Output :-
1 2 3 -4 -1 4  -------> Input list
-4 1 -1 2 3 4  -------> Rearranged list

Explanation:-
Creative employees come first and are alternated with technical employees.
The relative order within the technical and creative groups is preserved.

Note: Here employee ID "0" represent technical employee.

Input format :-
The first line consists of an integer N representing the number of employees.
The second line consists of an array of integers of size N where each integer represents an employee's ID.
Positive integers represent technical employees, and negative integers represent creative employees.

Output format :-
The first line contains the elements of the original employee list before rearrangement.
The second line contains the elements of the employee list after rearrangement according to the given conditions.

Refer to the sample output for the formatting specifications.

Code constraints :-
2 ≤ n ≤ 10
-100 ≤ employees ID ≤100

Sample test cases :-
Input 1 :-
6
1 2 3 -4 -1 4
Output 1 :-
1 2 3 -4 -1 4 
-4 1 -1 2 3 4 

Input 2 :-
10
-5 -2 5 2 4 7 1 8 0 -8
Output 2 :-
-5 -2 5 2 4 7 1 8 0 -8 
-5 5 -2 2 -8 4 7 1 8 0 

*/
