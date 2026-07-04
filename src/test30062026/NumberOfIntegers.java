package test30062026;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class NumberOfIntegers{
    private static int nonRepeatedNumbers(int n1, int n2){
        Map<Integer, Integer> map = new HashMap<>();
        int result=0, dig, temp;
        boolean flag;
        for(int num=n1; num<=n2; num++){
        	flag = false;
        	temp = num;
            while(temp > 0){
                dig = temp % 10;
                map.put(dig, map.getOrDefault(dig, 0)+1);
                if(map.get(dig) > 1) {
                	flag = true;
                	break;
                }
                temp /= 10;
            }
            if(!flag) result++;
            map.clear();
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(nonRepeatedNumbers(n1, n2));
        sc.close();
    }
}

/*

Problem Description -: 
Given two non-negative integers n1 and n2, where n1<n2. The task is to find the total number of integers in the range [n1, n2](both inclusive) which have no repeated digits.

For example:
Suppose n1=11 and n2=15.
There is the number 11, which has repeated digits, but 12, 13, 14 and 15 have no repeated digits. So, the output is 4.

Input format:-
Input consists of two integers.

Output format:-
Output consists of non repeated integer.

Sample test cases :
Input:-
11
15
Output:-
4

*/