import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class SameBaseAlphabets{
  private static boolean baseLetter(String s1, String s2){
    char[] s1Arr = s1.toCharArray();
    char[] s2Arr = s2.toCharArray();
    
    Set<Character> set1 = new HashSet<>();
    Set<Character> set2 = new HashSet<>();
    
    for(int i=0; i<s1.length(); i++) set1.add(s1Arr[i]);
    
    for(int i=0; i<s2.length(); i++) set2.add(s2Arr[i]);
    
    return set1.equals(set2);
    
  }
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String s1 = sc.nextLine();
      String s2 = sc.nextLine();
      System.out.println((baseLetter(s1, s2) ? "True" : "False"));
      sc.close();
  }
}

/*

Problem Statement:-
Ramu and Raju are playing a word game. They need to write a program to check if the two strings use the same base alphabets. Two strings are said to be the same if they have the same base alphabets to form the word.

Input format :-
The input contains two strings in separate lines.

Output format :-
The output displays 'True' if two strings have the same base alphabets.
Otherwise, the output displays 'False' if two strings have different base alphabets.

Code constraints :-
Input Size :-
|S| <= 1000000

Sample test cases :-
Input 1 :-
rescue
curse
Output 1 :-
True

Input 2 :-
domain
network
Output 2 :-
False

*/
