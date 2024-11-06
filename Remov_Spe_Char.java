package prabu.javaprograms;

public class Remov_Spe_Char {
	
	public static void main(String[] args) {
		
			String input="heloo0@38r@03#rj*sf^$jo$";
			System.out.println(input);
			System.out.println(input.replaceAll("[^a-zA-Z0-9]",""));
		}

	}


