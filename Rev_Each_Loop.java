package prabu.javaprograms;

public class Rev_Each_Loop {
public static void main(String[] args) {
		
		
		String s="Hello java";
		
		String[] all = s.split(" ");
		
		String rStr="";
		
		for (int i = 0; i < all.length; i++) {
			String word=all[i];
			String rev="";
			
			for (int j = 0; j < word.length(); j++) {
				
				rev=word.charAt(j)+rev;
				
			}
			rStr=rStr+rev+" ";
			
			
		}
		System.out.println(rStr);
	}


}
