import java.util.Scanner;

public class ApplePurchase2 {

	private static long minPurchase(long N, long M1, long P1, long M2, long P2) {
		long mCheap, mCostly, pCheap, pCostly;
		long remaining, finalCost=Long.MAX_VALUE, totalCost, lotsCheap;
		
		if(P1*M2 <= P2*M1) {
			mCheap = M1;
			pCheap = P1;
			mCostly = M2;
			pCostly = P2;
		}else {
			mCheap = M2;
			pCheap = P2;
			mCostly = M1;
			pCostly = P1;
		}
		
		for(long k=0; k<mCheap; k++) {
			remaining = N - (k*mCostly);
			if(remaining < 0) break;
			if(remaining % mCheap == 0) {
				lotsCheap = remaining / mCheap;
				totalCost = (k*pCostly)+(lotsCheap*pCheap);
				finalCost = (finalCost < totalCost) ? finalCost : totalCost;
			}
		}
		
		return finalCost;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M1 = sc.nextLong();
		long P1 = sc.nextLong();
		long M2 = sc.nextLong();
		long P2 = sc.nextLong();
		
		long minimumVal = minPurchase(N, M1, P1, M2, P2);
		System.out.print(minimumVal);
		sc.close();
	}

}
/**
Algorithm to use the LCM Approach.
Stage:1 Try to figure out the rate of purchasing, ratio of lots per cost.
That is : P1/M1 or P2/M2 which makes cheaper on total purchase. Depending upon the range of LCM split the cheap and costly prices (P1, P2) with lotVal (M1, M2).
So the comparison will be (P1*M2) or (P2*M1) upon the cross multiplication.

After that traversal from index zero (0) o mCheap. In every iteration check there is a possibility of costly along with cheap by remaining taking.
periodically check the ranges and update the finalCost in every iteration.
And return the finalCost.

*/

/*

Problem description:-
Josh went to the market to buy N apples. He found two shops, shop A and B, where apples were being sold in lots. He can buy any number of the complete lot(s) but not loose apples. He is confused with the price and wants you to figure out the minimum cost to buy exactly N apples.

Write an algorithm for Josh to calculate the minimum cost to buy exactly N apples.

Example:-
Input:-
19
3 10
4 15

Output: -
65

Explanation:-
Josh can buy five lots from the first shop and one lot from the second shop (5*10-15) 

Input format :-
The first line of the input consists of an integer – N, representing the total number of apples that Josh wants to buy.
The second line consists of two space-separated positive integers – M1 and P1, representing the number of apples in a lot and the lot’s price at shop A, respectively.
The third line consists of two space-separated positive integers-M2 and P2, representing the number of apples in a lot’s price at shop B, respectively.

Output format :-
Print a positive integer representing the minimum price at which Josh can buy the apples.

Code constraints :-
0 < N, P1, P2
1 < M1, M2

Note:-
There will always be at least one solution. There is only one lot size for a particular shop. There is an unlimited supply of apples for both the shops.

Sample test cases :-
Input 1 :-
19
3 10 
4 15
Output 1 :-
65

Input 2 :-
20
4 10
5 11
Output 2 :-
44

*/
