package test13062026;
import java.util.Scanner;

public class ReverseANumber {
	   public static int reverse(int n){
	        int dig=0, rev=0;
	        while(n > 0){
	            dig = n %10;
	            rev = rev*10+dig;
	            n /= 10;
	        }
	        return rev;
	    }
	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        System.out.println(reverse(n));
	        sc.close();
	    }
}