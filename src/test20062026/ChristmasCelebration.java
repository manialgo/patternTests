package test20062026;

import java.util.Scanner;
public class ChristmasCelebration{
    public static void buyPacket(int N, int M){
        if(M % N == 0)  System.out.println("Yes");
        else System.out.println("No");
    } 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        buyPacket(N, M);
        sc.close();
    }
}

/*

Problem Statement:-
Christmas is in next month. This time John is planning to celebrate it differently. So, he decides to distribute some gifts to all children in the street.He went to a shop to buy a packet of chocolates.

At the chocolate shop, each packet is having a different number of chocolates. He wants to buy such a packet which contains the number of chocolates, which can be distributed equally among all of his street children.

Being a friend of John, help him to buy such a packet.

Input format :-
Each test case contains two integers, N and M, where is N is the number of children in his street and M is the number of chocolates in a packet.

Output format :-
In each case output "Yes" if he can buy that packet and "No" if he can't buy that packet.(Output is case sensitive)

Sample test cases :-
Input 1 :-
4 17
Output 1 :-
No

*/
