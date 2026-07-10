package test10062026;

import java.util.Scanner;

public class LastWorld{
/*      BRUTE FORCE IDEA IN TEST >:(
        String str2 = "";
        String str3 = "";
        String str4 = "";
        int count=0;
        for(int i=str.length()-1; i>=0; i--){
            str2 += str.charAt(i);
        }
        for(int j=0; j<str2.length(); j++){
            if(!(Character.isLetter(str2.charAt(j))))break;
            else {
                count++;
                str3 += str2.charAt(j);
            }
        }
        for(int i=str3.length()-1; i>=0; i--){
            str4 += str3.charAt(i);
        }
        System.out.println(count);
        System.out.println(str4);
*/
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArr = str.split(" ");
        int size = strArr.length;
        String result = strArr[size-1];
        
        System.out.println(result.length());
        System.out.println(result);
        sc.close();
    }
  
}

/*

Problem Statement:-
Given a string s consisting of words and spaces, return the length of the last word in the string.

Example 1:-
Input: s = "Hello World"

Output:-
5
World

Explanation:-
The last word is "World" with length 5.          

Example 2:-
Input: s = "luffy is still joyboy"
Output:-
6
joyboy

Explanation:-
The last word is "joyboy" with length 6.

Input format :-
The input consists of a string s.

Output format :-
The first line of output prints the length of the last word in the string.
The second line prints the last word in the string.

Refer to the sample output for the formatting specifications.

Code constraints :-
1 ≤ s.length ≤ 100
s consists of only English letters and spaces ' '.
There will be at least one word in s.

Sample test cases :-
Input 1 :-
Hello World
Output 1 :-
5
World

Input 2 :-
luffy is still joyboy
Output 2 :-
6
joyboy

*/
