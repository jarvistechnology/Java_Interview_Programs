package prabu.javaprograms;

public class Rev_Str {
	
	public static void main(String[] args) {
		
		
		String oStr = "Hello Java";
		String rStr = "";

		for (int i = 0; i < oStr.length(); i++) {
		  rStr = oStr.charAt(i) + rStr;
		}

		System.out.println(rStr);
	}

}
