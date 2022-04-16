import java.util.Scanner;
public class HarmonicSeries {
    public static void main(String[] args) {

        int n;
        double result = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter N value: ");
        n = input.nextInt();

        for(int i = 1; i <= n; i++){
            result += (1.0/i);
        }
        System.out.println("Harmonic series: " + result);
    }
}
