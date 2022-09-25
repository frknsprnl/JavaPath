import java.util.Scanner;

public class PrimeFunc {

    static boolean isPrime(int a){

        if (a <= 1){
            return false;
        }
        else if (a <= 2){
            return true;
        }
        else if (a % 2 == 0){
            return false;
        }
        for (int i= 3; i <= Math.sqrt(a); i += 2){
            if (a % i == 0 ){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int number;
        Scanner input = new Scanner(System.in);

        System.out.println("Is ... a prime number? ");
        number = input.nextInt();

        if (isPrime(number) == true){
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " isn't a prime number.");
        }

    }
}
