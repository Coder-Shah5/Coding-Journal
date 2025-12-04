package Day5.DSA;
//leetcode 387
import java.util.HashMap;
Class Solution {
    public int firstUniqChar(String s) {
       HashMap <Character, Integer> freq = new HashMap<>();
       for(char c : s.toCharArray()){
        freq.put(c,freq.getOrDefault(c,0)+1);
       } 
       char[] arr = s.toCharArray();
       for(int i =0;i<arr.length;i++){
        if(freq.get(arr[i])==1){
            return i  ;
        }
       } return -1;
    }
}