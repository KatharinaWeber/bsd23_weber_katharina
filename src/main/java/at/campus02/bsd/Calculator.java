package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The Calculator class provides methods for basic arithmetic operations such as addition,
 * subtraction, multiplication, division, and calculation of factorial
 */
public class Calculator {
    /**
     * Logger for this class.
     */
    private static Logger logger = LogManager.getLogger();

    /**
     * Default constructor for the Calculator class
     */
    public Calculator() {
    }

    /**
     * Adds two numbers.
     *
     * @param number1 the first summand
     * @param number2 the second summand
     * @return the sum of number1 and number2
     */
    public static double add(double number1, double number2) {
        logger.debug(number1 + " " + number2);
        return number1 + number2;
    }

    /**
     * Subtracts the second number from the first number
     *
     * @param number1 the minuend
     * @param number2 the subtrahend
     * @return the result of number1 minus number2
     */
    public static double minus(double number1, double number2) {
        logger.debug(number1 + " " + number2);
        return number1 - number2;
    }

    /**
     * Multiplies two numbers
     *
     * @param number1 the first factor
     * @param number2 the second factor
     * @return the product of number1 and number2
     */
    public static double multiply(double number1, double number2) {
        logger.debug(number1 + " " + number2);
        return number1 * number2;
    }

    /**
     * Divides the first number by the second number
     * Throws an ArithmeticException if the divisor is zero
     *
     * @param number1 the dividend
     * @param number2 the divisor
     * @return the result of number1 divided by number2
     * @throws ArithmeticException if number2 is zero
     */
    public static double divide(double number1, double number2) {
        logger.debug(number1 + " " + number2);
        if (number2 == 0) {
            logger.error("Nummer 2 darf nicht 0 sein!!");
            throw new ArithmeticException();
        } else {
            return number1 / number2;
        }
    }

    /**
     * Calculates the factorial of a given number
     * If the number is negative, returns 0
     *
     * @param param the number to calculate the factorial for
     * @return the factorial of param, or 0 if param is negative
     */
    public static int factorial(int param) {
        int result = 1;
        if (param < 0) {
            result = 0;
        } else {
            for (int i = 1; i <= param; i++) {
                result *= i;
            }
        }
        return result;
    }
}
