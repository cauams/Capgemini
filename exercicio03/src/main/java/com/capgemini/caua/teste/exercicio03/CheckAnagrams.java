package com.capgemini.caua.teste.exercicio03;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Check if there is any existing anagram.
 * 
 * @author Caua de M. Scarabelotti
 *
 */

public class CheckAnagrams {
	
	/**
	 * Return just the words that repeat.
	 * 
	 * @param map
	 * @return
	 */
	
	static ArrayList<String> checkAnagrams(HashMap<String, Integer> map) {
		ArrayList<String> result = new ArrayList<String>();
		for (String key : map.keySet()) {
			int n = map.get(key);
			if (n > 1) {
				result.add(key);
			}
		}
		return result;
	}

}
