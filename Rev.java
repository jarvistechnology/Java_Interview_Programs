package prabu.javaprograms;

public class Rev {
	
	private static void usingInBuilt() {

		StringBuffer s = new StringBuffer(" Hello java");
		System.out.println("Before Reverse " + s);
		StringBuffer r = s.reverse();
		System.out.println("After Reverse " + r);

	}

	private static void withoutInBuilt() {
		String s = " Hello java";
		System.out.println("Before Reverse "+s);
		System.out.print("After Reverse ");
		for (int i = s.length()-1; i >= 0; i--) {
			
			System.out.print(s.charAt(i));

		}
	}

	public static void main(String[] args) {
		usingInBuilt();
		withoutInBuilt();
	}

}
