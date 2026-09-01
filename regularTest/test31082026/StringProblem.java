import java.util.Scanner;

public class StringProblem{
    
    private static String stringProcess(String s){
        int[] freq = new int[26];
        for(char ch : s.toCharArray()) freq[ch - 'a']++;
        
        String res = "";
        int i=0;
        for(int val : freq) {
            if(val > 0) res += (char) ('a'+i);
            i++;
        }
        
        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        String res = stringProcess(s);
        System.out.println(res);
        
        sc.close();
    }

}


/*

Problem Statement:-
Given a string s, remove duplicate letters so that every letter appears once and only once. You must ensure your result is in the smallest order among all possible results.

Example 1:-
Input: s = "bcabc"

Output: "ABC"

Example 2:-
Input: cbacdcbc

Output: abcd

Input format :-
The first line of input consists of a string s, representing the input string.

Output format :-
Refer to the sample output for the formatting specifications.

Code constraints :-
1 ≤ s.length ≤ 100
s consists of only lowercase English letters.

Sample test cases :-
Input 1 :-
bcabc
Output 1 :-
abc

Input 2 :-
cbacdcbc
Output 2 :-
abcd

*/
