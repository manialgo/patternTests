package test15062026;

import java.util.Scanner;
public class HypenMovingSum{
    public static void MoveHypen(char str[]){
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i=0; i<str.length; i++) {
            if(str[i]=='-')count++;
            else sb.append(str[i]);
        }
        StringBuilder sb2 = new StringBuilder();
        for(int i=0; i<count; i++) sb2.append('-');
        System.out.println(sb2.append(sb));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        MoveHypen(ch);
        sc.close();
    }
}