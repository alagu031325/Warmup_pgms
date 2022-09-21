/**
 * Performs addition/sub/multiplication
 * and division
 */
package com.lambda;

//imports
import java.util.Scanner;
import java.util.function.ToIntBiFunction;

/**
 * @author alagu
 *
 */
public class ArithmeticCalculationsInLamba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Define required variables
		char operator;
		int number1, number2;
		int result = 0;
		char response = 'n';

		// Get user input
		do {
			System.out.println("Choose an operation to be performed : + , - , * , / \n");
			Scanner scannerInstance = new Scanner(System.in);
			operator = scannerInstance.next().charAt(0);

			System.out.println("Code is optimized for integer values");
			System.out.println("Enter first number");
			number1 = readValue(scannerInstance);

			System.out.println("Enter second number");
			number2 = readValue(scannerInstance);

			// Lambda expression
			switch (operator) {
			case '+':
				result = printArithmeticResults(number1, number2,
						(lamdaValue1, lamdaValue2) -> lamdaValue1 + lamdaValue2);
				System.out.println("The sum of two numbers is " + result);
				break;

			case '-':
				result = printArithmeticResults(number1, number2,
						(lamdaValue1, lamdaValue2) -> lamdaValue1 - lamdaValue2);
				System.out.println("The subtracted value is " + result);
				break;

			case '*':
				result = printArithmeticResults(number1, number2,
						(lamdaValue1, lamdaValue2) -> lamdaValue1 * lamdaValue2);
				System.out.println("The multiplied value is " + result);
				break;

			case '/':
				System.out.println("This is a safe divide");
				result = printArithmeticResults(number1, number2, (lamdaValue1, lamdaValue2) -> {
					try {
						return lamdaValue1 / lamdaValue2;
					} catch (ArithmeticException e) {
						System.out.println("Enter valid input");
						return 0;
					}
				});
				if (result != 0)
					System.out.println("The divided value is " + result);
				break;

			default:
				System.out.println("Enter a valid option");
				break;
			}
			System.out.println("Do you want to continue type y/n");
			response = scannerInstance.next().charAt(0);
		} while (response == 'y');
		System.out.println("Good bye");
	}

	private static int readValue(Scanner scannerInstance) {
		// TODO Auto-generated method stub
		int tempValue;
		try {
			tempValue = scannerInstance.nextInt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Enter a valid Integer value");
			return 0;
		}
		return tempValue;
	}

	private static int printArithmeticResults(int firstno, int secondno, ToIntBiFunction<Integer, Integer> arith) {
		return arith.applyAsInt(firstno, secondno);
	}
}
