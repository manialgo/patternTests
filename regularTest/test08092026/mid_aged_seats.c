#include <stdio.h>

int count_of_mid_aged_peoples(int row, int seats[row][row]){
    int count=0;
    for(int i=0; i<row; i++){
        if(seats[i][i] >= 18 && seats[i][i] <= 60) count++;
    }
    return count;
}

int main(){
    int row;
    if(scanf("%d", &row) != 1 || row <=0) {
        printf("User input mismatch !");
        return 1;
    }
    int seats[row][row];
    for(int i=0; i<row; i++){
        for(int j=0; j<row; j++){
            scanf("%d", &seats[i][j]);
        }
    }
    
    int result = count_of_mid_aged_peoples(row, seats);
    
    printf("%d", result);
    
    return 0;
}

/*

Problem Statement:-
Single File Programming Question
	:- Mid Aged

The Pan Am 73 flight from Bombay to New York en route Karachi and Frankfurt was hijacked by a few Palestinian terrorists at the Karachi International Airport. The senior flight purser Neerja Banhot withered her fear and helped evacuating the passengers on board.

Neerja very well knew that she would not be able to evacuate all passengers dodging the hijackers. So she wanted to hand over the responsibility of evacuating in the senior citizens(above 60 years of age) and children(below 18 years of age) in the flight to the mid-aged passengers seated in the diagonals

Given n the number of rows of seats and the number of seats in a row and the ages of passengers in each seat can you find the number of mid-aged passengers seated in the diagonals.

Input format :-
The first line input consists of an integer n, corresponding to the number of rows of seats and the number of seats in the aircraft.
The next n lines of input consist of n integers that correspond to the ages of passengers

Output format :-
The output consists of an integer corresponding to the number of mid-aged passengers seated in the diagonals.

Sample test cases :-
Input 1 :-
3 
25 17 20
33 26 30
4 7 3
Output 1 :-
2

*/
