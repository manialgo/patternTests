import java.util.Scanner;
import java.util.ArrayList;

public class SubStringArrange{
    
    private static ArrayList<String> orderList(String s){
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                list.add(s.substring(i, j+1));
            }
        }
        
        int idxVal=0, k, idx;
        String original, temp;
        
        for(idx=0; idx<list.size(); idx++){
            idxVal = idx;
            temp = list.get(idx);
            for(k=idx+1; k<list.size(); k++){
                if( temp.compareTo(list.get(k)) > 0) {
                    temp = list.get(k);
                    idxVal = k;
                }
            }
            
            original = list.get(idx);
            list.set(idx, list.get(idxVal));
            list.set(idxVal, original);
            
        }
        return list;
    }
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.toLowerCase();
        ArrayList<String> res = orderList(s);
        for(String str : res) System.out.println(str);
        sc.close();
    }
}

/*

Problem Statement:-
Program to find all subarrays of a string and print it in sorted order. In this program, all the subarrays of the string need to be printed. The subarray is a contiguous part of a string. All the possible subarrays for a string will be n(n+1)/2. For example, all possible subsets of a string "FUN" will be F, U, N, FU, UN, FUN.

Input format :-
Input consists of a string

Output format :-
Output consists of a substrings.

Sample test cases :-
Input 1 :-
Examly
Output 1 :-
a
am
aml
amly
e
ex
exa
exam
examl
examly
l
ly
m
ml
mly
x
xa
xam
xaml
xamly
y

Input 2 :-
iamneo
Output 2 :-
a
am
amn
amne
amneo
e
eo
i
ia
iam
iamn
iamne
iamneo
m
mn
mne
mneo
n
ne
neo
o

*/
