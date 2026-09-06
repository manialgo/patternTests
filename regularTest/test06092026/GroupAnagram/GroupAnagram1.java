import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


public class GroupAnagram1{
    
    private static List<List<String>> groupAnagram(String[] words){
        List<List<String>> result = new ArrayList<>();
        
        String temp;
        char[] chArr;
        int idx = 0;
        Map<String, Integer> sortedList = new HashMap<>();
                
        for(String word : words){
            chArr = word.toCharArray();
            Arrays.sort(chArr);
            temp = new String(chArr);
            
            if(!sortedList.containsKey(temp)){
            	sortedList.put(temp, idx);
            	idx++;
                result.add(new ArrayList<String>() );
            }
            
            result.get(sortedList.get(temp)).add(word);
        }
        
        return result;
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
