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

/*

Problem Statement:-
You are required to implement the following function:
void MoveHyphen(char str[]); 

The function accepts a string “str” of length ‘n’, that contains alphabets and hyphens (-). Implement the function to move all hyphens(.) in the string to the front of the given string. 

Note:-
Return null if str is null. 

Example:-
Input:-
Move-Hyphens-to-Front 

Output:-
---MoveHyphenstoFront 

Explanation:-
The string “Move-Hyphens -to-front” has 3 hyphens (.), which are moved to the front of the string, this output is “— MoveHyphen” 

Input format :-
The input is the string.

Output format :-
The output is the string with the hyphen moved to the left end.

Sample test cases :-
Input 1 :-
Iam-neo
Output 1 :-
-Iamneo

Input 2 :-
Move-Hyphens-to-Front
Output 2 :-
---MoveHyphenstoFront

*/
