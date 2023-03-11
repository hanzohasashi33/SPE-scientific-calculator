import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        // Opening an input scanner
        Scanner scanner = new Scanner(System.in);

        // Creating a choice handler
        ChoiceHandler choiceHandler = new ChoiceHandler();

        do {
            System.out.println("Scientific Calculator integrated with Devops toolchain.");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Square root\n6. Factorial\n7. Natural logarithm\n8. Base 10 logarithm\n9. Power\n10. Exit");
            System.out.print("Choose Operation: ");
            int choice;
            try {
                choice = scanner.nextInt();
                choiceHandler.handleChoice(choice);
            } catch (InputMismatchException error) {
                return;
            } catch (ArithmeticException error) {
                System.out.println(error);
            }
        } while(true);

    }
}