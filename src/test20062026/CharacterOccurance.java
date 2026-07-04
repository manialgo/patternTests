package test20062026;

import java.util.Scanner;
public class CharacterOccurance{
    private static void firstAndLastOccOfChar(int[] arr, int size, int searchElement){
        int left = 0, right=size-1;
        boolean flag1 = false, flag2 = false;
        while(left < right){
            if(arr[left] == searchElement)  flag1 = true;
            else if(arr[left] < searchElement) left++;
            
            if(arr[right] == searchElement) flag2 = true;
            else if(arr[right] > searchElement) right--;
            
            if(flag1 && flag2) break;
        }
        if(left >= right)   System.out.println("NO OCCURANCES");
        else    System.out.println(left+" "+right);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++)   arr[i]=sc.nextInt();
        int searchElement = sc.nextInt();
        firstAndLastOccOfChar(arr, size, searchElement);
        sc.close();
    }
}

/*

Problem Statement:-
Given a sorted array with many duplicate elements, the problem is to find indexes of first and last occurrences of an element X in the given array.
Start the array index from 0. If element X is not present in the array,print "NO OCCURENCES".

Input format :-
First line of the input is number of elements(N)
N array elements in second line
Number to searched(X)

In Sample Input,
There are 10 elements in an array[1 2 2 2 2 3 4 8 8 8] and element to be searched(X) is 8.
So, output is 7 9
In the sample input,element 8 occurs in indexes 7 and 9.

Output format :-
The output consists of indexes of first and last occurrence of an element X.

Sample test cases :-
Input 1 :-
10 
1 2 2 2 2 3 4 8 8 8 
8
Output 1 :-
7 9

*/
