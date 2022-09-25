import java.util.Scanner;
public class PoweredNum {
    public static void main(String[] args) {

        int maxValue;
        double value;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter max value: ");
        maxValue = input.nextInt();

        System.out.println("Exponent of 4");
        for (int i = 1; i <= maxValue; i*=4){
            System.out.println(i);
        }
        System.out.println("\nExponent of 5");
        for (int i = 1; i <= maxValue; i*=5){
            System.out.println(i);
        }
    }
}
