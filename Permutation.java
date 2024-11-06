package interview.level1programs;

public class Permutation {

	public static String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		String word = String.valueOf(charArray);
		return word;
	}

	public static void permute(String str, int l, int r) {
		if (l == r)
			System.out.println(str);
		else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permute(str, l + 1, r);
				str = swap(str, l, i);
			}
		}
	}

	public static void main(String[] args) {
		String str = "ABC";

		int n = str.length();

		permute(str, 0, n - 1);
	}
}
