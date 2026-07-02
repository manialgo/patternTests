package test20062026;

import java.util.Scanner;
class ChristmasCelebration{
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