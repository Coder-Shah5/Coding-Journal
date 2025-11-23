package Day3;

import java.util.Arrays;

//Function to reverse an array.
public class funcrevarr {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,};
		System.out.println(Arrays.toString(reverse(nums)));

	}
	
	public static int[] reverse(int[] arr) {
		int l = arr.length;
		for(int i=0;i<l/2;i++) {
			int temp = arr[i];
			arr[i]=arr[l-i-1];
			arr[l-i-1]=temp;
		} return arr;
	}

}
