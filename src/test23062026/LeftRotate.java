package test23062026;

import java.util.Scanner;
class LeftRotate{
    private static int[] leftRotate(int[] arr){
        int temp = arr[0];
        for(int i=0; i<arr.length-1; i++)   arr[i] = arr[i+1];
        arr[arr.length-1] = temp;
        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++)   arr[i]=sc.nextInt();
        leftRotate(arr);
        for(int i=0; i<size; i++)   System.out.print(arr[i]+" ");
        sc.close();
    }
}