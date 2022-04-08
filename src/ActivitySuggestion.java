import java.util.Scanner;
public class ActivitySuggestion {
    public static void main(String[] args) {

        Float temp;
        Scanner input =  new Scanner(System.in);

        System.out.println("Temperature (°C): ");
        temp = input.nextFloat();

        if (temp < 5) System.out.print("Let's go skiing!");
        if (temp >= 5 && temp < 15) System.out.println("Let's go the cinema!");
        if (temp >= 15 && temp < 25) System.out.println("What about having a picnic?");
        if (temp >= 25) System.out.println("Maybe we should swim?");

    }
}
