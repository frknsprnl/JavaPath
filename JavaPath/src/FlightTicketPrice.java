import java.util.Scanner;
public class FlightTicketPrice {
    public static void main(String[] args) {

        int distance, age, ticketType;
        double rawPrice, ageDiscount, totalDiscount, roundTripDiscount, totalPrice;
        Scanner input = new Scanner(System.in);

        // condition 1

        System.out.print("Distance (KM): ");
        distance = input.nextInt();
        if (distance <= 0 ) {
            System.out.println("You entered incorrect data.");
            System.exit(0);
        }

        System.out.print("Age: ");
        age = input.nextInt();
        if (age <= 0) {
            System.out.println("You entered incorrect data.");
            System.exit(0);
        }

        System.out.println("One-way or Round-trip? (1 / 2) ");
        ticketType = input.nextInt();
        if ( ticketType != 1 && ticketType != 2 ) {
            System.out.println("You entered incorrect data.");
            System.exit(0);
        }

        rawPrice = distance * 0.10;

        if ( age < 12) ageDiscount = rawPrice*0.5;
        else if ( age >= 12 && age < 24) ageDiscount= rawPrice*0.1;
        else if ( age >= 24 && age < 65) ageDiscount = rawPrice*0;
        else ageDiscount = rawPrice*0.3;

        totalDiscount = rawPrice - ageDiscount;

        if (ticketType == 2) {
            roundTripDiscount = totalDiscount * 0.2;
            totalPrice = (totalDiscount - roundTripDiscount) * 2;
        } else totalPrice = totalDiscount;

        System.out.println("Total Price: " + totalPrice);

    }
}
