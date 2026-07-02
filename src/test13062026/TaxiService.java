package test13062026;
import java.util.Scanner;
public class TaxiService {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long D = sc.nextInt();
        
        long Oc = sc.nextInt();
        long Of = sc.nextInt();
        long Od = sc.nextInt();
        
        long Cs = sc.nextInt();
        long Cb = sc.nextInt();
        long Cm = sc.nextInt();
        long Cd = sc.nextInt();
        
        long onlineTaxi = Oc + ((D-Of)*Od);
        
        
        long time= (long) D/Cs;
        long classicTaxi = Cb + (time*Cm) +(D*Cd);
        
        if(onlineTaxi<=classicTaxi)  System.out.println("Online Taxi");
        else System.out.println("Classic Taxi");
        
        sc.close();
    }
}