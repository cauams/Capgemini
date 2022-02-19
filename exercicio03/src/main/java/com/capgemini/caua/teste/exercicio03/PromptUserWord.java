package com.capgemini.caua.teste.exercicio03;

import java.util.Scanner;

public class PromptUserWord {
	
	/**
	 * Get the input word from the user.
	 * 
	 * @return
	 */
	public static String getUserWord() {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Write the word to know the number of it's anagram's: ");
	String userWord = scanner.nextLine();
	scanner.close();
	return userWord;
	}
}
