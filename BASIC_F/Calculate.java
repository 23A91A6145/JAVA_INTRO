import java.util.Scanner;

public class Calculate{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;

        while (repeat) {
            printMenu();
            int option = getOption(scanner);
            repeat = processOption(option, scanner);
        }

        scanner.close();
    }

    public static void printMenu() {
        System.out.println("Simple Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
    }

    public static int getOption(Scanner scanner) {
        System.out.print("Choose an option: ");
        return scanner.nextInt();
    }

    public static boolean processOption(int option, Scanner scanner) {
        double num1 = getNumber(scanner, "Enter first number: ");
        double num2 = getNumber(scanner, "Enter second number: ");

        switch (option) {
            case 1:
                add(num1, num2);
                break;
            case 2:
                subtract(num1, num2);
                break;
            case 3:
                multiply(num1, num2);
                break;
            case 4:
                divide(num1, num2);
                break;
            case 5:
                System.out.println("Exiting...");
                return false;
            default:
                System.out.println("Invalid option");
        }
        return true;
    }

    public static double getNumber(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public static void add(double num1, double num2) {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }

    public static void subtract(double num1, double num2) {
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }

    public static void multiply(double num1, double num2) {
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    }

    public static void divide(double num1, double num2) {
        if (num2 != 0) {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        } else {
            System.out.println("Error: Division by zero");
        }
    }
}