package Day3;
//Find factorial of a number (using loop + function).
public class numfacfunc {

	public static void main(String[] args) {
		int num = 5;
		int result = factorial(num);
		System.out.println(result);

	}
	
	public static int factorial(int num) {
		int i = 1;
		int fac = 1;
	while(i<num) {
		fac = fac*(i+1);
	i++;
	}
	return fac;
	}

}
