package ipt.programs;

public class ArmStrong {
	
	
	public static void main(String[] args) {
		
		int a=153;
		int t=a;
		
		int b=0;
		
		int c=0;
		
		
		while(a>0) {
			
			b=a%10;
			c=(b*b*b)+c;
			a=a/10;	
			
		}
		
		if(t==c) {
			
			System.out.println("AS");
		}
		
		else {
			System.out.println("NAS");
		}
		
		
		
		
		
		
		
	}

}
