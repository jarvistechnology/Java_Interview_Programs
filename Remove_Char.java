package prabu.javaprograms;

public class Remove_Char {
	
	public static void main(String[] args) {
		
		String input="heloo038r03rjsfjo";
		System.out.println("Original :"+input);
		System.out.println("Output: "+input.replaceAll("[^0-9]",""));
	}

}
