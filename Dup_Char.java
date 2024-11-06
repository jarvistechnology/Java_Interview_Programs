package prabu.javaprograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Dup_Char {
	
	private static void subMethodUsingMap() {

		Map<Character, Integer> m = new LinkedHashMap<>();
		String s = "welcome";

		char[] ch = s.toCharArray();// convert the String into Character

		for (char c : ch) {
			if (m.containsKey(c)) {
				m.put(c, m.get(c) + 1);
			} else {
				m.put(c, 1);
			}
		}
		System.out.println(m);
		
		Set<Entry<Character, Integer>> e = m.entrySet(); // to iterate the values one by one

		for (Entry<Character, Integer> et : e) {
			if (et.getValue()>1) {
				System.out.println(et);
			}
			
		}

	}

	public static void main(String[] args) {
		subMethodUsingMap();
	}

}
