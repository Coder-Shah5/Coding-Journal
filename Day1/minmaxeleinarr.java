package Day1;
//find min and max element in array
public class minmaxeleinarr {

	public static void main(String[] args) {
     int [] arr = {1,2,3,4,5};
        
        System.out.println(minnum(arr));
        System.out.println(maxnum(arr));
        
    }
    static int maxnum(int[] arr){
        int max = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        } return max;
    }
    static int minnum(int[] arr){
        int min = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        } return min;

	}

}
