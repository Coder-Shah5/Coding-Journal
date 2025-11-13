package Day2;
import java.util.Arrays;
public class Dupsortedarray {
//find num of unique nums in array
	public static void main(String[] args) {
		int[] nums = {1,1,2,2,3,4,5,5};
		int j =0;
	     
	      for(int i = 1;i<nums.length;i++){
	            if(nums[i]!=nums[j]){
	                j++;
	                nums[j]=nums[i];
	            }
	        
	        
	      }  
	      int m = j+1;
	      System.out.println("unique ="+m);

	}

}
