package Day_6.home_task;

import java.util.Scanner;

public class calculator_do_while {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== Calculator =====");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {

                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();

                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();

                switch (choice) {

                    case 1:
                        System.out.println("Addition = " + (num1 + num2));
                        break;

                    case 2:
                        System.out.println("Subtraction = " + (num1 - num2));
                        break;

                    case 3:
                        System.out.println("Multiplication = " + (num1 * num2));
                        break;

                    case 4:
                        if (num2 != 0)
                            System.out.println("Division = " + (num1 / num2));
                        else
                            System.out.println("Cannot divide by zero.");
                        break;
                }

            } else if (choice == 5) {
                System.out.println("Thank You!");
            } else {
                System.out.println("Invalid Choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}