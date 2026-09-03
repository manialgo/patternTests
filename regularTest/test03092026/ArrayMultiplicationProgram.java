import java.util.Scanner;

public class ArrayMultiplicationProgram{
	
	private static int[] arrayAlteration(int[] nums, int size) {
		if(size == 1) return nums;
		
		if(size == 2) {
			nums[0] = nums[0] * nums[1];
			nums[1] = nums[0];
			return nums;
		}
		
		int prev = nums[0], temp, i;
		nums[0] = nums[0] * nums[1];
		
		for(i = 1; i < size-1; i++) {
			temp = nums[i];
			nums[i] = prev * nums[i+1];
			prev = temp;
		}
		nums[i] = prev * nums[i];
		
		return nums;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		if(!sc.hasNextInt()) {
			System.out.println("Invalid user input!");
			sc.close();
			return;
		}
		
		try {
			int size = sc.nextInt();
			
			if(size<=0 || size >10) {
				System.out.println("Invalid use input! Range Array Size[1,10]");
				sc.close();
				return;
			}
			
			int[] nums = new int[size];
			for(int i=0; i<size; i++) nums[i] = sc.nextInt();
			
			int[] result = arrayAlteration(nums, size);
			for(int num : result) System.out.print(num+" ");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		sc.close();
	}
	
}

/*

Problem Statement:-
Azhar is given the task of writing a program to update every array element by multiplying the previous and the next element. He seeks your assistance in the program since he is unable to solve.

Help him in the task.

Note: For the first and last elements, multiply the actual element with the next or previous.

For example, given an array 3 2 4 5 1 7, the result is 6 12 10 4 35 7. Here, each element is updated as follows:

First element: 3 * 2 = 6
Second element: 3 * 4 = 12
Third element: 2 * 5 = 10
Fourth element: 4 * 1 = 4
Fifth element: 5 * 7 = 35
Last element: 1 * 7 = 7.

Input format :-
The first line of input consists of an integer N, representing the number of array elements.
The second line consists of N space-separated integers, representing the elements of the array.

Output format :-
The output prints the updated array elements, separated by a space.

Refer to the sample output for formatting specifications.

Code constraints :-
1 ≤ N ≤ 10
0 ≤ N ≤ 10000

Sample test cases :-
Input 1 :-
6
3 2 4 5 1 7
Output 1 :-
6 12 10 4 35 7 

Input 2 :-
3
10 2 0
Output 2 :-
20 0 0 

*/
