package Day3;
//Check if a number is prime.
public class primenumfunc {

	public static void main(String[] args) {
		int num = 23;
		System.out.print(isprime(num));
		
		
				
	}
	
	public static boolean isprime(int num) {
		
		for(int i = 2;i<num;i++) {
			if(num<=1) {
				return false;
			}
			if(num%i==0) {
				//System.out.println(" not prime");
				return false;
			}
		}
		//System.out.println(" is prime");
		return true;
	}

}
