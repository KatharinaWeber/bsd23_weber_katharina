package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        logger.error("Start of the main method");
        double num1=1.5;
        double num2=2.5;

        System.out.println(Calculator.add(num1 ,num2));
        System.out.println(Calculator.minus(num1,num2));

        System.out.println(Calculator.multiply(num1 ,num2));
        System.out.println(Calculator.divide(num1 ,num2));

        System.out.println("Katharina Weber");
        logger.info("End of the main method");
    }
}