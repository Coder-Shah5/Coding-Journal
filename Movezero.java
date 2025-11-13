package Day2;

import java.util.Arrays;

//283. Move Zeroes leetcode
public class Movezero {

	public static void main(String[] args) {
		  int[] nums = {0,1,0,12,5,0};
		  int j = 0;
	        for(int i =0;i<nums.length;i++){
	            if(nums[i]!=0){
	                int temp = nums[i];
	                nums[i] = nums[j];
	                nums[j] = temp;
	                j++;
	            }
	        }
           System.out.println(Arrays.toString(nums));
           }

}
