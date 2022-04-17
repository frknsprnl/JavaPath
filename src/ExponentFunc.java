import java.util.Scanner;

public class ExponentFunc {

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

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        power();

    }
}
