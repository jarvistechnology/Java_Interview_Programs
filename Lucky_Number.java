package prabu.javaprograms;

import java.util.Scanner;

public class Lucky_Number {
	
	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Car No:");
		
		int no = s.nextInt();
		
		
		if (no<1000 || no>9999) {
			System.out.println(no+" is not a valid car number");
		}
		
		else {
			
			int sum=0;
			
			for (char ch : String.valueOf(no).toCharArray()) {
				sum+=Character.digit(ch, 10);
			}
			
			if ((sum%3==0) || (sum%5==0) || (sum%3==0)) {
				System.out.println("Lucky Number");
			}
			else {
				System.out.println("It is not my lucky Number");
			}
		}
		
		
	}

}
