import java.util.Scanner;
public class NumberOfCarries{
/*
    static int NoOfCarries(int num1 , int num2){
        int carry = 0, sum, p, q, count = 0;
        while((num1!=0)&&(num2!=0)) {
            p = num1 % 10;
            q = num2 % 10;
            sum = carry + p + q;
            if(sum>9){
                carry = 1;
                count++;
            }else   carry = 0;
            num1 = num1/10;
            num2 = num2/10;
        }
        return count;
    }
*/
    private static int NoOfCarries(int num1, int num2){
        int temp1 = num1, size1=0, temp2 = num2, size2=0;
        while(temp1 > 0){
            size1++;
            temp1 /= 10;
        }
        while(temp2 > 0){
            size2++;
            temp2 /= 10;
        }
        int size = (size1 > size2) ? size1: size2;
        int[] nums1 = new int[size];
        int[] nums2 = new int[size];
        int result=0, carry=0;
        for(int i=size-1; i>=0; i--){
            nums1[i] = num1 % 10;
            num1 /= 10;
        }
        for(int i=size-1; i>=0; i--){
            nums2[i] = num2 % 10;
            num2 /= 10;
        }
        for(int i=size-1; i>=0; i--){
            if((nums1[i]+nums2[i]+carry) >= 10){
                result++;
                carry=1;
            }else carry=0;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(NoOfCarries(num1, num2));
        sc.close();
    }
}

/*

Problem Statement :-
A carry is a digit that is transferred to the left if the sum of digits exceeds 9 while adding two numbers from right-to-left one digit at a time.

You are required to implement the following function:-
int NumberOfCarries(int num1, int num2); 

The functions accept two numbers ‘num1’ and ‘num2’ as their arguments. You are required to calculate and return the total number of carriers generated while adding digits of two numbers ‘num1’ and ‘ num2’.

Assumption:-
num1, num2 >= 0 

Example:-
Input:-
451 
349 

Output:-
2 

Explanation:-
Adding ‘num 1’ and ‘num 2’ right-to-left results in 2 carries since ( 1+9) is 10. 1 is carried and (5+4=1) is 10, again 1 is carried. Hence 2 is returned. 

Input format :-
Input integers are the values of num1 & num2 respectively in separate lines.

Output format :-
The output prints the number of carrying operations.

Sample test cases :-
Input 1 :-
451
349
Output 1 :-
2

Input 2 :-
456
789
Output 2 :-
3

*/
