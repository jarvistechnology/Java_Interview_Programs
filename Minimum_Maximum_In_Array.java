package interview.arrayprograms;

public class Minimum_Maximum_In_Array {

	public static int minnumber() {

		int num[] = { 23,5,34, 22, 11, 33, 22, 44, 223, 224, 556,10};

		int min = num[0];

		for (int i = 0; i < num.length; i++) {

			if (num[i] < min) {//23<23

				min = num[i];
			}
			
		}
		
		return min;
		
	}
	
	public static int maxnumber() {
		
		int num[] = { 23,5,34, 722, 11, 33, 22, 44, 223, 224, 556,10};

		int max = num[0];

		for (int i = 0; i < num.length; i++) {

			if (num[i] > max) {//23<23

				max = num[i];
			}
			
		}
		
		return max;
		
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(minnumber());
		System.out.println(maxnumber());
		
		
		
	}

}
