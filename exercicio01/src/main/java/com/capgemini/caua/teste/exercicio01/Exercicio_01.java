package com.capgemini.caua.teste.exercicio01;

import java.util.Scanner;

/**
 * Start the process to build the stair.
 * 
 * @author Caua de M. Scarabelotti
 *
 */

public class Exercicio_01 {
	
	/**
	 * Start process.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {				
		Scanner scanner = new Scanner(System.in);
		Integer stepsNumber = PromptUser.getStepsNumber(scanner);
		PrintStairs.printSteps(stepsNumber);
	}
}
