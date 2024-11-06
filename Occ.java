package interview.arrayprograms;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Occ {

	public static void main(String[] args) {

		String str;
		int i, len;
		int counter[] = new int[256];
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please Enter a Word: ");
		// reading a string from the user
		str = scanner.nextLine();
		// finds the length of the string
		len = str.length();
		// loop through the string and count frequency of every character and store it
		// in counter array
		for (i = 0; i < len; i++) {
			// counter[(int) str.charAt(i)]++;

			char ch = str.charAt(i);

			int x = ch;

			counter[x]++;
		}
		// print Frequency of characters
		for (i = 0; i < 256; i++) {
			if (counter[i] != 0) {
				// prints frequency of characters
				Map<Character, Integer> m = new TreeMap<>();

				m.put((char) i, counter[i]);

				// (char) i + " --> " + counter[i]

				// System.out.println(m);

				Set<Entry<Character, Integer>> each = m.entrySet();
				System.out.println(each);	
				
			}

		}
	}
}
