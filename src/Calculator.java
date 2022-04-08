import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;
        double a,b,result;

        System.out.print("Enter first number: ");
        a = input.nextDouble();

        System.out.print("Enter second number: ");
        b = input.nextDouble();

        System.out.println("1- Add(+) \n2- Subtract(-) \n3- Multiply(*) \n4- Divide(/)");
        System.out.print("Select operation number: ");
        choice = input.nextInt();

        switch (choice){
            case 1 :
                System.out.print("Addition Result: " + (a + b));
            break;

            case 2 :
                System.out.print("Subtraction Result: " + (a - b));
            break;

            case 3 :
                System.out.print("Multiplication Result: " + (a * b));
            break;

            case 4 :
                System.out.print("Division Result: " + (a / b));
            break;
        }
    }
}
