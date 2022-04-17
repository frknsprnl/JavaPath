import java.util.Scanner;
public class ReverseTriangle {
    public static void main(String[] args) {

        int row;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of lines: ");
        row = input.nextInt();

        for (int j = 1; j <= row ; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print(" ");
            }

            for (int i = 1; i <= 2 * (row - j) + 1 ; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
