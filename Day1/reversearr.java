package Day1;
//reverse an array
import java.util.Arrays;

public class reversearr {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println(Arrays.toString(revarr(arr)));
	}
    static int[] revarr(int[] arr) {
    	int l = arr.length;
    	int[] newarr = new int[l] ;
    	
    	for(int i = 0;i<l;i++) {
    		newarr[i]=arr[l-i-1];
    	}return newarr;
    }
}
