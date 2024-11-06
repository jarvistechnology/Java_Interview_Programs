package prabu.javaprograms;

import java.util.Arrays;

public class Add_Element_Array {
	
	public static void main(String[] args) {
		
		
		int a[]= {1,2,3,4};
		
		
		int n=a.length;
		
		int a1[]=new int[n+1];
		
		int value=8;
		
		System.out.println(Arrays.toString(a));
		
		for (int i = 0; i <n; i++) {
			
			a1[i]=a[i];
			
		}
		
		a1[n]=value;
		for (int b : a1) {
			System.out.println(b);
		}
		
		}
		
	}

