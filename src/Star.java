import java.util.Scanner;

public class Star {
    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of lines: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int j = 1; j <= n - 1; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print(" ");
            }

            for (int i = 1; i <= 2 * (n - j) - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
