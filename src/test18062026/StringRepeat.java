package test18062026;

import java.util.Scanner;
public class StringRepeat {
	public static void firstArrival(String[] strArr) {
		int size = strArr.length;
		for (int i = 0; i < size; i++) {
		    int count = 0;
		    for (int j = 0; j < size; j++) {
		        if (strArr[i].equals(strArr[j]))
		            count++;          // count every occurrence
		    }
		    if (count == 1) {         // unique only if exactly 1
		        System.out.println(strArr[i]);
		        return;
		    }
		}
		System.out.println("-1");
	}
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArr = str.split(" ");
        firstArrival(strArr);
        sc.close();
    }

/*
	IDEOLOGY: 2
    public static void firstArrival(String[] strArr){
        int size = strArr.length;
        boolean flag = false;
        for(int i=0; i<size; i++){//need to traverse until the last word what if the
        	//last word itself the first unique so i--> last one too
            for(int j=i+1; j<size; j++){
                if(strArr[i].equals(strArr[j]))break;
                else {
                    if(j==size-1) System.out.println(strArr[i]);
                    flag = true;
                    break ;
                }
            }
        }
        if(!flag)
            System.out.println("-1");
    }
	
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chArr = str.toCharArray();
        int count=0, j=0;
        for(int i=0; i<chArr.length; i++)   if(chArr[i] ==' ') count++;
        String[] strArr = new String[count+1];
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(chArr[i] != ' '){
                sb.append(chArr[i]);
            }
            else {
                strArr[j] = sb.toString();
                sb.delete(0,sb.length());
                j++;
            }
        }
        firstArrival(strArr);
        sc.close();
    }
*/

}

/*

Problem Statement:-
In a book review system, Neha is developing an application that analyzes user reviews. The application needs to determine the first unique word in a user's review. A word is considered unique if it appears only once in the review string. 

Your task is to write a program that finds the first word in the review that occurs only once. If no such word exists, the program should print -1. 

Example:-
Input:-
the quick brown fox jumped over the lazy dog

Output:-
quick

Explanantion:-
"quick" is the first word that occurs only once in the review.

Input format :-
The first line contains a string s, representing the user review, where words are separated by spaces.

Output format :-
Print the first unique word in the string. If no unique word exists, print -1.

Refer to the sample output for the formatting specifications.

Code constraints :-
1 ≤ len(s) ≤ 1000

Sample test cases :-
Input 1 :-
the quick brown fox jumped over the lazy dog

Output 1 :-
quick

*/
