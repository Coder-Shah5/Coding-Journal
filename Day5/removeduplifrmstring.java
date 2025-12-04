package Day5;
// remove duplicates from string 
public class removeduplifrmstring {

	public static void main(String[] args) {
		String s = "banana";
		String news ="";
		char[] arr = s.toCharArray();
		
		for(int i =0;i<arr.length;i++) {  
			if(news.indexOf(arr[i])==-1) {
				news+=arr[i];				
			}			
		}
      System.out.println(news);
	}
}
