package interview.level1programs;

public class Random_Number_Min_Max {

	public static int[] numbers(int count) {

		System.out.println("Number List:");

		int randomNumber[] = new int[count];

		for (int i = 0; i < randomNumber.length; i++) {

			randomNumber[i] = (int) (Math.random() * 100);

			System.out.println(randomNumber[i]);

		}

		return randomNumber;
	}

	public static void min_max(int n) {

		int[] numbers = numbers(n);

		int min = numbers[0];
		
		int max = numbers[0];

		for (int i = 0; i < numbers.length; i++) {

			if (min > numbers[i]) {

				min = numbers[i];

			}
			
			if (max < numbers[i]) {

				max = numbers[i];
			}

		}

		System.out.println("Minimum Number in the List: " + min);
		System.out.println("Maximum Number in the List: " + max);
	}
	
	
	public static void main(String[] args) {
		
		min_max(10);
		
		
	}

}
