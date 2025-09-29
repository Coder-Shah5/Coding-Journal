package Day1;
//check whether array is sorted or not 
public class checkarrsort {

	public static void main(String[] args) {
		int[] arr = {1,6,3,4,5};
		System.out.println(checksort(arr));
       
}
	static boolean checksort(int[] arr) {
		boolean result = true;
		for(int i =0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				result = false;
			}
		}
		return result;
	}
}