import java.util.Scanner;
public class GreenGrocery {
    public static void main(String[] args) {

        double pear = 2.14, apple = 3.67, tomato = 1.11, banana = 0.95, eggplant = 5.00;
        double pearKg, appleKg, tomatoKg, bananaKg, eggplantKg, total;
        Scanner input = new Scanner(System.in);

        System.out.print("Pear kg: ");
        pearKg = input.nextDouble();

        System.out.print("Apple kg: ");
        appleKg = input.nextDouble();

        System.out.print("Tomato kg: ");
        tomatoKg = input.nextDouble();

        System.out.print("Banana kg: ");
        bananaKg = input.nextDouble();

        System.out.print("Eggplant kg: ");
        eggplantKg = input.nextDouble();

        total = pear*pearKg + apple*appleKg + tomato*tomatoKg + banana*bananaKg + eggplant*eggplantKg;
        System.out.print("Total Price: " + total);

    }
}
