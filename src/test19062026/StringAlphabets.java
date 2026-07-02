package test19062026;

import java.util.Scanner;
import java.util.HashSet;

class StringAlphabets{
	//simple method
	/*
	private static boolean stringMatch2(String str1, String str2){
		HashSet<Character> set1 = new HashSet<>();
		HashSet<Character> set2 = new HashSet<>();
		
		for(char ch:str1.toCharArray()) set1.add(ch);
		for(char ch:str2.toCharArray()) set2.add(ch);
		
		return set1.equals(set2);
	}
	*/
    private static boolean stringMatch(String str1, String str2){
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        
        char[] chArr1 = str1.toCharArray();
        char[] chArr2 = str2.toCharArray();
        
        boolean flag1 = true, flag2 = true;
        
        for(int i=0; i<chArr1.length; i++){
            if(!set1.contains(chArr1[i])) set1.add(chArr1[i]);
        }
        
        for(int i=0; i<chArr2.length; i++){
            if(!set2.contains(chArr2[i])) set2.add(chArr2[i]);
        }
        
        for(int i=0; i<chArr2.length; i++){
            if(!set1.contains(chArr2[i]))    {
            	flag1 = false;
            	break;
            }
        }
        
        for(int i=0; i<chArr1.length; i++){
            if(!set2.contains(chArr1[i])) {
            	flag2 = false;
            	break;
            }
        }
        
        
        return flag1 && flag2;
    }
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if(stringMatch(str1, str2)) System.out.println("True");
        else System.out.println("False");
        sc.close();
    }
}
