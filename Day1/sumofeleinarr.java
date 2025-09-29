package Day1;
// return sum of all the elements in array
public class sumofeleinarr {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println(sumofele(arr));

	}
	
	static int sumofele(int[] arr) {
		int sum = 0;
		for(int i = 0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}

}
