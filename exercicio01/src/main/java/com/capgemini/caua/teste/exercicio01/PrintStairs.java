package com.capgemini.caua.teste.exercicio01;

public class PrintStairs {
	
	/**
	 * Prints the composition of the stair.
	 * 
	 * @param stepsNumber
	 */
	
	public static void printSteps(int stepsNumber) {
		for (int line = 0; line < stepsNumber; line++) {
			printSpaces(stepsNumber, line);
			printAsterisk(line);
			System.out.print("\n");
		}
	}
	
	/**
	 * Print the spaces in the stair.
	 * 
	 * @param stepsNumber
	 * @param line
	 */
	
	private static void printSpaces(int stepsNumber, int line) {
		for (int j = stepsNumber - 1; j > line; j--) {
			System.out.print(" ");
		}
	}
	
	/**
	 * Print the symbol that will form the steps.
	 * 
	 * @param line
	 */

	private static void printAsterisk(int line) {
		for (int k = 0; k <= line; k++) {
			System.out.print("*");
		}
	}
}
