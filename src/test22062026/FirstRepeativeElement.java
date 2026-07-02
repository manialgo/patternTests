package test22062026;
import java.util.Scanner;
public class FirstRepeativeElement {
	private static int frequencyMatch(int[] arr) {
		int[] freq = new int[101];
		for(int i=0; i<arr.length; i++)	freq[arr[i]]++;
		for(int j=0; j<arr.length; j++) {
			if(freq[arr[j]] > 1) return arr[j]; 
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++)	arr[i]=sc.nextInt();
		int result = frequencyMatch(arr);
		if(result == -1)	System.out.println("There are no repeating element");
		else System.out.println("The first repeating element is "+result);
		sc.close();
	}
}