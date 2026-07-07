import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
class Solution {
    public int findShortestSubArray(int[] nums) {
        int max=0;
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i: nums){
            list.add(i);
            map.put(i,map.getOrDefault(i,0)+1);
            if((int)map.get(i)>max) max=map.get(i);
        }
        int min = Integer.MAX_VALUE;
        int num, n1, n2, temp;
        for(Map.Entry m: map.entrySet()){
            if((int)m.getValue()==max){
                num = (int)m.getKey();
                n1 = list.indexOf(num);
                n2 = list.lastIndexOf(num);
                temp = n2-n1+1;
                if(temp<min)    min=temp;
            }
        }
        return min;
    }
}
class SmallestSubStringDegree{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int len = sc.nextInt();
    int arr[]=new int[len];
    for(int i=0;i<len;i++)
    {
        arr[i]=sc.nextInt();
    }
    Solution s =new Solution();
    System.out.println(s.findShortestSubArray(arr));
    }
}

/*

Degree of an Array:-
Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements. Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.

Example 1:-
Input:-
n = 5
nums = [1,2,2,3,1]

Output:-
2

Explanation:-
The input array has a degree of 2 because both elements 1 and 2 appear twice.
Of the subarrays that have the same degree:
[1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]

The shortest length is 2. So return 2.

Example 2:-
Input:-
n = 7
nums = [1,2,2,3,1,4,2]

Output:-
6

Explanation:-
The degree is 3 because element 2 is repeated 3 times.
So [2,2,3,1,4,2] is the shortest subarray, therefore returning 6.

Input format :_
The first line of the input is the length of the array.
The second line of the input is the space-separated array of integer elements.

Output format :-
The output is the integer element representing the degree of the element.

Refer to the sample input and output for formatting specifications.

Code constraints :-
nums. length will be between 1 and 50,000.
nums[i] will be an integer between 0 and 49,999.

Sample test cases :-
Input 1 :-
5
1 2 2 3 1
Output 1 :-
2

Input 2 :-
7
1 2 2 3 1 4 2
Output 2 :-
6

*/
