package test22062026;

import java.util.Scanner;

public class StrongNumber{ 
    private static int factorial(int n){
        if(n == 1 || n == 0)  return 1;
        return n*factorial(n-1);
    }
    private static int digitFactorialSum(int n){
        int result = 0;
        while(n != 0){
            result += factorial(n % 10);
            n /= 10;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(digitFactorialSum(n) == n)   System.out.println(n+" Strong Number");
        else System.out.println(n+" Not Strong Number");
        sc.close();
    }
}