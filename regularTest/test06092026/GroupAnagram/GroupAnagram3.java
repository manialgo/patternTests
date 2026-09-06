import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class GroupAnagram3 {
		
    private static List<List<String>> groupAnagram(String[] strs) {
        int[] arr = new int[26];
        int size = strs.length;
        String[] keys = new String[size];

        for(int i=0; i<size; i++){
            Arrays.fill(arr,0);
            for(char ch:strs[i].toCharArray())  arr[ch-'a']++;
            StringBuilder sb = new StringBuilder();
            for(int num:arr)  sb.append(num).append(",");
            keys[i] = sb.toString();
        }

        Map<String, List<String>> map = new HashMap<>();
        
        for(int j=0; j<size; j++){
            map.putIfAbsent(keys[j], new ArrayList<>());
            map.get(keys[j]).add(strs[j]);
        }
        
        return new ArrayList<>(map.values());
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];
        for(int i=0; i<n; i++) words[i] = sc.next();
        
        List<List<String>> result = groupAnagram(words);
        
        for(List<String> res : result) {
            for(String word : res) System.out.print(word+" ");
            System.out.println();
        }
        
        sc.close();
    }
    
}
