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