package com.capgemini.caua.teste.exercicio01;

import java.util.Scanner;

/**
 * Get the user input.
 * 
 * @author Caua de M. Scarabelotti.
 *
 */

public class PromptUser {

	/**
	 * Get the number of steps from the user.
	 * 
	 * @param scanner
	 * @return
	 */

	public static int getStepsNumber(Scanner scanner) {
		System.out.print("Number of steps: ");
		int stepsNumber = scanner.nextInt();
		scanner.close();
		return stepsNumber;
	}

}
