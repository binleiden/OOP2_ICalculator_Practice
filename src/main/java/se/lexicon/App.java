package se.lexicon;

import se.lexicon.Model.BasicCalculator;
import se.lexicon.Model.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        BasicCalculator calculator = new BasicCalculator();

        double num1 = Scanner.getUserInput();
        double num2 = Scanner.getUserInput();

        // Perform calculations
        double sum = calculator.add(num1, num2);
        double difference = calculator.subtract(num1, num2);
        double product = calculator.multiply(num1, num2);
        double quotient = calculator.divide(num1, num2);

        // Output the results
        System.out.println("Addition result = " + sum);
        System.out.println("Subtraction result = " + difference);
        System.out.println("Multiplication result = " + product);
        System.out.println("Divided result = " + quotient);
    }
}
