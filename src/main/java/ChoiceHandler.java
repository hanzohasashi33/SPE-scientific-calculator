import java.util.Scanner;

public class ChoiceHandler {

    public void handleChoice(int choice) {

        // Creating an operations handler
        Operations operations = new Operations();

        // Opening an input scanner
        Scanner scanner = new Scanner(System.in);

        if(choice == 1) {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            double result = operations.addition(num1, num2);
            System.out.println("Addition of " + num1 + ", " + num2 + " is: " + result);
        }

        else if(choice == 2) {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            double result = operations.subtraction(num1, num2);
            System.out.println("Subtraction of " + num1 + ", " + num2 + " is: " + result);
        }

        else if(choice == 3) {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            double result = operations.multiplication(num1, num2);
            System.out.println("Multiplication of " + num1 + ", " + num2 + " is: " + result);
        }

        else if(choice == 4) {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            double result = operations.division(num1, num2);
            System.out.println("Division of " + num1 + " by " + num2 + " is: " + result);
        }

        else if(choice == 5) {
            System.out.print("Enter the number: ");
            double num1 = scanner.nextDouble();
            double result = operations.squareRoot(num1);
            System.out.println("Square root of " + num1 + " is: " + result);
        }

        else if(choice == 6) {
            System.out.print("Enter the number: ");
            double num1 = scanner.nextDouble();
            double result = operations.factorial((int)num1);
            System.out.println("Factorial of " + num1 + " is: " + result);
        }

        else if(choice == 7) {
            System.out.print("Enter the number: ");
            double num1 = scanner.nextDouble();
            double result = operations.naturalLog(num1);
            System.out.println("Natural logarithm of " + num1 + " is: " + result);
        }

        else if(choice == 8) {
            System.out.print("Enter the number: ");
            double num1 = scanner.nextDouble();
            double result = operations.logBaseTen(num1);
            System.out.println("Logarithm base 10 of " + num1 + " is: " + result);
        }

        else if(choice == 9) {
            System.out.print("Enter the base: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the Power: ");
            double num2 = scanner.nextDouble();
            double result = operations.power(num1, num2);
            System.out.println("Power of " + num1 + " raised to " + num2 + " is: " + result);
        }

        else if(choice == 10) {
            System.exit(0);
        }

        else {
            System.out.println("Invalid choice. Enter a valid choice.");
        }
    }


}
