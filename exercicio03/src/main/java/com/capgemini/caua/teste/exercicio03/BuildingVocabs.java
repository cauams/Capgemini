package com.capgemini.caua.teste.exercicio03;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Build the vocabs that will be analyzed.
 * 
 * @author Caua de M. Scarabelotti.
 *
 */

public class BuildingVocabs {
	
	/**
	 * Build {@link Map} of different words.
	 * 
	 * @param s
	 * @return
	 */
	
	static HashMap<String, Integer> findAnagrams(String s) {
		HashMap<String, Integer> anagramasCount = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				char[] valC = s.substring(i, j + 1).toCharArray();
				Arrays.sort(valC);
				String val = new String(valC);
				if (anagramasCount.containsKey(val))
					anagramasCount.put(val, anagramasCount.get(val) + 1);
				else
					anagramasCount.put(val, 1);
			}
		}
		return anagramasCount;
	}

}
