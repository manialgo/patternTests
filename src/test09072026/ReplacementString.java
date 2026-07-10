package test09072026;

import java.util.Scanner;

public class ReplacementString {

    private static String replaceSubstring(String s, String subString1, String subString2) {
    	// edge case: nothing to replace
    	if (subString1 == null || subString1.isEmpty()) {
            return s;
        }

        StringBuilder sb = new StringBuilder();
        int i = 0;
        int len = s.length();
        int subLen = subString1.length();

        while (i < len) {
            // Check if substring matches starting at current position
            if (i + subLen <= len && s.substring(i, i + subLen).equals(subString1)) {
                sb.append(subString2);
                // skip the matched substring
                i += subLen;
            } else {
                sb.append(s.charAt(i));
                i++;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String subString1 = sc.nextLine();
        String subString2 = sc.nextLine();
        /*
         * In simple we can use the built=in method  s.repalce(subString1, subString2);
         */
      
        String result = replaceSubstring(s, subString1, subString2);
        System.out.println(result);

        sc.close();
    }
}

/*

Problem Statement:-
Write a program to obtain a string, a substring, and the string that has to replace the substring, and print the modified string.

Input format :-
The first line of the input consists of a string.
The second line of the input consists of a substring.
The third line of the input consists of a string that has to replace the substring.

Refer to the sample input for formatting specifications.

Output format :-
The output prints the modified string.

Refer to the sample output for formatting specifications.

Sample test cases :-
Input 1 :-
audacious
cio
aaa
Output 1 :-
audaaaaus

Input 2 :-
Miss the boat
the
a
Output 2 :-
Miss a boat

*/
