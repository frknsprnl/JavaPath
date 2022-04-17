import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        int n1 = 0, n2 = 1, n3, count, i;
        Scanner input = new Scanner(System.in);

        System.out.print("Number of Fibonacci elements: ");
        count = input.nextInt();

        for (i = 2; i <= count; i++) {
            n3 = n1 + n2;
            System.out.println(n1 + " + " + n2 + " = " + n3 +"\n");
            n1=n2;
            n2=n3;
        }
    }
}
