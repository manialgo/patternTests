package test12062026;
import java.util.Scanner;
public class SelectionSort {
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++) arr[i] = sc.nextInt();
		int run, minInt;
		for(int j=0; j<size-1; j++) {
			minInt = j;
			run = j +1;
			while(run < size) {
				if(arr[run] < arr[minInt]) minInt = run;
				run++;
			}
			//if(j != minInt) If not there no issues just a swap happens between the same element we know
				swap(arr, j, minInt);
		}
		for(int num:arr)System.out.print(num+" ");
		sc.close();
	}
}