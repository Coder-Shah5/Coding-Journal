package Day1;
//find element in array using linear search
public class linearsearch {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int num = 5;
        System.out.println(ls(arr,num));
        }
	
	static int ls(int[] arr,int num) {
		for(int i = 0;i<arr.length;i++) {
			if( arr[i]==num){
				return i;
			}
			
		}return -1;
	}

}
