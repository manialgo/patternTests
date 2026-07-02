package test13062026;
import java.util.Scanner;

public class RotationalCount {
    private static int[] reverse(int[] arr){
        int size = arr.length, temp, i=0;
        temp = arr[0];
        while(i<size-1) {
        	arr[i] = arr[i+1];
        	i++;
        }
        arr[size-1]=temp;
        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++)arr[i]=sc.nextInt();
        int sum, maxSum=0, j=0;
        for(int i=0; i<size; i++){
            sum=0;j=0;
            for(int num:arr) {
            	sum = sum + (num*j);
            	j++;
            }
            maxSum = (maxSum > sum) ? maxSum : sum; 
            reverse(arr);
        }
        System.out.println(maxSum);
        sc.close();
    }
}