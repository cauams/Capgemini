package com.capgemini.caua.teste.exercicio01;

import java.util.Scanner;

/**
 * 
 * @author Cauã de M. Scarabelotti
 *
 */

public class Exercicio_01 {

	public static void main(String[] args) {				
		Scanner scanner = new Scanner(System.in);
		Integer stepsNumber = PromptUser.getStepsNumber(scanner);
		PrintTree.printSteps(stepsNumber);
	}
}
