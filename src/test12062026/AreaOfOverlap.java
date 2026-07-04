package test12062026;
import java.util.Scanner;
public class AreaOfOverlap {
	private static double overLapArea(double x1, double y1, double r1, 
			double x2, double y2, double r2) {
		
		double d = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		
		if(d >= r1 + r2)	return 0.0;
		
		if(d <= Math.abs(r1-r2)) {
			double r = Math.min(r1, r2);
			return Math.PI*r*r;
		}
		
		double d2 = d*d;
		double r1_2 = r1 * r1;
		double r2_2 = r2 * r2;
		
		double alpha = Math.acos((d2+r1_2-r2_2)/(2*d*r1));
		double beta = Math.acos((d2+r2_2-r1_2)/(2*d*r2));
		
		double segment1 = r1_2*alpha;
		double segment2 = r2_2*beta;
		
		double segment3 = 0.5*Math.sqrt((-d+r1+r2)*(d-r1+r2)*(d+r1-r2)*(d+r1+r2));
		
		return segment1+segment2-segment3;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x1 = sc.nextDouble(), y1 = sc.nextDouble(), r1 = sc.nextDouble();
        double x2 = sc.nextDouble(), y2 = sc.nextDouble(), r2 = sc.nextDouble();
        
        double result = overLapArea(x1, y1, r1, x2, y2, r2);
        System.out.printf("%.6f", result);
		sc.close();
	}
}

/*

Problem description:-
A student has to solve an entire workbook of problems related to finding the area of the intersection of two circles. Instead of solving similar problems repeatedly, the student decides to write a program that would solve all these similar problems.

Example:-
Input 1:-
3 2 4
-2 0 5

Output 1:-
18.016244

Explanation:-
As per the mathematical calculation, this is the area of intersection of these two given circles.

Input format :-
The first line of the input consists of three space-separated integers – x1, y1 and r1 where x1 and y1 represent the x and y coordinates of the center of the first circle and r1 represents the radius of the first circle.

The second line of the input consists of three space-separated integers – x2, y2 and r2 where x2 and y2 represent the x and y coordinates of the center of the second circle and r2 represents the radius of the second circle.

Output format :-
Print a real number representing the area of the intersection of two circles rounded up to 6 decimal places.

Code constraints :-
0 < r1, r2 < 104

Sample test cases :-
Input 1 :-
3 2 4
-2 0 5

Output 1 :-
18.016244

Input 2 :-
0 5 3
-2 0 2
Output 2 :-
0.000000

*/
