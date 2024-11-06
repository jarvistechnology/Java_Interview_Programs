package ipt.programs;

public class Repetative_Char {
	
	public static void main(String[] args) {
		
		
		String s="java programming";
		
		char[] c = s.toCharArray();
		
		System.out.println("The Given Word : "+s);
		
		System.out.println("Repetative Character: ");
		
		for (int i = 0; i < c.length; i++) {
			
			for (int j = i+1; j < c.length; j++) {
				
				if (c[i]==c[j]) {
					
					System.out.print(c[j]+" ");
				}
				
			}
			
		}
	}

}
