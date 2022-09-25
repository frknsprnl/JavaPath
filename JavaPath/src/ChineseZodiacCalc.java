import java.util.Scanner;
public class ChineseZodiacCalc {
    public static void main(String[] args) {

        int year;
        Scanner input = new Scanner(System.in);

        System.out.print("Year: ");
        year = input.nextInt();

        if (year % 12 == 0) System.out.println("Monkey");
        if (year % 12 == 1) System.out.println("Rooster");
        if (year % 12 == 2) System.out.println("Dog");
        if (year % 12 == 3) System.out.println("Pig");
        if (year % 12 == 4) System.out.println("Rat");
        if (year % 12 == 5) System.out.println("Ox");
        if (year % 12 == 6) System.out.println("Tiger");
        if (year % 12 == 7) System.out.println("Rabbit");
        if (year % 12 == 8) System.out.println("Dragon");
        if (year % 12 == 9) System.out.println("Snake");
        if (year % 12 == 10) System.out.println("Horse");
        if (year % 12 == 11) System.out.println("Sheep");


    }
}
