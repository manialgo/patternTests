package test19062026;

import java.util.Scanner;
public class CapitalizeWord {
	private static String capitalizeWords(String str) {
		String[] strArr = str.split(" ");
		String temp;
		StringBuilder result = new StringBuilder();
		for(int i=0; i<strArr.length; i++) {
			temp = strArr[i];
			if(!temp.isEmpty()) {
				result.append(Character.toUpperCase(temp.charAt(0)));
				result.append(temp.substring(1));
				if(i < strArr.length-1) result.append(" ");
			}
		}
		return result.toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(capitalizeWords(str));
		sc.close();
	}
}