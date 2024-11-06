package prabu;

public class Swap {

	public static void swapping() {

		int a = 10;

		int b = 20;

		System.out.println("Before Swap:");

		System.out.println("~~~~~~~~~~~~~");

		System.out.println("a value is :" + a);

		System.out.println("b value is :" + b);

		a = a + b;// 10+20=30

		b = a - b;// 30-20=10

		a = a - b;// 30-10=20

		System.out.println("After Swap:");

		System.out.println("~~~~~~~~~~~~~");

		System.out.println("a value is :" + a);

		System.out.println("b value is :" + b);

	}

	public static void swapping(int a, int b) {

		System.out.println("Before Swap:");

		System.out.println("~~~~~~~~~~~~~");

		System.out.println("a value is :" + a);

		System.out.println("b value is :" + b);

		a = a + b;

		b = a - b;

		a = a - b;
		
		System.out.println();

		System.out.println("After Swap:");

		System.out.println("~~~~~~~~~~~~~");

		System.out.println("a value is :" + a);

		System.out.println("b value is :" + b);

	}
	
	
	public static void swappping2(int a,int b) {
		
		int temp;
		
		
		System.out.println("Before Swap:");

		System.out.println("~~~~~~~~~~~~~");

		System.out.println("a value is :" + a);

		System.out.println("b value is :" + b);

		
	
		temp=b;//99
		
		b=a;//24
		
		a=temp;//99
		
		
		System.out.println();

		System.out.println("After Swap:");

		System.out.println("~~~~~~~~~~~~~");

		System.out.println("a value is :" + a);

		System.out.println("b value is :" + b);

		
		
	}

	public static void main(String[] args) {

//		swapping(26,78);
//		
//		swapping(3576587, 73930);
		
		swappping2(4623, 25370);

	}

}
