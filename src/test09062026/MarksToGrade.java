import java.util.Scanner;

public class MarksToGrade{

    public static String result(int n){
        if(n>=85 && n <=100) return "A";
        if(n>=75 && n <=84) return "B";
        if(n>=65 && n <=74) return "C";
        if(n>=0 && n <=64) return "D";
        
        return "Invalid";
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(result(n));
        sc.close();
    }

}


/*

Problem Statement:-
Akash is a dedicated teacher who believes in fair and transparent grading. He wants to automate the process of assigning grades to his students based on their exam marks.

Akash uses the following grading system:-
A: 85 - 100
B: 75 - 84
C: 65 - 74
D: 0 - 64

Any mark outside these ranges is considered invalid.

Input format :-
The input consists of an integer representing the exam mark of the student.

Output format :-
The output displays the following format:

If the mark is between 85 and 100 (inclusive), print "A".
If the mark is between 75 and 84 (inclusive), print "B".
If the mark is between 65 and 74 (inclusive), print "C".
If the mark is between 0 and 64 (inclusive), print "D".
If the mark is outside these ranges, print "Invalid".

Refer to the sample output for the formatting specifications.

Code constraints :-
The test cases will fall under the following constraints:
0 <= mark <= 100

Sample test cases :-
Input 1 :-
92
Output 1 :-
A

Input 2 :-
78
Output 2 :-
B

Input 3 :-
67
Output 3 :-
C

Input 4 :-
0
Output 4 :-
D

Input 5 :-
109
Output 5 :-
Invalid

*/
