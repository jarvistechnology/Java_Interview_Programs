package prabu.javaprograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repetative {

	// betty bought butter but butter was bitter so betty bought butter to make
	// bitter butter better

	// betty = 2

	// bought = 2

	// butter = 4

	// bitter = 2

	public static void tongueTwister() {

		// String s="Paragraphs are medium-sized units of writing, longer than
		// sentences, but shorter than sections, chapters, or entire works. Because they
		// connect the “small” ideas of individual sentences to a “bigger” idea,
		// paragraph structure is essential to any writing for organization, flow, and
		// comprehension. ";
		String s = "betty bought butter but butter was bitter so betty bought butter to make bitter butter better";

		Map<String, Integer> m = new LinkedHashMap<>();

		String[] allWords = s.split(" ");

		for (String word : allWords) {

			// System.out.println(word);

			if (m.containsKey(word)) {

				Integer count = m.get(word);

				m.put(word, count + 1);

			}

			else {

				m.put(word, 1);
			}

		}

		// System.out.println(m);

		Set<Entry<String, Integer>> wordandCount = m.entrySet();

		for (Entry<String, Integer> rep : wordandCount) {

			if (rep.getValue() > 1) {

				System.out.println(rep);

			}

		}

	}

	public static void main(String[] args) {

		tongueTwister();

	}

}
