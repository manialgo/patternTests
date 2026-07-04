package test02072026;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class RunLengthEncoding {
    private static String compressedData(String s){
        char[] charArr = s.toCharArray();
        int size = charArr.length;
        char temp;
        String result="";
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<size; i++) {
            temp = charArr[i];
            map.put(temp, map.getOrDefault(temp, 0)+1);
        }
        for(int i=0; i<size; i++){
            temp = charArr[i];
            if(map.containsKey(temp)) {
                result += temp;
                result += map.get(temp);
                //result += String.valueOf(map.get(temp));
                //result += parseCharacter((map.get(temp)));
                map.remove(temp);
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(compressedData(str));
        sc.close();
    }

/*
    private static char parseCharacter(int n){
        if(n==0) return '0';
        if(n==1) return '1';
        if(n==2) return '2';
        if(n==3) return '3';
        if(n==4) return '4';
        if(n==5) return '5';
        if(n==6) return '6';
        if(n==7) return '7';
        if(n==8) return '8';
        return '9';
    }
*/
    
}

/*

Problem Statement:-
A satellite transmits data as a stream of characters. To save bandwidth, the system uses a basic compression method called Run-Length Encoding (RLE). This replaces consecutive occurrences of a character with the character followed by the count of its repetitions.

Write a program to compress a given string using this method.

Input format :-
The input consists of a single string containing uppercase or lowercase letters.

Output format :-
Print the compressed string.

Refer to the sample output for the formatting specifications.

Code constraints :-
The given testcases fall under the following constraints :
String length ≤ 100

Sample test cases :-
Input 1 :-
AAABBB
Output 1 :-
A3B3

Input 2 :-
abc
Output 2 :-
a1b1c1

Input 3 :-
WWWWWWWWWWWWBWWWWWWWWWWWWBBBww
Output 3 :-
W12B1W12B3w2

*/
