package com.capgemini.caua.teste.exercicio02;

import java.util.Scanner;

public class PromptUserPassword {	
	public static String getUserPassword(Scanner scanner) {
		System.out.print("Create a password: ");
		String password = scanner.nextLine();
		return password;
	}
}
