import java.util.Scanner;
public class DiscountArray{
    
    private static int[] discountArray(int[] price, int n){
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(price[j] <= price[i]){
                    price[i] -= price[j];
                    break;
                }
            }
        }
        return price;
    }
  
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] price = new int[n];
        for(int i=0; i<n; i++) price[i] = sc.nextInt();
        
        int discount[] = discountArray(price, n);
        for(int dis : discount) System.out.print(dis+" ");
        sc.close();
    }
  
}


/*

Problem Statement:-
You are given an integer array price, where price[i] is the price of the ith item in a shop.

There is a special discount for items in the shop.

If you buy the ith item, then you will receive a discount equivalent to price[j], where j is the minimum index such that j > i and price[j] ≤ price[i].
Otherwise, you will not receive any discount at all.

Write a program to calculate the final prices for each item considering this special discount policy using the insertion sort algorithm.

Example 1:-
Input:-
price = [8, 4, 6, 2, 3]

Output:-
4 2 4 2 3 

Explanation: -
For item 0 with price[0]=8, you will receive a discount equivalent to price[1]=4, therefore, the final price you will pay is 8 - 4 = 4.
For item 1 with price[1]=4, you will receive a discount equivalent to price[3]=2, therefore, the final price you will pay is 4 - 2 = 2.
For item 2 with price[2]=6, you will receive a discount equivalent to price[3]=2, therefore, the final price you will pay is 6 - 2 = 4.
For items 3 and 4, you will not receive any discount at all.

Example 2:-
Input: -
price = [1, 2, 3, 4, 5]

Output:-
1 2 3 4 5 

Explanation:-
In this case, for all items, you will not receive any discount at all.

Input format :-
The first line of input consists of an integer N, denoting the number of items in the shop.
The second line consists of N space-separated integers, representing the prices of the items in the shop.

Output format :-
The output displays N space-separated integers, representing the final prices of the items after applying the special discounts.

Refer to the sample output for the formatting specifications.

Code constraints :-
1 ≤ N ≤ 500
1 ≤ prices of the item ≤ 1000

Sample test cases :-
Input 1 :-
5
8 4 6 2 3
Output 1 :-
4 2 4 2 3 

Input 2 :-
5
1 2 3 4 5
Output 2 :-
1 2 3 4 5 

*/
