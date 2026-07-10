import java.util.Scanner;

public class NumberOfOddEvenInArray{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int oddCount=0, evenCount =0;
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
            if(arr[i] % 2 ==0)evenCount++;
            else oddCount++; 
        }
        System.out.println("Number of even numbers : "+evenCount);
        System.out.println("Number of odd numbers : "+oddCount);
        sc.close();
    }

}

/*

Problem Statement:-
Ravi wants to find the number of odd elements and even elements in an array. Help him to find the same. Write a program to find the number of odd and even elements in an array.

Input format :-
The first line of the input consists of the size of array 'n' as an integer value.
The next line of input consists of the array of n elements separated by a space 'e'.

Output format :-
The output should display the number of even and odd numbers as

Number of even numbers : <<even>>
Number of odd numbers : <<odd>>

Refer to the sample output for the formatting specifications

Code constraints :-
In this scenario, the test cases fall under the following constraints:
1 ≤ n ≤ 20
0 ≤ e ≤ 100

Sample test cases :-
Input 1 :-
5
23 68 45 92 71
Output 1 :-
Number of even numbers : 2
Number of odd numbers : 3

*/
