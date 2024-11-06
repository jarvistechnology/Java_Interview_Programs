package prabu.javaprograms;

public class Random_Maximum {

	static int[] randomNumber = new int[5];

	public static int[] randomNum() {

		int max = 100;
		int min = 0;
		System.out.println("Number List:");
		for (int i = 0; i < randomNumber.length; i++) {

			randomNumber[i] = ((int) (Math.random() * (max - min))) + min;

			System.out.print(randomNumber[i] + ",");

		}
		return randomNumber;

	}

	public static void main(String[] args) {
		
		int[] a = randomNum();
		
		//int a[] ={6,7,98,99,56};

		int large = a[0];
		// Loop through the array
		for (int i = 0; i < a.length; i++) {
			
			// Compare elements of array with min
			if (a[i] > large) {
				large = a[i];
			}
		}
		System.out.println();
		System.out.println("Maximum value in sequence: " + large);
	}

}
