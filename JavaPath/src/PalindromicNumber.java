import java.util.Scanner;

public class PalindromicNumber {

    static boolean isPalindrome(int number) {
        int temp = number, reverseNumber = 0, mod;

        while (temp != 0) {
            mod = temp % 10;
            reverseNumber = (reverseNumber * 10) + mod;
            temp /= 10;
        }
        return number == reverseNumber;
    }

    public static void main(String args[]) {

        int x;
        Scanner input = new Scanner(System.in);

        System.out.println("Is ... palindromic number? ");
        x = input.nextInt();

        if (isPalindrome(x) == true) {
            System.out.println(x + " is a palindromic number.");
        } else {
            System.out.println(x + " isn't a palindromic number.");
        }
    }
}
