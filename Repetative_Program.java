package ipt.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repetative_Program {
	
	public static void main(String[] args) {
		
		
		//Given String
		String s="java greens java sql api java sql selenium selenium java pa pa pa ";
		Map<String,Integer> m=new HashMap<>();
		String[] words = s.split(" ");
		
		for (String word : words) {
			//System.out.println(word);
			if (m.containsKey(word)) {
				
				Integer value = m.get(word);
				m.put(word,value+1);
				
			}
			else {
				m.put(word,1);
			}
			
		}
		//System.out.println(m);
		
		
		Set<Entry<String, Integer>> eachSet = m.entrySet();
		
		for (Entry<String, Integer> entry : eachSet) {
			
			if (entry.getValue()>1) {
				
				System.out.println(entry);
				
			}
			
		}
		
		
		
	
	}

}
