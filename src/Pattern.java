import java.util.Scanner;

public class Pattern {
    // This function is not recursive.
    static void function(int a) {

        int temp = a;

        while (a >= 0) {
            System.out.print(a + " ");
            a = a - 5;
            if (a < 0) {
                System.out.print(a + " ");
                break;
            } else if (a == 0) {
                System.out.print(a + " ");
                break;
            }

        }

        while (a < 0 || a != temp) {
            a = a + 5;
            System.out.print(a + " ");

            if (a == temp) {
                break;
            }
        }
    }

    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("N: ");
        n = input.nextInt();

        function(n);
    }
}
