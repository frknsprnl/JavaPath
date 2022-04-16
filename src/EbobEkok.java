import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {

        // Ebob = Highest Common Factor & Ekok = Least Common Multiple
        int hcf = 1, lcm = 1;
        int n1, n2;
        Scanner input = new Scanner(System.in);

        System.out.print("First number: ");
        n1 = input.nextInt();

        System.out.print("Second number: ");
        n2 = input.nextInt();

        int i = 1;
        while(i <= n1){
            if (n1 % i == 0 && n2 % i == 0) {
                hcf = i;
            }
            i++;
        }

        int j = 1;
        while(j <= (n1*n2)){
            j++;
            if (j % n1 == 0 && j % n2 == 0) {
                lcm = j;
                break;
            }
        }

        System.out.println("Highest Common Factor: " + hcf);
        System.out.println("Least Common Multiple: " + lcm);
    }
}
