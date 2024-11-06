package prabu.javaprograms;

public class Armstrong {
	

	private static  void subMethod() {
		
		
		//153 - 1^3  + 5^3  + 3^3  =>  (1*1*1) + (5*5*5)  + (3*3*3) => 1+125+27 = 153
		
		
		
		
		
		
		/*
		 * 
		 * 5*5 = 25
		 * 
		 * 15*15 =225
		 * 
		 * 
		 * 25*25 =625
		 * 
		 * 35*35 =1225
		 * 
		 * 45*45 =2025
		 * 
		 * 55*55 = 3025
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
		
		System.out.println("This Program is to check the given number is ArnStrong Number or not??? ");
		
		
		
		
		int a = 371;
		int i = a;
		int r ;
		int sum = 0;
		while(a>0) {
			r = a%10;
			sum = (r*r*r)+sum;
			a=a/10;
		}
		if (i == sum) {
			System.out.println("The given number is Armstrong :"+ i);
		} else {
			System.out.println("The given number is not an Armstrong number :"+i);
		}
		
		}

	
	
	public static void main(String[] args) {
		subMethod();
	}
	

}
