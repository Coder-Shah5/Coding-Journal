package Day6.Day6_Java;

import java.util.Arrays;

public class Bubblesort // code 
 {

	public static void main(String[] args) {
		int[] nums = {5,3,2,1,4};
        int[] result = sort(nums);
        System.out.println(Arrays.toString(result));    
	}
	
	public static int[] sort(int[] arr) {
		for(int i = 0;i<arr.length-1;i++) {
		 for(int j = 0;j<arr.length-1-i;j++) {
			if(arr[j]>arr[j+1]) {
				swap(arr,j,j+1);
			}
		}
	}
		return arr;
	}
	
	public static void swap(int[] arr,int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}
