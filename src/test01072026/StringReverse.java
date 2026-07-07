// Just a learning kid using lots of private and public classes int the learning process:

import java.util.Scanner;
class Solution{
    private String reverseOdd(String s, int size){
            StringBuilder sbFirstHalf = new StringBuilder();
            StringBuilder sbSecondHalf = new StringBuilder();
            int mid = (size / 2);
            String result;
            sbFirstHalf.append(s.substring(0, mid));
            sbSecondHalf.append(s.substring(mid+1, size));
            result = sbFirstHalf.reverse().toString() + s.charAt(mid) + sbSecondHalf.reverse().toString();
            return result;
    }
    private String reverseEven(String s, int size){
            StringBuilder sbFirstHalf = new StringBuilder();
            StringBuilder sbSecondHalf = new StringBuilder();
            int mid = (size / 2);
            String result;
            sbFirstHalf.append(s.substring(0, mid));
            sbSecondHalf.append(s.substring(mid, size));
            result = sbFirstHalf.reverse().toString() + sbSecondHalf.reverse().toString();
            return result;
    }
    public String stringReverse(String s){
        int size = s.length();
        String result;
        if(size % 2 != 0)    result = reverseOdd(s, size);
        else    result = reverseEven(s, size);
        return result;
    }
}
public class StringReverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Solution sol = new Solution();
        String result = sol.stringReverse(s);

        System.out.println(result);
        sc.close();
    }
}

/*
MY APPROACH IN TEST SAME BUT SHORTED
import java.util.Scanner;
class StringReverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int size = s.length(), mid;
        StringBuilder sbFirstHalf = new StringBuilder();
        StringBuilder sbSecondHalf = new StringBuilder();
        String result ="";
        mid = size / 2;
        if(size % 2 != 0) {
            sbFirstHalf.append(s.substring(0, mid));
            sbSecondHalf.append(s.substring(mid+1, size));
            result = sbFirstHalf.reverse().toString() + s.charAt(mid) + sbSecondHalf.reverse().toString();
        }
        else{
        sbFirstHalf.append(s.substring(0, mid));
        sbSecondHalf.append(s.substring(mid, size));
        result = sbFirstHalf.reverse().toString() + sbSecondHalf.reverse().toString();
        }
        System.out.println(result);
        sc.close();
    }
}

*/

/*

Problem Statement :-
Given a string (array of characters), split the string in half and reverse each half.

Input format :-
String in the first line

Output format :-
Output the string after reversal.

If the length of the string is even, split equally.
If the length of the string is odd, leave the middle character in the same position and reverse the first and second half.

Code constraints :-
Array size <=50

Sample test cases :-
Input 1 :-
placementseasoncoimbatore
Output 1 :-
aestnemecalpserotabmiocno

*/
