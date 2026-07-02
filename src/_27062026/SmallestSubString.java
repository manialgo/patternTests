package _27062026;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class SmallestSubString {
	private static int conversion(int[] arr, int size) {
		Map<Integer, Integer> count = new HashMap<>();
		Map<Integer, Integer> firstSeen = new HashMap<>();
		Map<Integer, Integer> lastSeen = new HashMap<>();
		
		int degree = 0, num, result=size, left, right, length;
		for(int i=0; i<size; i++) {
			num = arr[i];
			if(!firstSeen.containsKey(num)) firstSeen.put(num, i);
			lastSeen.put(num, i);
			count.put(num, count.getOrDefault(num, 0)+1);
			
			if(count.get(num) > degree)	degree = count.get(num);
		}
		for(Integer val : count.values()) {
			if(val==degree) {
				left = firstSeen.get(val);
				right = lastSeen.get(val);
				length = right - left + 1;
				result = (length < result) ? length: result;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size  = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++)	arr[i] = sc.nextInt();
		System.out.println(conversion(arr, size));
		sc.close();
	}
}