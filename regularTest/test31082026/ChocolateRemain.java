import java.util.Scanner;
public class ChocolateRemain{
    
    private static int chocolateRemaining(int[] nums, int itr){
        int minIdx;
        for(int i=0; i<itr; i++){
            minIdx=0;
            for(int j=1; j<nums.length; j++)  if(nums[j] > nums[minIdx]) minIdx = j;
            nums[minIdx] = (int) Math.sqrt(nums[minIdx]);
        }
        
        int res = 0;
        for(int num : nums) res += num;
        
        return res;
    }
  
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++) nums[i] = sc.nextInt();
        int iteration = sc.nextInt();
        
        int res = chocolateRemaining(nums, iteration);
        System.out.print(res);
        
        sc.close();
    }
  
}

/*

Problem Statement:-
Ashwini is fond of chocolates so her uncle gifted her chocolates on her birthday. Here is an array of piles of chocolates, in every iteration Ashwini chose a pile with the maximum number of chocolates after that square root of chocolate remains and the rest is eaten by Ashwini. After k iterations find the number of chocolates remaining. 

Example:-
Input:-
5
25 64 9 4 100
4

Output:-
29

Explanation:-
After 4 iterations the number of remaining chocolates are 29.

Input format :-
The first line of input denotes the size of an array
The second line consists of an array of elements
The third line of input denotes the k iterations.

Output format :-
The output consists of an integer denoting the number of chocolates remaining after k iterations

Sample test cases :-
Input 1 :-
5
25 64 9 4 100
4
Output 1 :-
29

Input 2 :-
5
25 64 9 4 100
2
Output 2 :-
56

*/
