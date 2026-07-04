package test22062026;

import java.util.Scanner;

public class PrimeFactorsCount {
    private static int countFactors(int N, int P) {
    	int power = 0;
    	while(N > 0 && N % P ==0) {
    		N /= P;
    		power++;
    	}
    	return power;
    }
    
    private static int getCount(int L, int R, int P) {
    	int count=0;
    	for(int i=L; i<=R; i++) {
    		count += countFactors(i, P);
    	}
    	return count;
    }
    
    private static boolean isPrime(int P) {
    	if(P < 2)	return false;
    	for(int i=2; i<=P/2; i++) {
    		if(P % i == 0)	return false;
    	}
    	return true;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        int P = sc.nextInt();
        if(!isPrime(P))	System.out.println(P+" is not a prime");
        else System.out.println(getCount(L, R, P));
        sc.close();
    }
}

/*

Problem Statement:-
Janu wants to write a Java program to print the number of occurrences of a particular prime number from the list of all prime factors of every number between the given limits. Create a function named "countFactors" and "getCount" and implement the following program.
Suppose the given limits are 2 and 8.

The numbers between this limit are
2
3
4
5
6
7
8

The list of all prime factors of the above numbers are
2
3
2,2
5
2,3
7
2,2,2

Now if the particular prime number is 3 then you should print the number of occurrences as 2

Input format :-
The first line will contain the left limit, L.
The second line will contain the right limit, R.
Then the following line has the prime number, P.

Output format :-
The output display the count of occurrences of a prime number in the prime factorization of every element from the given range.

Code constraints :-
1 <= L <= 200
L <= R <= 200
L <= P <= R

Sample test cases :-
Input 1 :-
2
8
3
Output 1 :-
2

Input 2 :-
22
45
5
Output 2 :-
6

Whitelist:-
Set 1:-
countFactors
getCount

*/
