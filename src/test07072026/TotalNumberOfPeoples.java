import java.util.Scanner;
public class TotalNumberOfPeoples{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int girls = sc.nextInt();
/*
Analogy:
Boys: 1/3
Girls: 3/6
Adults: Remaining

On total the LCM will be 6 (over the denominators[3,6])
so =>   Boys: (1/3)*(2/2) = 2/6
        Girls: 3/6
        Adults: Remaining = 1/6
        x- girls more than adults: 1/6 = (3/6) + x (excess)
        On total: (2/6)*r : (3/6)*r : (1/6)*r where r=total count
        So (3/6)*r = input (Number of girls)
        => (1/3)*r = input
        => r = input*3
*/
        System.out.println(3*girls);
        sc.close();
    }
}

/*

Problem Statement:-
Mountain View Middle School is all set for organizing its elaborate talent show event of the year, "Stars Onstage". 
It is a fun-filled event for the students to showcase and build their confidence.
Of the total audience who had come for the show, 1/3 were boys, 3/6 were girls and the rest of them were adults. If there were 'x' more girls than adults, how many people were there in total? 

Help the School authorities to find the total number of people who visited their show.

Input format :-
The input is an integer 'x', which corresponds to the count of girls more than adults.

Output format :-
The output prints the total number of people who visited the talent show.

Sample test cases :-
Input 1 :-
50
Output 1 :-
150

Input 2 :-
78
Output 2 :-
234

*/
