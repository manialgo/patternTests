package test09072026;

import java.util.Scanner;

public class FullNamePrint{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Full name: "+name);
        sc.close();
    }

}

/*

Problem Statement:-
Arjun is creating a program that combines a user’s first and last names into a full name. He decides to split the input and then concatenate the names. 

Help him implement the task.

Input format :-
The input consists of a string full_input containing the first name and last name separated by a space.

Output format :-
The output prints "Full name: " followed by a string representing the full_name.

Refer to the sample output for formatting specifications.

Code constraints :-
The given test cases fall under the following constraints:
First name and last name contain only alphabetic characters.

Both names are at least 1 character long and separated by a single space.

Sample test cases :-
Input 1 :-
John Doe
Output 1 :-
Full name: John Doe

Input 2 :-
Alice Max
Output 2 :-
Full name: Alice Max

*/
