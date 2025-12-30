package Day6.Day6_Java;

import java.util.Arrays;

public class Selectionsort {

	public static void main(String[] args) {
		int[] nums = {3,5,2,1,4};
		sort(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	public static int maxelement(int[] arr,int start,int end) {
		int max = start;
		for(int i = start;i<=end;i++) {			
			 if(arr[i]>arr[max]) {
				 max = i;
			 }
	}
		return max;
	}
	
	public static void sort(int[] arr) {
		for(int i = 0; i<arr.length;i++) {
		 int last = arr.length-i-1;
         int maxnum = maxelement(arr,0,last);
        	 swap(arr,maxnum,last);        
         }
		}

	public static void swap(int[] arr,int a,int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
