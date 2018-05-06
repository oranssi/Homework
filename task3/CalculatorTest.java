package task3;

import java.util.Scanner;

/**
 * Created by Viktor on 06.05.2018.
 */
public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner input = new Scanner(System.in);

        int a;
        int b;
        String mathActivity;

        System.out.println("Enter value for a.");
        a = input.nextInt();

        System.out.println("Select one of the mathematical activities(plus, minus, divide, multiply) in the for +,-,/,*");
        input.nextLine();
        mathActivity = input.nextLine();

        System.out.println("Enter value for b.");
        b = input.nextInt();

        switch (mathActivity.charAt(0)) {
            case '+':
                System.out.println("Result for adding is :" + calculator.adding(a, b));
                break;
            case '-':
                System.out.println("Result for subtraction is: " + calculator.subtract(a, b));
                break;
            case '*':
                System.out.println("Result for multiplication is: " + calculator.multiply(a, b));
                break;
            case '/':
                System.out.println("Result for dividing is: " + calculator.divide(a, b));
                break;


        }
    }
}
