import java.util.Scanner;
public class MissingNumber{
    public static void missingNumber(int N, int[] nums){
        int sum=0;
        for(int i=0; i<N; i++) sum += nums[i];
        int result = ((N+2)*(N+1)/2)-sum;
        //mathematics ideology
        System.out.println(result);
    }
/*    
    public static void missingNumber(int N, int[] nums){
        Arrays.sort(nums);
        for(int i=0; i<N; i++){
            if(nums[i] != i+1) {
                System.out.println(i+1);
                return;
            }
        }
            //else case it's not an exact requirement but to pass some hidden test case we need to run one more step
        System.out.println(N+1);
    }
*/
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for(int i=0; i<N; i++)   nums[i]=sc.nextInt();
        missingNumber(N, nums);
        sc.close();
    }
}

/*

Problem Statement:-
Rohit has an array of integers, and he wants to find the missing number in the array. The array initially contains all the numbers from 1 to num+1, but one number is missing. Rohit needs to determine and print the missing number.

Help him write a program to print the missing number.

Input format :-
The first line contains an integer, num, representing the number of elements in the array.
The second line contains num space-separated integers, representing the elements of the array.

Output format :-
The program prints an integer, representing the missing number in the array.

Refer to the sample output for formatting specifications.

Code constraints :-
1<=num<=100.
1<=elements<=100.

Sample test cases :-
Input 1 :-
5
6 4 3 2 1
Output 1 :-
5

Input 2 :-
15
4 6 5 7 3 1 2 9 8 10 12 15 14 13 16
Output 2 :-
11

*/
