import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class GroupAnagram2 {
	
    private static List<List<String>> groupAnagram(String[] words) {
        Map<String, List<String>> map = new HashMap<>();
        
        for(String str: words){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = String.valueOf(arr);
            
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
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
