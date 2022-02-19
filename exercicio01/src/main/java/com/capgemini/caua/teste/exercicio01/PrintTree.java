package com.capgemini.caua.teste.exercicio01;

public class PrintTree {
	
	public static void printSteps(int stepsNumber) {
		for (int line = 0; line < stepsNumber; line++) {
			printSpaces(stepsNumber, line);
			printAsterisk(line);
			System.out.print("\n");
		}
	}
	
	private static void printSpaces(int stepsNumber, int line) {
		for (int j = stepsNumber - 1; j > line; j--) {
			System.out.print(" ");
		}
	}

	private static void printAsterisk(int line) {
		for (int k = 0; k <= line; k++) {
			System.out.print("*");
		}
	}
}
