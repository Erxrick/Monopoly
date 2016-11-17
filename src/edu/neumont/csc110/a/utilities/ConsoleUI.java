package edu.neumont.csc110.a.utilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ConsoleUI {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * Generates a console-based menu using the Strings in options as the menu
	 * items. Reserves the number 0 for the "quit" option when withQuit is true.
	 * 
	 * @param options
	 *            - Strings representing the menu options
	 * @param withQuit
	 *            - adds option 0 for "quit" when true
	 * @return the int of the selection made by the user
	 * @throws IOException
	 */
	public static int promptForMenuSelection(String[] options, boolean withQuit) throws IOException {
		boolean responseRequired = true;
		int userInput = -1;
		int maxInput = options.length;
		int minInput = 0;
		boolean nestedLooper = false;
		do {
			if (withQuit == true) {
				System.out.println("0) Quit");
			}
			for (int i = 0; i < options.length; i++) {
				System.out.println((i + 1) + ") " + options[i]);
			}
			do {
				try {
					userInput = Integer.parseInt(in.readLine());
					nestedLooper = true;
				} catch (NumberFormatException myException) {
					System.out.println("That is not a valid input.");
				}
			} while (nestedLooper == false);

			if (withQuit == true) {
				if (userInput <= maxInput && userInput >= minInput) {
					responseRequired = false;
				}
			} else if (withQuit == false) {
				if (userInput <= maxInput && userInput >= (minInput + 1)) {
					responseRequired = false;
				}
			}

		} while (responseRequired == true);

		return userInput;
	}

	public static int promptForMenuSelectionWithArrayList(ArrayList<String> options, boolean withQuit) throws IOException {
		boolean responseRequired = true;
		int userInput = -1;
		int maxInput = options.size();
		int minInput = 0;
		boolean nestedLooper = false;
		do {
			if (withQuit == true) {
				System.out.println("0) Quit");
			}
			for (int i = 0; i < options.size(); i++) {
				System.out.println((i + 1) + ") " + options.get(i));
			}
			do {
				try {
					userInput = Integer.parseInt(in.readLine());
					nestedLooper = true;
				} catch (NumberFormatException myException) {
					System.out.println("That is not a valid input.");
				}
			} while (nestedLooper == false);

			if (withQuit == true) {
				if (userInput <= maxInput && userInput >= minInput) {
					responseRequired = false;
				}
			} else if (withQuit == false) {
				if (userInput <= maxInput && userInput >= (minInput + 1)) {
					responseRequired = false;
				}
			}

		} while (responseRequired == true);

		return userInput;
	}

	/**
	 * Generates a prompt that expects the user to enter one of two responses
	 * that will equate to a boolean value. The trueString represents the case
	 * insensitive response that will equate to true. The falseString acts
	 * similarly, but for a false boolean value. Example: Assume this method is
	 * called with a trueString argument of "yes" and a falseString argument of
	 * "no". If the enters "YES", the method returns true. If the user enters
	 * "no", the method returns false. All other inputs are considered invalid,
	 * the user will be informed, and the prompt will repeat.
	 * 
	 * @param prompt
	 *            - the prompt to be displayed to the user
	 * @param trueString
	 *            - the case insensitive value that will evaluate to true
	 * @param falseString
	 *            - the case insensitive value that will evaluate to false
	 * @return the boolean value
	 * @throws IOException
	 */
	public static boolean promptForBool(String prompt, String trueString, String falseString) throws IOException {
		if (prompt == null) {
			IllegalArgumentException myException = new IllegalArgumentException("I don't like null in the prompt");
			throw myException;
		}
		boolean userAnswer = false;
		boolean responseRequired = false;
		while (responseRequired == false) {
			System.out.println(prompt);
			String userResponse = in.readLine();
			if (userResponse.equalsIgnoreCase(trueString)) {
				userAnswer = true;
				responseRequired = true;
			} else if (userResponse.equalsIgnoreCase(falseString)) {
				userAnswer = false;
				responseRequired = true;
			}
		}
		return userAnswer;
	}

	/**
	 * Generates a prompt that expects a numeric input representing a byte
	 * value. This method loops until valid input is given.
	 * 
	 * @param prompt
	 *            - the prompt to be displayed to the user
	 * @param min
	 *            - the inclusive minimum boundary
	 * @param max
	 *            - the inclusive maximum boundary
	 * @return the byte value
	 * @throws IOException
	 */
	public static byte promptForByte(String prompt, byte min, byte max) throws IOException, NumberFormatException {
		if (prompt == null) {
			IllegalArgumentException myException = new IllegalArgumentException("I don't like null in the prompt");
			throw myException;
		}
		byte userAnswer = 0;
		boolean responseRequired = false;
		boolean nestedLooper = false;
		while (responseRequired == false) {
			System.out.println(prompt);
			do {
				String userResponse = in.readLine();
				try {
					userAnswer = Byte.parseByte(userResponse);
					nestedLooper = true;
				} catch (NumberFormatException myException) {
					System.out.println("That is not a valid input.");
				}
			} while (nestedLooper == false);
			if (userAnswer >= min && userAnswer <= max) {
				responseRequired = true;
			}
		}
		return userAnswer;
	}

	/**
	 * Generates a prompt that expects a numeric input representing a short
	 * value. This method loops until valid input is given.
	 * 
	 * @param prompt
	 *            - the prompt to be displayed to the user
	 * @param min
	 *            - the inclusive minimum boundary
	 * @param max
	 *            - the inclusive maximum boundary
	 * @return the short value
	 */
	public static short promptForShort(String prompt, short min, short max) throws IOException {
		if (prompt == null) {
			IllegalArgumentException myException = new IllegalArgumentException("I don't like null in the prompt");
			throw myException;
		}
		short userAnswer = 0;
		boolean responseRequired = false;
		boolean nestedLooper = false;
		while (responseRequired == false) {
			System.out.println(prompt);

			do {
				String userResponse = in.readLine();
				try {
					userAnswer = Short.parseShort(userResponse);
					nestedLooper = true;
				} catch (NumberFormatException myException) {
					System.out.println("That is not a valid input.");
				}
			} while (nestedLooper == false);
			if (userAnswer >= min && userAnswer <= max) {
				responseRequired = true;
			}
		}
		return userAnswer;
	}

	/**
	 * Generates a prompt that expects a numeric input representing an int
	 * value. This method loops until valid input is given.
	 * 
	 * @param prompt
	 *            - the prompt to be displayed to the user
	 * @param min
	 *            - the inclusive minimum boundary
	 * @param max
	 *            - the inclusive maximum boundary
	 * @return the int value
	 * @throws IOException
	 */
	public static int promptForInt(String prompt, int min, int max) throws IOException {
		if (prompt == null) {
			IllegalArgumentException myException = new IllegalArgumentException("I don't like null in the prompt");
			throw myException;
		}
		int userAnswer = 0;
		boolean responseRequired = false;
		boolean nestedLooper = false;
		while (responseRequired == false) {
			System.out.println(prompt);
			do {
				String userResponse = in.readLine();
				try {
					userAnswer = Integer.parseInt(userResponse);
					nestedLooper = true;
				} catch (NumberFormatException myException) {
					System.out.println("That is not a valid input.");
				}
			} while (nestedLooper == false);
			if (userAnswer >= min && userAnswer <= max) {
				responseRequired = true;
			}
		}
		return userAnswer;
	}

	/**
	 * Generates a prompt that expects a numeric input representing a long
	 * value. This method loops until valid input is given.
	 * 
	 * @param prompt
	 *            - the prompt to be displayed to the user
	 * @param min
	 *            - the inclusive minimum boundary
	 * @param max
	 *            - the inclusive maximum boundary
	 * @return the long value
	 * @throws IOException
	 */
	public static long promptForLong(String prompt, long min, long max) throws IOException {
		if (prompt == null) {
			IllegalArgumentException myException = new IllegalArgumentException("I don't like null in the prompt");
			throw myException;
		}
		long userAnswer = 0;
		boolean responseRequired = false;
		boolean nestedLooper = false;
		while (responseRequired == false) {
			System.out.println(prompt);

			do {
				String userResponse = in.readLine();
				try {
					userAnswer = Long.parseLong(userResponse);
					nestedLooper = true;
				} catch (NumberFormatException myException) {
					System.out.println("That is not a valid input.");
				}
			} while (nestedLooper == false);
			if (userAnswer >= min && userAnswer <= max) {
				responseRequired = true;
			}
		}
		return userAnswer;
	}

	/**
	 * Generates a prompt that expects a numeric input representing a float
	 * value. This method loops until valid input is given.
	 * 
	 * @param prompt
	 *            - the prompt to be displayed to the user
	 * @param min
	 *            - the inclusive minimum boundary
	 * @param max
	 *            - the inclusive maximum boundary
	 * @return the float value
	 * @throws IOException
	 */
	public static float promptForFloat(String prompt, float min, float max) throws IOException {
		if (prompt == null) {
			IllegalArgumentException myException = new IllegalArgumentException("I don't like null in the prompt");
			throw myException;
		}
		float userAnswer = 0;
		boolean responseRequired = false;
		boolean nestedLooper = false;
		while (responseRequired == false) {
			System.out.println(prompt);

			do {
				String userResponse = in.readLine();
				try {
					userAnswer = Float.parseFloat(userResponse);
					nestedLooper = true;
				} catch (NumberFormatException myException) {
					System.out.println("That is not a valid input.");
				}
			} while (nestedLooper == false);
			if (userAnswer >= min && userAnswer <= max) {
				responseRequired = true;
			}
		}
		return userAnswer;
	}

	/**
	 * Generates a prompt that expects a numeric input representing a double
	 * value. This method loops until valid input is given.
	 * 
	 * @param prompt
	 *            - the prompt to be displayed to the user
	 * @param min
	 *            - the inclusive minimum boundary
	 * @param max
	 *            - the inclusive maximum boundary
	 * @return the double value
	 * @throws IOException
	 */
	public static double promptForDouble(String prompt, double min, double max) throws IOException {
		if (prompt == null) {
			IllegalArgumentException myException = new IllegalArgumentException("I don't like null in the prompt");
			throw myException;
		}
		double userAnswer = 0;
		boolean responseRequired = false;
		boolean nestedLooper = false;
		while (responseRequired == false) {
			System.out.println(prompt);
			do {
				String userResponse = in.readLine();
				try {
					userAnswer = Double.parseDouble(userResponse);
					nestedLooper = true;
				} catch (NumberFormatException myException) {
					System.out.println("That is not a valid input.");
				}
			} while (nestedLooper == false);
			if (userAnswer >= min && userAnswer <= max) {
				responseRequired = true;
			}
		}
		return userAnswer;
	}

	/**
	 * Generates a prompt that allows the user to enter any response and returns
	 * the String. When allowEmpty is true, empty responses are valid. When
	 * false, responses must contain at least one character (including
	 * whitespace).
	 * 
	 * @param prompt
	 *            - the prompt to be displayed to the user.
	 * @param allowEmpty
	 *            - when true, makes empty responses valid
	 * @return the input from the user as a String
	 * @throws IOException
	 */
	public static String promptForInput(String prompt, boolean allowEmpty) throws IOException {
		if (prompt == null) {
			IllegalArgumentException myException = new IllegalArgumentException("I don't like null in the prompt");
			throw myException;
		}
		boolean responseRequired = false;
		String userAnswer = null;
		while (responseRequired == false) {
			System.out.println(prompt);
			userAnswer = in.readLine();
			if (userAnswer.isEmpty() && allowEmpty == true || userAnswer.isEmpty() == false && allowEmpty == true) {
				responseRequired = true;
			} else if (userAnswer.isEmpty() == false && allowEmpty == false) {
				responseRequired = true;
			}
		}
		return userAnswer;
	}

	/**
	 * Generates a prompt that expects a single character input representing a
	 * char value. This method loops until valid input is given.
	 * 
	 * @param prompt
	 *            - the prompt to be displayed to the user
	 * @param min
	 *            - the inclusive minimum boundary
	 * @param max
	 *            - the inclusive maximum boundary
	 * @return the char value
	 * @throws IOException
	 */
	public static char promptForChar(String prompt, char min, char max) throws IOException {
		if (prompt == null) {
			IllegalArgumentException myException = new IllegalArgumentException("I don't like null in the prompt");
			throw myException;
		}
		char userAnswer = 0;
		boolean responseRequired = false;
		boolean nestedLooper = false;
		while (responseRequired == false) {
			System.out.println(prompt);
			do {
				try {
					userAnswer = in.readLine().toCharArray()[0];
					nestedLooper = true;
				} catch (Exception myException) {
					System.out.println("That is not a valid input.");
				}
			} while (nestedLooper == false);

			if (userAnswer >= min && userAnswer <= max) {
				responseRequired = true;
			}
		}
		return userAnswer;
	}
}
