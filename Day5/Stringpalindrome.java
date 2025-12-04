package Day5;
//Check if a string is palindrome
public class Stringpalindrome {

	public static void main(String[] args) {
		String s = "sharath";
		String rev = "";
		char[] arr = s.toCharArray();
		int l = arr.length-1;
		for(int i=l;i>=0;i--) {
			rev+= arr[i];
		}
		System.out.print(isplaindrome(s,rev));	}
	
	public static boolean isplaindrome(String name, String revname) {
		if(name.equals(revname)) {
		//	System.out.println("is palindrome");
			return true;
		}
		else {
			//System.out.println("is not palindrome");
			return false;
		}
	}

}
