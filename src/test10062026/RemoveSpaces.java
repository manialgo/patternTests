package learn;

import java.util.Scanner;

public class RemoveSpaces{
  
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
       
        char[] arr = str.toCharArray();
        String temp = "";
        boolean flag=false;
        for(char ch:arr){
            if(ch != ' ') {
                temp+=ch;
                flag = true;
            }
            else{
                if(flag)    temp += ' ';
                flag=false;
            }
        }
    // Simple Analogy
		//System.out.println(str.replaceAll("[\\s]+", " "));
        System.out.println(temp);
        sc.close(); 
    }
}


/*

Problem Statement:-

Replace the space
Input a string with multiple spaces between words. Write a program to replace 2 or more consecutive spaces with a single space. Print the resulting string.

Note: use regex

Input format :-
The input consists of a string with multiple spaces separating words.

Output format :-
The input string with multiple consecutive spaces is replaced with a single space.

Refer to the sample input and output for format specifications.

Sample test cases :-
Input 1 :-
A      line with     multiple spaces between      some  words!
Output 1 :-
A line with multiple spaces between some words!

*/
