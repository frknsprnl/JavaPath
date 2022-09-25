import java.util.Scanner;
public class Taximeter {
    public static void main(String[] args) {

        int km;
        double perKm = 2.20, sum;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in km: ");
        km = input.nextInt();

        sum = 10 + perKm*km;
        if (sum < 20) sum = 20;
        System.out.print("Total: " + sum);

    }
}
