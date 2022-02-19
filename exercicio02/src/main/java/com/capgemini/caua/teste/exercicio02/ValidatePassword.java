package com.capgemini.caua.teste.exercicio02;

import java.util.Scanner;

public class ValidatePassword {
	
	
	public static void getValidPassword() {
		boolean passwordIsInvalid = true;
		Scanner scanner = new Scanner(System.in);
		
		while (passwordIsInvalid) {
			String userPassword = PromptUserPassword.getUserPassword(scanner);

			String messageInvalid = "";

			messageInvalid = passwordLengthCheck(userPassword, messageInvalid);

			messageInvalid = passwordDigitCheck(userPassword, messageInvalid);

			messageInvalid = passwordLowerCharCheck(userPassword, messageInvalid);

			messageInvalid = passwordUpperCharCheck(userPassword, messageInvalid);

			messageInvalid = passwordSpecialCharCheck(userPassword, messageInvalid);

			if (!messageInvalid.isEmpty()) {
				messageInvalid = messageInvalid.concat(".");
				System.out.println(messageInvalid);
				continue;
			}
			System.out.println("Your password is valid!");
			passwordIsInvalid = false;
		}
		scanner.close();
	}
	
	
	/**
	 * Check if the password attends at the length requisit.
	 * 
	 * @param userPassword
	 * @param messageInvalid
	 * @return
	 */
	
	private static String passwordLengthCheck(String userPassword, String messageInvalid) {
		boolean passwordIsGreaterThanSix = userPassword.length() < 6;
		if (passwordIsGreaterThanSix) {
			int charactersLeft = 6 - userPassword.length();
			messageInvalid = messageInvalid.concat("Your password needs " + charactersLeft + " more characters");
		}
		return messageInvalid;
	}
	
	/**
	 * Check if the password contains at least "one digit".
	 * 
	 * @param userPassword
	 * @param messageInvalid
	 * @return
	 */

	private static String passwordDigitCheck(String userPassword, String messageInvalid) {
		boolean passwordHasDigit = userPassword.chars().anyMatch(Character::isDigit);
		if (!passwordHasDigit) {
			messageInvalid = addInvalidConditionMessage(messageInvalid, "number", "a number");
		}
		return messageInvalid;
	}

	/**
	 * Check if the password contains at least one "lower case character".
	 * 
	 * @param userPassword
	 * @param messageInvalid
	 * @return
	 */
	
	private static String passwordLowerCharCheck(String userPassword, String messageInvalid) {
		boolean passwordHasLowerCase = userPassword.chars().anyMatch(Character::isLowerCase);
		if (!passwordHasLowerCase) {
			messageInvalid = addInvalidConditionMessage(messageInvalid, "lower case letter", "a lower case letter");
		}
		return messageInvalid;
	}

	/**
	 * Check if the password contains at least one "upper case character".
	 * 
	 * @param userPassword
	 * @param messageInvalid
	 * @return
	 */
	
	private static String passwordUpperCharCheck(String userPassword, String messageInvalid) {
		boolean passwordHasUpperCase = userPassword.chars().anyMatch(Character::isUpperCase);
		if (!passwordHasUpperCase) {
			messageInvalid = addInvalidConditionMessage(messageInvalid, "upper case letter", "an upper case letter");
		}
		return messageInvalid;
	}
	
	/**
	 * Check if the password contains at least one "special character". 
	 * 
	 * @param userPassword
	 * @param messageInvalid
	 * @return
	 */

	private static String passwordSpecialCharCheck(String userPassword, String messageInvalid) {
		boolean passwordHasSpecialChar = userPassword.chars()
				.anyMatch(ch -> !(Character.isLetter(ch) || Character.isDigit((ch))));
		if (!passwordHasSpecialChar) {
			messageInvalid = addInvalidConditionMessage(messageInvalid, "special character", "a special character");
		}
		return messageInvalid;
	}
	
	/**
	 * Return a message that helps the user to create a stronger password.
	 * 
	 * @param messageInvalid
	 * @param startMessage
	 * @param continueMessage
	 * @return
	 */

	private static String addInvalidConditionMessage(String messageInvalid, String startMessage,
			String continueMessage) {
		if (messageInvalid.isEmpty()) {
			messageInvalid = messageInvalid.concat("Your password needs at least one " + startMessage);
		} else {
			messageInvalid = messageInvalid.concat(", at least one of them needs to be " + continueMessage);
		}
		return messageInvalid;
	}

}
