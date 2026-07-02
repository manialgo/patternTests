package test13062026;

import java.util.Scanner;
public class SwimmingPool {
    public static double circleArea(int radius){
        return (3.14*radius*radius);
    }
    public static double rectArea(int length, int breadth){
        return length*breadth;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rad = sc.nextInt();
        double circle = circleArea(rad);
        int len = sc.nextInt();
        int bre = sc.nextInt();
        double rect = rectArea(len, bre);
        
        //System.out.printf("Hello World!%n%n");
        
        System.out.printf("%.2f%n",circle);
        System.out.printf("%.2f%n", rect);
        System.out.println((circle>rect)?"Circular Swimming pool covers larger area" : "Rectangular swimming pool has larger area");
        sc.close();
    }


}
