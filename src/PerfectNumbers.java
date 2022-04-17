import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {

        int number, sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Perfect Number Calculator");
        System.out.print("Enter number: ");
        number = input.nextInt();

        for (int i = 1; i < number; i++){

            if(number%i == 0){
                sum += i;

            }
        }
        if (number == sum){
            System.out.println(number + " is a perfect number.");
        } else{
            System.out.println(number + " isn't a perfect number.");
        }
    }
}
