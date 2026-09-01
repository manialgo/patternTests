import java.util.Arrays;
import java.util.Scanner;

public class UnlockKey{
    
    private static int unlockKeyMethod(int key, boolean isNeg){
        String s = String.valueOf(key);
        if(isNeg) s = s.substring(1);
        
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        
        if(arr[0] == '0' && arr.length > 1){
            for(int i=1; i<arr.length; i++){
                if(arr[i] != '0'){
                    arr[0] = arr[i];
                    arr[i] = '0';
                    break;
                }
            }
        }
        
        String unlockKey = new String(arr);
        int res = Integer.parseInt(unlockKey);
        if(isNeg) res *= -1;
        
        return res;
        
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        boolean isNeg = (key < 0) ? true : false;
        
        int unlockKey = unlockKeyMethod(key, isNeg);
        
        System.out.println(unlockKey);
        
        sc.close();
    }
}

/*

Problem description:-
Mr. Jason has captured your friend and has put a collar around his neck. He has locked it with a given ‘locking key’. It can be opened now with an ‘unlocking key’. Your friend has seen the ‘locking key’ but he does not know about the ‘unlocking key’. Given the locking key, one can figure out the ‘Unlocking key’ which is the smallest (in magnitude) permutation of the digits of that number and it never starts with zero.

Help your friend to write an algorithm that takes the locking key as an input and outputs the unlocking key.

Example:-
Input:-
312

Output:-
123

Explanation:
123 is the least possible permutation of the digits (3,1,2) in the given number.

Input format :-
The input consists of an integer K, representing the locking key.

Output format :-
Print an integer representing the unlocking key.

Code constraints :-
-107 < K < 107

Note:-

There exists a possible answer for every input.

Sample test cases :-
Input 1 :-
312
Output 1 :-
123

Input 2 :-
111
Output 2 :-
111

*/
