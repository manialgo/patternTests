import java.util.Scanner;

public class SubStringFormation{
    
    private static boolean formedBySubString(String str){
        int[] freq = new int[26];
        for(char ch : str.toCharArray()) freq[ch-'a']++;
        
        for(int i=0; i<25; i++) {
            if(freq[i] >= 1 && freq[i+1] >= 1){
                if(freq[i] != freq[i+1]) return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNext()){
            System.out.println("User input Invalid");
            sc.close();
            return;
        }
        
        try{
            String str = sc.next();
            System.out.println(str);
        
            boolean result = formedBySubString(str);
        
            if(result) System.out.print("True");
            else System.out.print("False");
        }catch(Exception e){
            e.printStackTrace();
        }
        
        sc.close();
    }
}


/*

Problem Statement:-
Given a string s, check if it can be constructed by taking a substring and appending multiple copies of the substring together.
                                                                                 
Example 1:-
Input: -
abab

Output: -
abab
True

Explanation: It is the substring "ab" twice.

Example 2:-
Input: -
aba

Output: -
aba
False

Example 3:-
Input: -
abcabcabcabc

Output: -
abcabcabcabc
True

Explanation: It is the substring "abc" four times or the substring "abcabc" twice.

Input format :-
The first line contains a single string s, representing the original string.

Output format :-
The first line prints the given input string.
The second line prints "True" if it satisfies the condition otherwise it prints "False".

Refer to the sample output for the formatting specifications.

Code constraints :-
1 ≤ s.length ≤ 100
s​​​​​​ consists only of lowercase English letters.

Sample test cases :-
Input 1 :-
abab
Output 1 :-
abab
True

Input 2 :-
aba
Output 2 :-
aba
False

*/
