import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {

        int entryCount, min = Integer.MIN_VALUE, max = Integer.MAX_VALUE;
        Scanner input = new Scanner(System.in);

        System.out.println("How much number will you enter? ");
        entryCount = input.nextInt();

        for (int i = 1; i <= entryCount; i++) {
            System.out.print("Enter number " + i + ": ");
            int x = input.nextInt();

            if (x > min) {
                min = x;
            }
            if (x < max) {
                max = x;
            }
        }
        System.out.println("Min: " + max);
        System.out.println("Max: " + min);

    }
}
