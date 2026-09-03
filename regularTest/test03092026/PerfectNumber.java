import java.util.Scanner;

public class PerfectNumber{
    
    private static boolean isPerfectNumber(int n){
        int divisorSum=0;
        for(int i=1; i<=n/2; i++) {
            if(n % i == 0) divisorSum += i;
        }
        return divisorSum==n;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        if(!sc.hasNextInt()) {
            System.out.println("Inlvaid input Allowed range [1, 10^5]");
            sc.close();
            return;
        }
        
        try{
            int n = sc.nextInt();
            
            if(n <= 0) {
                System.out.println("Inlvaid input Allowed range [1, 10^5]");
                sc.close();
                return;
            }
            
            boolean result = isPerfectNumber(n);
            
            if(result) System.out.println(n+" is a perfect number");
            else System.out.println(n+" is not a perfect number");
        }catch(Exception e){
            e.printStackTrace();
        }
        
        sc.close();
    }
}


/*

Problem Statement:-
Mithun is fascinated by perfect numbers, and he is trying to identify whether a given number is perfect or not. A perfect number is a positive integer that is equal to the sum of its proper divisors, excluding itself.

Write a program to help Mithun determine whether a given number is a perfect number or not.

For example,

6 is the first perfect number

The proper divisors of 6 are 1, 2, and 3. The sum of its proper divisors is 1 + 2 + 3 = 6. Hence, 6 is a perfect number.

Input format :-
The input consists of a single integer, n, representing the number to be checked for perfection.

Output format :-
The output displays whether it is a perfect number or not in the following format:

"[n] is a perfect number" if it's a perfect number, otherwise, prints "[n] is not a perfect number"

Refer to the sample output for the formatting specifications.

Code constraints :-
In this scenario, the test cases fall under the following constraints:
1 ≤ n ≤ 105

Sample test cases :-
Input 1 :-
6
Output 1 :-
6 is a perfect number

Input 2 :-
50
Output 2 :-
50 is not a perfect number

*/
