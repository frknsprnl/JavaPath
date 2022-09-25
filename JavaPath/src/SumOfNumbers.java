import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[] args) {

        int number, sum = 0;
        boolean isEven = true;
        Scanner input = new Scanner(System.in);

        while (isEven) {
            System.out.print("Enter an even number: ");
            number = input.nextInt();
            if( number%2 == 0 ){
                if (number%4 == 0){
                    sum += number;
                }
            }else {
                isEven = false;
            }
        }

        System.out.println("Sum of numbers that are even and divisible by 4: " + sum);
    }

}
