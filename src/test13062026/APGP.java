package test13062026;
import java.util.Scanner;
public class APGP {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++) arr[i]=sc.nextInt();
        int term=0;
        if((arr[size-1]-arr[size-2]) == (arr[size-2]-arr[size-3])){
            //int a = arr[0];
            int d = arr[size-1]-arr[size-2];
            //term = a + (size*d);
            term = arr[size-1]+d;
        }
        if((arr[size-1]*arr[size-3]) == (arr[size-2]*arr[size-2])){
            //int a = arr[0];
            int r = arr[size-1]/arr[size-2];
            //for(int i=0; i<size; i++)   r *= r;
            //term = a*r;
            term = arr[size-1]*r;
        }
        System.out.println(term);
        sc.close();
    }

}