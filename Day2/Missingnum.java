package Day2;
//268. Missing Number leetcode
public class Missingnum {

	public static void main(String[] args) {
		int[] nums= {0,1,2,3,5};
		 int i = nums.length;
	        int actsum = 0;
	        int expsum = i * (i+1)/2;
	        for(int n : nums){
	            actsum += n; 
	        
	    } int ans = expsum-actsum;
      System.out.println("missinh number = "+ans);
	}

}
