import java.util.Scanner;
public class VatAmountCalc {
    public static void main(String[] args) {

        double sum,vatPrice,netPrice, vat;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter amount: ");
        sum = scan.nextDouble();

        System.out.println("Original Cost: "+ sum);

        vat = (0 < sum && sum < 1000)? 0.18 : 0.08;
        System.out.println("VAT %: " + String.format("%.0f",vat*100));

        vatPrice = sum*vat;
        System.out.println("VAT Price: " + String.format("%.2f",vatPrice));

        netPrice = vatPrice + sum;
        System.out.println("Net Price: " + netPrice);
    }
}