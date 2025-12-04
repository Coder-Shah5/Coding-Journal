package Day5;
//Reverse each word in a sentence
public class revwordsinsentence {

	public static void main(String[] args) {
		String sentence = "my name is shah";
		String[] words = sentence.split(" ");
		String reversestring = " "; 
		
		for (String w : words){
			StringBuilder result  = new StringBuilder(w);
			result.reverse();
			reversestring += result + " ";
		}
		System.out.println(reversestring);
	}

}
