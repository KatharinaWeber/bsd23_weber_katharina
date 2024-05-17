package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static Logger logger = LogManager.getLogger();


    public Calculator() {
    }

    public static double add(double number1, double number2){
        logger.debug(number1 + " " + number2);
        return number1+number2;
    }

    public static double minus(double number1, double number2){
        logger.debug(number1 + " " + number2);
        return number1-number2;
    }

    public static double multiply(double number1, double number2){
        logger.debug(number1 + " " + number2);
        return number1*number2;
    }
    public static double divide(double number1, double number2){

        logger.debug(number1 + " " +number2);
        if(number2 == 0) {
            logger.error("Nummer 2 darf nicht 0 sein!!");
            throw new ArithmeticException();
        }
        else {
            return number1 / number2;
        }

    }

    public static int factorial(int param){
        int result=1;
        if(param<0){
            result = 0;
        }
        else {
            for (int i = 1; i <= param; i++) {
                result *= i;
            }
        }
        return result;
    }
}
