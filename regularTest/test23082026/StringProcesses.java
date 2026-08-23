import java.util.Scanner;
public class StringProcesses{
    
    private static String vowel(String s){
        StringBuilder sb = new StringBuilder();
        char[] arr =  s.toCharArray();
        for(char ch : arr){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch =='O' || ch == 'U') ch = '$';
            sb.append(ch);
        }
        return sb.toString();
    }
    
    private static String consonant(String s){
        StringBuilder sb = new StringBuilder();
        char[] arr =  s.toCharArray();
        for(char ch : arr){
            if(ch != 'a' && ch != 'e' && ch != 'i' && ch !='o' && ch != 'u' && ch != 'A' && ch != 'E' && ch != 'I' && ch !='O' && ch != 'U') ch = '#';
            sb.append(ch);
        }
        return sb.toString();
    }
    
    private static String lowerToUpper(String s){
        StringBuilder sb = new StringBuilder();
        char[] arr =  s.toCharArray();
        for(char ch : arr){
            if(ch <= 'z' && ch >= 'a') ch = Character.toUpperCase(ch);
            sb.append(ch);
        }
        return sb.toString();
    }
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s  = sc.nextLine();
        String[] sArr = s.split(" ");
        String result="";
        result += vowel(sArr[0]);
        result += consonant(sArr[1]);
        result += lowerToUpper(sArr[2]);
        
        System.out.println(result);
        
        sc.close();
    }
}


/*

Problem Statement:-
Write a program that reads three strings from the user and performs the following operations on them:

Replace all vowels in the first string with the character $.
Replace all consonants in the second string with the character #.
Convert all lowercase characters in the third string to uppercase.

After performing these operations, concatenate the modified strings (in the order they were read) and print the resulting string. The program should use character arrays to store the strings and not use any string library functions.

Input format :-
The input consists of three strings value 's', each containing a string of characters (words or sentences) separated by spaces.

Output format :-
The output displays the modified string after applying the specified transformations as mentioned in the statement.

Refer to the sample output for the formatting specifications.

Code constraints :-
The string s contains uppercase, lowercase, and spaces with at most 50 characters.

Sample test cases :-
Input 1 :-
College Engineering Technology
Output 1 :-
C$ll$g$E##i#ee#i##TECHNOLOGY

Input 2 :-
Examly iamneo programming 
Output 2 :-
$x$mlyia##eoPROGRAMMING

*/
