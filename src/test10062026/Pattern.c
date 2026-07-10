#include<stdio.h> 
int main() { 
	int n;
    scanf("%d",&n); 
	int sp = n / 2, st = 1; 
	
	for (int i = 1; i <= n; i++) { 
		for (int j = 1; j <= sp; j++) { 
            printf(" ");
		} 
		
		int count = 1; 
		for (int k = 1; k <= st; k++) { 
			if (k % 2 == 0) 
                printf("*"); 
			else
            printf("%d",count++);
		} 
        printf("\n"); 
		if (i <= n / 2) { 
			sp = sp - 1; 
			st = st + 2; 
		} 
		else { 
			sp = sp + 1; //3
			st = st - 2; //-1
		} 
	} 

	return 0; 
} 


/*
TEST FORCES TO USE ONLY THE C
Problem Statement:-
Write a program to print the following pattern.

Input:-
5

Output:-

  1
 1*2
1*2*3
 1*2
  1

Input format :-
The input consists of an integer N.

Output format :-
The output prints the required pattern as given in the problem statement.

Refer to the sample output for the formatting specifications.

Code constraints :-
1 <= N <= 20

Sample test cases :-
Input 1 :-
5
Output 1 :-
  1
 1*2
1*2*3
 1*2
  1

*/
