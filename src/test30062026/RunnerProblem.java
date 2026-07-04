package test30062026;

import java.util.Scanner;
public class RunnerProblem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Double runner1 = 0.0, runner2 = 0.0, runner3 = 0.0, temp;
        for(int i=0; i<9; i++){
            if(i==0 || i==3 || i==6) {
            	temp = sc.nextDouble();
            	if(sc.hasNextDouble() && temp>=1 && temp <=100) runner1 += temp;
            	else System.out.println("INVALID INPUT");
            }
            if(i==1 || i==4 || i==7) {
            	temp = sc.nextDouble();
            	if(sc.hasNextDouble() && temp>=1 && temp <=100) runner2 += temp;
            	else System.out.println("INVALID INPUT");
            }
            if(i==2 || i==5 || i==8) {
            	temp = sc.nextDouble();
            	if(sc.hasNextDouble() && temp>=1 && temp <=100) runner3 += temp;
            	else System.out.println("INVALID INPUT");
            }
        }
        Double run1 = runner1 / 3;
        Double run2 = runner2 / 3;
        Double run3 = runner3 / 3;
        
        if(run1 >= run2 && run1 >= run3) System.out.println("Trainee Number : 1");
        if(run2 >= run1 && run2 >= run3) System.out.println("Trainee Number : 2");
        if(run3 >= run1 && run3 >= run2) System.out.println("Trainee Number : 3");
        sc.close();
    }
}


/*

Problem Description:-
Selection of MPCS exams include a fitness test which is conducted on ground. There will be a batch of 3 trainees, appearing for running test in track for 3 rounds. You need to record their oxygen level after every round. After trainee are finished with all rounds, calculate for each trainee his average oxygen level over the 3 rounds and select one with highest oxygen level as the most fit trainee. If more than one trainee attains the same highest average level, they all need to be selected.
Display the most fit trainee (or trainees) and the highest average oxygen level.

Note:
The oxygen value entered should not be accepted if it is not in the range between 1 and 100.
If the calculated maximum average oxygen value of trainees is below 70 then declare the trainees as unfit with meaningful message as “All trainees are unfit.
Average Oxygen Values should be rounded.

Input format:-
Input should be 9 integer values representing oxygen levels entered in order as.

Output format:-
Output should display the trainee who attains the highest average level.

For wrong input , should display INVALID INPUT.

Sample test cases :
Input:-
95
92
95
92
90
92
90
92
90

Output:-
Trainee Number : 1
Trainee Number : 3

*/