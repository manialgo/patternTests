package test15062026;

import java.util.Scanner;
public class NumberOfCarriesCount {
    public static int NumberOfCarries(int num1, int num2){
        int dig1 = 0, dig2=0, carry =0;
        int count=0;
        while(num1 > 0 && num2 > 0){
            dig1 = num1 % 10;
            dig2 = num2 % 10;
            if(dig1 + dig2 + carry >= 10) {
                count++;
                carry = 1;
            }
            num1 /= 10;
            num2 /= 10;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(NumberOfCarries(num1, num2));
        sc.close();
    }
}