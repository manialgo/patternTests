package test19062026;

import java.util.Scanner;
import java.util.HashMap;

class StringFreqCount{
    private static void stringCount(String str){
        String[] strArr = str.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<strArr.length; i++){
            map.put(strArr[i], map.getOrDefault(strArr[i], 0) + 1);
        }
        //method 1
        //map.forEach((key, value) -> System.out.println("Frequency of "+key+" is "+value));

        //method 2
        for(String key: map.keySet()) {
        	System.out.println("Frequency of "+key+" is "+map.get(key));
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        stringCount(str);
        sc.close();
    }
}

/*

Problem Statement:-
Write a program to count the frequency of words appearing in a string.

Input format :-
The input consists of a sentence (space-separated words or a string).

Output format :-
The output consists of the frequency of each word in the sentence.

Refer to the sample output for formatting specifications.

Sample test cases :-
Input 1 :-
aero electric electric computer aero nautic nautic computer latent
Output 1 :-
Frequency of aero is 2
Frequency of electric is 2
Frequency of computer is 2
Frequency of nautic is 2
Frequency of latent is 1

*/
