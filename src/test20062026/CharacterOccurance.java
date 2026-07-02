package test20062026;

import java.util.Scanner;

class CharacterOccurance{
    private static void firstAndLastOccOfChar(int[] arr, int size, int searchElement){
    //private static int[] firstAndLastOccOfChar(int[] arr, int size, int searchElement){
        int left = 0, right=size-1;
        //int[] result = new int[2];
        boolean flag1 = false, flag2 = false;
        while(left < right){
            if(arr[left] == searchElement)  flag1 = true;
            else if(arr[left] < searchElement) left++;
            
            if(arr[right] == searchElement) flag2 = true;
            else if(arr[right] > searchElement) right--;
            
            if(flag1 && flag2) break;
        }
        if(left >= right)   System.out.println("NO OCCURANCES");
        else    System.out.println(left+" "+right);
        //result[0] = left;
        //result[1] = right;
        //if(left>=right) return new int[]{};
        //return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++)   arr[i]=sc.nextInt();
        int searchElement = sc.nextInt();
        firstAndLastOccOfChar(arr, size, searchElement);
        sc.close();
    }
}