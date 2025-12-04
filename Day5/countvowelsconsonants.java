package Day5;
//Count vowels + consonants
public class countvowelsconsonants {

	public static void main(String[] args) {
	String s = "developer";
	char[] arr = s.toCharArray();
	int vowelcount= 0;
	int consocount= 0;
	for(int i = 0;i<arr.length-1;i++) {
		if("aeiou".indexOf(arr[i])!=-1) {
			vowelcount++;
		}
		else {
			consocount++;
		}
	}
    System.out.println("vowels count = "+vowelcount);
    System.out.println("consonants count = "+consocount);
	}

}
