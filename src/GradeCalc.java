import java.util.Scanner;
public class GradeCalc {
    public static void main(String[] args) {
        int math,physics,chemistry,turkish,history,music;
        double mean;
        String success = "Congratulations! You passed. :)";
        String fail = "Sorry, you failed. :(";
        Scanner scan = new Scanner(System.in);

        System.out.print("Math grade: ");
        math = scan.nextInt();

        System.out.print("Physics grade: ");
        physics = scan.nextInt();

        System.out.print("Chemistry grade: ");
        chemistry = scan.nextInt();

        System.out.print("Turkish grade: ");
        turkish = scan.nextInt();

        System.out.print("History grade: ");
        history = scan.nextInt();

        System.out.print("Music grade: ");
        music = scan.nextInt();

        mean = (math+physics+chemistry+turkish+history+music)/6;
        System.out.println("Your average is: " + mean);

        while (mean >= 60) {
            System.out.print(success);
            break;
        }
        while(mean < 60) {
            System.out.print(fail);
            break;
        }

    }
}
