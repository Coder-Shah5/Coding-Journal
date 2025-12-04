package Day5.DSA;
//leetcode 242
import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) { 
        if(s.length()!=t.length()){
            return false;
        }
       HashMap <Character,Integer> freq = new HashMap<>();
       for(char c : s.toCharArray()){
        freq.put(c, freq.getOrDefault(c,0)+1);
       }
       for(char c : t.toCharArray()){
        freq.put(c, freq.getOrDefault(c,0)-1);
       }
     for(int i : freq.values()){
        if(i!=0){
            return false;
        }
    
     } return true;
    }
}