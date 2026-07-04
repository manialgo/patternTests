package test22062026;
import java.util.Scanner;
public class FirstRepeativeElement {
	private static int frequencyMatch(int[] arr) {
		int[] freq = new int[101];
		for(int i=0; i<arr.length; i++)	freq[arr[i]]++;
		for(int j=0; j<arr.length; j++) {
			if(freq[arr[j]] > 1) return arr[j]; 
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++)	arr[i]=sc.nextInt();
		int result = frequencyMatch(arr);
		if(result == -1)	System.out.println("There are no repeating element");
		else System.out.println("The first repeating element is "+result);
		sc.close();
	}
}

/*

Problem Statement:-
Given an array of numbers. Give an algorithm for finding the first element in the array which is repeated.

Input format :-
The first line of the input consists of an integer representing the size of array 'n'.
The second line of the input consists of n elements representing the array elements 'e' separated by space.

Output format :-
The output should display the first repeating element in the array as

"The first repeating element is <<element>>" or "There are no repeating elements"

Refer to the sample output for the formatting specifications.

Code constraints :-
In this scenario, the test cases fall under the following constraints:
1 ≤ n ≤ 10
1 ≤ e ≤ 100

Sample test cases :-
Input 1 :-
7
10 5 3 5 3 4 6
Output 1 :-
The first repeating element is 5

Input 2 :-
5
1 5 6 8 7
Output 2 :-
There are no repeating elements

Input 3 :-
8
5 2 4 6 7 2 4 5
Output 3 :-
The first repeating element is 5

*/
