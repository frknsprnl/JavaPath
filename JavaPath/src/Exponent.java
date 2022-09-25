import java.util.Scanner;
import java.math.*;
public class Exponent {
    public static void main(String[] args) {

        int x, n, result = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter base number: ");
        x = input.nextInt();

        System.out.print("Enter exponent: ");
        n = input.nextInt();

        for( int i = 1; i <= n ; i++){
            result *= x;
        }
        System.out.println(result);

    }
}
