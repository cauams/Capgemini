package com.capgemini.caua.teste.exercicio03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Exercicio_03 {

	public static void main(String[] args) {
		formatAnagramasOutput("ovo");
		formatAnagramasOutput("ifailuhkqq");
	}
	
	/**
	 * Formata saídas
	 * 
	 * @param word
	 */
	static void formatAnagramasOutput(String word) {
		HashMap<String, Integer> vocab = findAnagramas(word);
		ArrayList<String> anagr = checkAnagramas(vocab);
		System.out.println("==========================================");
		System.out.printf("PALAVRA: %s \n", word); 
		System.out.printf("O número de anagramas é %s \n" , anagr.size());
		System.out.printf("Os anagramas encontrados foram %s \n" , anagr);
	}
	
	/**
	 * Monta {@link Map} de vocabulos diferentes
	 * 
	 * @param s
	 * @return
	 */
	static HashMap<String, Integer> findAnagramas(String s){
        HashMap<String, Integer> anagramasCount = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            for (int j = i; j < s.length(); j++){
                char[] valC = s.substring( i, j + 1 ).toCharArray();
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
	
	/**
	 * Retorna apenas os anagramas
	 * 
	 * @param map
	 * @return
	 */
	static ArrayList<String> checkAnagramas(HashMap<String, Integer> map){
        ArrayList<String> result = new ArrayList<String>();
        for ( String key: map.keySet() ){
            int n = map.get(key);
            if (n > 1) {
            	result.add(key);
            }            
        }
        return result;
    }
	
}
