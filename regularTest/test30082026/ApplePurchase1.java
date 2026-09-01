import java.util.Scanner;

public class ApplePurchase1{
    
    private static int applePurchase(int N, int M1, int P1, int M2, int P2){
        int min=Integer.MAX_VALUE, rem, y, x, currCost;
        for(x=0; x<(N/M1); x++){
            rem = N - (x*M1);
            if(rem >=0 && rem % M2 == 0){
                y = rem / M2;
                currCost = x*P1 + y*P2;
                min = (min < currCost) ? min : currCost;
            }
        }
        return min;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M1 = sc.nextInt();
        int P1 = sc.nextInt();
        int M2 = sc.nextInt();
        int P2 = sc.nextInt();
        
        int res = applePurchase(N, M1, P1, M2, P2);
        System.out.println(res);
        sc.close();
    }

}

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
