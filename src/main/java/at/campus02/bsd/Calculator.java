package at.campus02.bsd;

public class Calculator {

    public Calculator() {
    }

    public static double add(double number1, double number2){
        return number1+number2;
    }

    public static double minus(double number1, double number2){
        return number1-number2;
    }

    public static double multiply(double number1, double number2){
        return number1*number2;
    }
    public static double divide(double number1, double number2){return number1 / number2;}

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
