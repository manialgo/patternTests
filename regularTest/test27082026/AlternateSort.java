import java.util.Scanner;
import java.util.Collections;

public class AlternateSort{
    
    private static void alternate(ArrayList<Integer> list){
        Collections.sort(list);
        for(int i=0; i<list.size(); i+=2) System.out.print(list.get(i)+" ");
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<N; i++) list.add(sc.nextInt());
        
        alternate(list);
        
        sc.close();
    }
}

/*

Problem description:-
An alternate sort of a list consists of alternate elements (starting from the first position) of the given list after sorting it in ascending order. 
You are given a list of unsorted elements. Write an algorithm to find the alternate sort of the given list.

Example:-
Input:-
8
3 5 1 5 9 10 2 6

Output:-
1 3 5 9

Explanation:
After sorting, the list is [1, 2, 3, 5, 5, 6, 9, 10]. So, the alternate elements of the sorted list are [1, 3, 5, 9]

Input format :-
The first line of the input consists of an integer size, representing the size of the given list (N).
The second line consists of N space-separated integers – list[1], list[2], ….., list [N], representing the input list of integers.

Output format :-
Print space-separated integers representing alternate sorted elements of the given list.

Code constraints :-
0 < size < 106
-106 < list[i] < 106
0 < i < size

Sample test cases :-
Input 1 :-
8
3 5 1 5 9 10 2 6
Output 1 :-
1 3 5 9 

Input 2 :-
7
1 3 2 4 5 7 6
Output 2 :-
1 3 5 7

*/
