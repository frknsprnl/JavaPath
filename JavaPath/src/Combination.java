import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {

        int n, r, result, factN = 1, factR= 1, factNR = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("C(n, r) - Combination");

        System.out.print("Enter n value: ");
        n = input.nextInt();

        System.out.print("Enter r value: ");
        r = input.nextInt();

        // factorial n
        for (int i = 1; i <= n; i++) {
            factN = factN * i;

        }

        // factorial r
        for (int i = 1; i <= r; i++) {
            factR = factR * i;

        }

        // factorial n-r
        for (int i = 1; i <= (n - r); i++) {
            factNR = factNR * i;

        }
        result = factN / (factR * factNR);
        System.out.println("Result: " + result);
    }
}
