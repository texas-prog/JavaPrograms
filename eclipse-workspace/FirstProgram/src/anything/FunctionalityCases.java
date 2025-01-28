package anything;
import java.util.Scanner;

public class FunctionalityCases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("a. Perform Arithmetic Operations");
            System.out.println("b. Check Even/Odd");
            System.out.println("c. Print Multiples");
            System.out.println("d. Calculate Factorial");
            System.out.println("e. Exit");
            System.out.print("Choose an option: ");

            char choice = scanner.next().charAt(0);
            switch (choice) {
                case 'a':
                    System.out.print("Enter the first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    double num2 = scanner.nextDouble();
                    System.out.print("Enter an operator (+, -, *, /): ");
                    char operator = scanner.next().charAt(0);

                    switch (operator) {
                        case '+':
                            System.out.println("Result: " + (num1 + num2));
                            break;
                        case '-':
                            System.out.println("Result: " + (num1 - num2));
                            break;
                        case '*':
                            System.out.println("Result: " + (num1 * num2));
                            break;
                        case '/':
                            if (num2 != 0) {
                                System.out.println("Result: " + (num1 / num2));
                            } else {
                                System.out.println("Error: Division by zero.");
                            }
                            break;
                        default:
                            System.out.println("Invalid operator.");
                    }
                    break;

                case 'b':
                    System.out.print("Enter a number: ");
                    int number = scanner.nextInt();
                    if (number % 2 == 0) {
                        System.out.println(number + " is Even.");
                    } else {
                        System.out.println(number + " is Odd.");
                    }
                    break;

                case 'c':
                    System.out.print("Enter a number: ");
                    int base = scanner.nextInt();
                    System.out.print("Enter the count of multiples to print: ");
                    int count = scanner.nextInt();
                    System.out.println("Multiples of " + base + ":");
                    for (int i = 1; i <= count; i++) {
                        System.out.print((base * i) + " ");
                    }
                    System.out.println();
                    break;

                case 'd':
                    System.out.print("Enter a number: ");
                    int factNum = scanner.nextInt();
                    if (factNum < 0) {
                        System.out.println("Factorial of a negative number is undefined.");
                    } else {
                        long factorial = 1;
                        for (int i = 1; i <= factNum; i++) {
                            factorial *= i;
                        }
                        System.out.println("Factorial of " + factNum + " is " + factorial);
                    }
                    break;

                case 'e':
                    System.out.println("Exiting the program. Goodbye!");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }

        scanner.close();
    }
}
