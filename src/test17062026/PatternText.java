package test17062026;

import java.util.Scanner;
public class PatternText {
    public static void search(char[]text, String patt){
        int textSize = text.length;
        int pattSize = patt.length();
        if(pattSize > textSize) {
        	System.out.println("Pattern not found!");
        	return ;
        }
        int i=0, j;
        StringBuilder sb = new StringBuilder();
        while(i <= textSize-pattSize){
            j=0;
            while(j<pattSize){
                sb.append(text[i+j]);
                //i+j only repeats the substring
                j++;
            }
            if(sb.toString().equals(patt)) System.out.println("Pattern found at index "+ i);
            sb.delete(0, sb.length());
            i++;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        char[] text = str1.toCharArray();
        search(text, str2);
        sc.close();
        
    }
}