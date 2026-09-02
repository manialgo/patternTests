import java.util.Scanner;
public class StringComparator{
    
    private static int stringComparison(String str1, String str2){
        return str1.compareTo(str2);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        if(!sc.hasNext()) {
        	System.out.print("User input invalid");
        	sc.close();
        	return;
        }
        
        try {
        	String str1 = sc.next();
            String str2 = sc.next();
            
            int res = stringComparison(str1, str2);
            
            System.out.println(res);
        }catch(Exception e) {
        	e.printStackTrace();
        }
        
        sc.close();
        
    }
}


/*

Problem Statement:-
John, a software developer, is working on a program to compare two strings based on their lexicographical order. He needs to implement a solution that compares two strings and outputs the result based on whether the first string is greater, smaller, or equal to the second string. The program should use the compareTo method to perform the

Input format :-
The first line of input consists of a string str1 (1 ≤ str1.length() ≤ 100), representing the first string.
The second line of input consists of a string str2 (1 ≤ str2.length() ≤ 100), representing the second string.

Refer to the sample output for formatting specifications.

Output format :-
The program should output an integer:

A positive integer if str1 is lexicographically greater than str2.
A negative integer if str1 is lexicographically smaller than str2.
Zero if both strings are equal.

Code constraints :-
The given test cases fall under the following constraints:
1 ≤ str1.length(), str2.length() ≤ 100
The strings are case-sensitive.

Sample test cases :-
Input 1 :-
harry
harry
Output 1 :-
0

Input 2 :-
hello
world
Output 2 :-
-15

Input 3 :-
tiger 
lion
Output 3 :-
8

*/
