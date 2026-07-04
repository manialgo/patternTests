import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class ChampionshipProblem {
    private static long atMost(int[] chArr, int size, int p, int c) {
        if (p < 0) return 0;
        long result = 0;
        int left = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int right = 0; right < size; right++) {
            int temp = chArr[right];
            map.put(temp, map.getOrDefault(temp, 0) + 1);
            while (map.getOrDefault(c, 0) > p) {
                int leftChar = chArr[left];
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) map.remove(leftChar);
                left++;
            }            
            result += (right - left + 1);
        }
        return result;
    }
    private static long undertakerString(String str, int p, int c) {
        int size = str.length();
        int[] chArr = new int[size];
        for (int i = 0; i < size; i++) chArr[i] = str.charAt(i) - '0';
        return atMost(chArr, size, p, c) - atMost(chArr, size, p - 1, c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int c = sc.nextInt();
        String str = sc.next();
        System.out.println(undertakerString(str, p, c));
        sc.close();
    }
}


/*

Problem Statement:-
Two fighters were fighting in the arena to win the title heavyweight CHAMPIONSHIP and the special guest for the tournament was “The undertaker”. After seeing for while our guest Mr. The undertaker got bored and changed the competition style, instead of fighting he gave them a string which may contain all integers from 0 to 9. Now he is keen on knowing that how many subs-string that can be created from a string contains a character c exactly p times.

Input format :-
The first line contain two integers p and c, second line contain a string.

Output format :-
Output the answer.

Code constraints :-
i<= p,|s| <=1000000
0 <= c <= 9

Sample test cases :-
Input 1 :-
1 2
212
Output 1 :-
4

Input 2 :-
4 5
55555
Output 2 :-
2

*/
