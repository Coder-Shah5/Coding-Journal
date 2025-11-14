package Day2;
//Find the 2nd largest number in the array
public class Seclarnum {

	public static void main(String[] args) {
		int[] arr = {10,24,55,76,20,18,5};
		int max = arr[0];
        int secmax = arr[0];
        
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        
       // System.out.println("max = "+max);
        
        for(int j = 0;j<arr.length;j++){
            if(arr[j]>secmax && arr[j]<max){
                secmax = arr[j];
            }
        }
        
        System.out.println("secmax ="+secmax);
        

	}

}
