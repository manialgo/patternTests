package test23062026;

import java.util.Scanner;
public class LeftRotate{
    private static int[] leftRotate(int[] arr){
        int temp = arr[0];
        for(int i=0; i<arr.length-1; i++)   arr[i] = arr[i+1];
        arr[arr.length-1] = temp;
        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++)   arr[i]=sc.nextInt();
        leftRotate(arr);
        for(int i=0; i<size; i++)   System.out.print(arr[i]+" ");
        sc.close();
    }
}
/*

Problem Statement:-
Write a program that will cycle all elements of an array from one position to the left.  

Example:-
Input:-
8
-1 2 -4 3 7 6 102 41

Output:-
2 -4 3 7 6 102 41 -1

Input format :-
The first line of the input consists of the value of n.
The next input is the array elements.

Output format :-
The output prints the resultant array.

Note: There is an extra space at the end of the output.

Refer to the sample output for formatting specifications.

Sample test cases :-
Input 1 :-
8
-1 2 -4 3 7 6 102 41
Output 1 :-
2 -4 3 7 6 102 41 -1 

Input 2 :-
10
15 20 36 98 45 12 77 48 96 100
Output 2 :-
20 36 98 45 12 77 48 96 100 15

*/
