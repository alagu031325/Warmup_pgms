/**
 * Performs addition/sub/multiplication
 * and division
 */
package com.lambda.operations;

//imports
import java.util.Scanner;

/**
 * @author alagu
 *
 */
public class ArithmeticCalculationsInLamba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Define required variables
        char operator ;
        int number1, number2;
        int result = 0;

        //Lambda expression
        InnerArithmeticCalculations additionOperation = new InnerArithmeticCalculations(){
            @Override
            public int operations(int number1, int number2)
            {
                return number1+number2;
            }
        };

        //Get user input
        System.out.println("Choose an operation to be performed : + , - , * , / \n");
        Scanner scanText = new Scanner(System.in);
        operator = scanText.next().charAt(0);

        System.out.println("Enter first number");
        number1 = scanText.nextInt();

        System.out.println("Enter second number");
        number2 = scanText.nextInt();
        
        switch (operator) {
            case '+':
                result = additionOperation.operations(number1, number2);
                System.out.println("The sum of two numbers is "+ result);
                break;
        
            default:
                break;
        }


    }
	}


/**
 * Has exactly one abstract class 
 * Instances created with Lambda expressions
 */
@FunctionalInterface
interface InnerArithmeticCalculations {
    int operations(int number1 , int number2);
    
}
