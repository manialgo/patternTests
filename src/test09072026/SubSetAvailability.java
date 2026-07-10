package test09072026;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class SubSetAvailability{
	
    private static void subsetCalc(int[] arr1, int size1, int[] arr2, int size2){
        Set<Integer> set = new HashSet<>();
        
        for(int i=0; i<size1; i++) set.add(arr1[i]);
        
        int j;
        
        for(j=0; j<size2; j++){
            if(!set.contains(arr2[j])) break;
        }
        
        if(j==size2) System.out.println("arr2[] is subset of arr1[]");
        else System.out.println("arr2[] is not a subset of arr1[]");
        
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        for(int i=0; i<size1; i++) arr1[i]=sc.nextInt();
        
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        for(int i=0; i<size2; i++) arr2[i]=sc.nextInt();
        

        subsetCalc(arr1, size1, arr2, size2);
        
        sc.close();
    }
    
}

/*

Problem Statement:-
Find whether an array is subset of another array, The two arrays are given as arr1 [0..m-1] and arr2 [0..n-1]. Find whether arr2[ ] is a subset of arr1[ ] or not. Both arrays are not in sorted order. It may be assumed that elements in both arrays are distinct.

For example,
The input is arr1 [ ] = {11, 1, 13, 21, 3, 7}, arr2 [ ] = {11, 3, 7, 1} . 
The output is arr2 [ ] is a subset of arr1 [ ]

Input format :-
The first line of input contains an integer m, which is the size of arr1.
The second line contains m integers separated by spaces, which are the elements of arr1.
The third line contains an integer n, which is the size of arr2.
The fourth line contains n integers separated by spaces, which are the elements of arr2.

Output format :-
The output displays whether arr2 is a subset of arr1 or not.
If arr2 is a subset of arr1, it will print "arr2 [ ] is a subset of arr1 [ ]".
Otherwise, it will print "arr2 [ ] is not a subset of arr1 [ ]"

Refer to the sample input and output for formatting specifications.

Code constraints :-
2 ≤ m, n ≤ 105

Sample test cases :-
Input 1 :-
5
1 2 3 4 5
3
1 3 5
Output 1 :-
arr2[] is subset of arr1[] 

Input 2 :-
4
1 2 3 4
3
2 4 6
Output 2 :-
arr2[] is not a subset of arr1[]

*/
