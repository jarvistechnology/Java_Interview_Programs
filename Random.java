package ipt.programs;

public class Random {
	
	static int random[]=new int[5];
	public static int[] ranNum() {
		
		
		for (int i = 0; i < random.length; i++) {
			
			int n1=0;
			int n2=100;
			
			random[i] =(int) ((Math.random()*(n2-n1))+n1);
			
			System.out.println(random[i]);
		}
		
		return random;
	}
	
	public static void main(String[] args) {
		
		int[] a = ranNum();
		
		int max=a[0];
		
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i]>max) {
				max=a[i];
			}
			
		}
		System.out.println();
		System.out.println(max);
		
	}
	

}
