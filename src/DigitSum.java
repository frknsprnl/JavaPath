import java.util.Scanner;
public class DigitSum {
    public static void main(String[] args) {

        int a, numberOfDigits = 0, x = 0, sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value: ");
        a = input.nextInt();

        while(a != 0){
            x = a%10;
            a = a/10;
            sum += x;
            System.out.println("Number: " + a +"\tLast digit: " + x);
        }
        System.out.println("Total: " + sum);
    }
}
