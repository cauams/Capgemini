package com.capgemini.caua.teste.exercicio01;

import java.util.Scanner;

public class PromptUser {

	/**
	 * 
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
