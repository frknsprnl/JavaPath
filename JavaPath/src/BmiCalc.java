import java.util.Scanner;
public class BmiCalc {
    public static void main(String[] args) {

        double height, weight, bmi;
        Scanner input = new Scanner(System.in);

        System.out.print("Your height (m): ");
        height = input.nextDouble();

        System.out.print("Your weight (kg): ");
        weight = input.nextDouble();

        bmi = weight / (height*height);
        System.out.print("Your BMI: " + String.format("%.2f", bmi));
    }
}
