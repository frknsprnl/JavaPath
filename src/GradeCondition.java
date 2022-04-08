import java.util.Scanner;
public class GradeCondition {
    public static void main(String[] args) {

        int math, physics, turkish, chem, music, mean = 0, divideTo = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Math Grade (0-100): ");
        math = input.nextInt();

        System.out.print("Physics Grade (0-100): ");
        physics = input.nextInt();

        System.out.print("Turkish Grade (0-100): ");
        turkish = input.nextInt();

        System.out.print("Chemistry Grade (0-100): ");
        chem = input.nextInt();

        System.out.print("Music Grade (0-100): ");
        music = input.nextInt();

        if (math > 0 && math <= 100) {
            mean += math;
            divideTo++;
        }
        if (physics > 0 && physics <= 100){
            mean += physics;
            divideTo++;
        }
        if(turkish > 0 && turkish <= 100){
            mean += turkish;
            divideTo++;
        }
        if(chem > 0 && chem <= 100){
            mean += chem;
            divideTo++;
        }
        if (music > 0 && music <= 100){
            mean += music;
            divideTo++;
        }

        mean = mean / divideTo;
        if(mean <= 55) {
            System.out.println("Sorry, you've failed.");

        }
        else {
            System.out.println("Congratulations, you've passed!");

        }
        System.out.print("Your average is " + mean);
    }
}
