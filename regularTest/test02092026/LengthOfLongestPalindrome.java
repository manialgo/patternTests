import java.util.Scanner;

public class LengthOfLongestPalindrome{
    
    private static boolean isPalindrome(String str){
        int start = 0, end = str.length()-1;
        while(start < end){
            if(str.charAt(start) != str.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
    
    private static int lengthOfLongestPalindromicSubstring(String str){
        int length, maxLength = 0;
        
        for(int start = 0; start < str.length(); start++){
            for(int end = str.length(); end > start; end--){
                if(isPalindrome (str.substring(start, end) )){
                	length= end - start;
                	maxLength = maxLength > length ? maxLength : length;
                    break;
                }
                if(end - start <= maxLength) break;
            }
        }
        return maxLength;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNext()) {
        	System.out.print("User input invalid !");
        	sc.close();
        	return;
        }
        
        try {
        	String str = sc.next();
        	
            int res = lengthOfLongestPalindromicSubstring(str);
            
            System.out.println(res);
            
        } catch(Exception e) {
        	e.printStackTrace();
        }
        
        sc.close();
    }
}

/*

Problem Statement:-
Sharon is fascinated by palindromes and wants to find the length of the longest palindromic substring in a given string. 

Write a program for Sharon that takes a string as input and outputs the length of the longest palindromic substring.

Example:-
Input:-
bananas

Output: -
5

Explanation:-
The longest palindromic substring is 'anana' with a length of 5.

Input format :-
The input consists of a string.

Output format :-
The output prints the integer, representing the length of the longest palindromic substring.

Refer to the sample output for formatting specifications.

Code constraints :-
The string contains lowercase letters with at most 50 characters.

Sample test cases :-
Input 1 :-
bananas
Output 1 :-
5

Input 2 :-
acacacab
Output 2 :-
7

*/
