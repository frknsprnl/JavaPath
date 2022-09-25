import java.util.Scanner;

public class AdvancedCalculator {

    static void plus() {
        Scanner input = new Scanner(System.in);
        int number, result = 0, i = 1;
        System.out.println("How many numbers will you enter? ");
        int counter = input.nextInt();
        while (i <= counter) {
            System.out.print("Number " + i++ + ": ");
            number = input.nextInt();
            result += number;
        }
        System.out.println("Result: " + result);
    }

    static void minus() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers will you enter? ");
        int counter = input.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print("Number " + i + ": ");
            number = input.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Result: " + result);
    }

    static void times() {
        Scanner input = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print("Number " + i++ + ": ");
            number = input.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Result : " + result);
    }

    static void divided() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers will you enter? ");
        int counter = input.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print("Number " + i + ": ");
            number = input.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("You can't divide to zero any number.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Result: " + result);
    }

    static void power() {
        Scanner input = new Scanner(System.in);
        System.out.print("Base: ");
        int base = input.nextInt();
        System.out.print("Exp: ");
        int exponent = input.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result: " + result);
    }

    static void factorial() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Result: " + result);
    }

    static void mod() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        System.out.print("Mod: ");
        int b = input.nextInt();
        int result = a % b;
        System.out.println("Result: " + result);

    }

    static void rectangle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter long side of rectangle: ");
        int longSide = input.nextInt();
        System.out.print("Enter short side of rectangle: ");
        int shortSide = input.nextInt();
        System.out.println("Area: " + (longSide * shortSide));
        System.out.println("Perimeter: " + (longSide + shortSide) * 2);
    }

    public static void main(String[] args) {

        int select;
        Scanner input = new Scanner(System.in);

        String menu =
                "1- Addition\n"
                        + "2- Subtraction\n"
                        + "3- Multiplication\n"
                        + "4- Division\n"
                        + "5- Exponential Number\n"
                        + "6- Factorial\n"
                        + "7- Mod\n"
                        + "8- Rectangle Area and Perimeter\n"
                        + "0- OFF";

        do {
            System.out.println(menu);
            System.out.print("Please select an action: ");
            select = input.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Wrong input. Try again.");
            }
        } while (select != 0);

    }
}

