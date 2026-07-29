 // Write a utility class to calc some arithmetic operations

public class Calculator {

    // Static methods
    public static double add(double number_1 , double number_2) {
        return (number_1 + number_2);
    }
    public static double subtraction(double number_1 , double number_2) {
        if(number_1 >= number_2){
            return (number_1 - number_2);
        }else {
            return (number_2 - number_1);
        }
    }
    public static double multiply(double number_1, double number_2) {
        return (number_1 * number_2);
    }
    public static double division(double number_1, double number_2) {
        return (number_1 / number_2);
    }
    public static double modlus(double number_1, double number_2) {
        return (number_1 % number_2);
    }

}