package com.capgemini.caua.teste.exercicio02;

import java.util.Scanner;

/**
 * Get the user input.
 * 
 * @author Caua de M. Scarabelotti.
 *
 */

public class PromptUserPassword {	
	
	/**
	 * Get the password input from the user.
	 * 
	 * @param scanner
	 * @return
	 */
	
	public static String getUserPassword(Scanner scanner) {
		System.out.print("Create a password: ");
		String password = scanner.nextLine();
		return password;
	}
}
