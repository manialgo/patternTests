package test13062026;
import java.util.Scanner;
public class HillClimb {
	public static int steps(int n) {
		if(n<=1) return 1;
		if(n==2) return 2;
		return steps(n-1)+steps(n-2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		if(n < 3) System.out.println(n);
		else {
			int prev1 = 2;
			int prev2 = 1;
			for(int i=3; i <=n; i++) {
				sum = prev1 + prev2;
				prev2 = prev1;
				prev1 = sum;
			}
		}
		System.out.println(sum);
		sc.close();
	}
}