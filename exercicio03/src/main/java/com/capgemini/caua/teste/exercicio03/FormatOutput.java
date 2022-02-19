package com.capgemini.caua.teste.exercicio03;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Format the output to the user.
 * 
 * @author Caua de M. Scarabelotti.
 *
 */

public class FormatOutput {
	
	/**
	 * Format the outputs.
	 * 
	 * @param word
	 */
	
	static void formatAnagramsOutput(String word) {		
		HashMap<String, Integer> vocab = BuildingVocabs.findAnagrams(word);
		ArrayList<String> anagr = CheckAnagrams.checkAnagrams(vocab);
		System.out.printf("Word: %s \n", word); 
		System.out.printf("Number of anagram's: %s \n" , anagr.size());
	}
}
