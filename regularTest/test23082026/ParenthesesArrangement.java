import java.util.Scanner;
public class ParenthesesArrangement{
    
    private static int calc(int n){
        if(n ==0) return 1;
        int x = 0;
        for(int i=0; i<n; ++i){
            x += calc(i) * calc(n-1-i);
        }
        return x;
    }
    
    private static int bracketCombinations(int n){
        return calc(n);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      
        int result = bracketCombinations(n);
        System.out.println(result);
        
        sc.close();
    }
}

/*

Problem Statement:-
Have the function BracketCombinations(num) read num which will be an integer greater than or equal to zero, and return the number of valid combinations that can be formed with num pairs of parentheses.

For example, if the input is 3, then the possible combinations of 3 pairs of parenthesis, namely: ()()(), are ()()(), ()(()), (())(), ((())), and (()()). There are 5 total combinations when the input is 3, so your program should return 5.

Input format :-
The input consists of a single integer n, representing the number of pairs of brackets.

Output format :-
The output displays a single integer representing the number of possible combinations of well-formed bracket sequences.

Refer to the sample output for the formatting specifications.

Code constraints :-
0 ≤ n ≤ 8

Sample test cases :-
Input 1 :-
3
Output 1 :-
5

Input 2 :-
2
Output 2 :-
2

Input 3 :-
0
Output 3 :-
1

*/
