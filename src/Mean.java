import java.util.Scanner;
public class Mean {
    public static void main(String[] args) {

        int number = 0, maxValue, counter = 0;
        double mean;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter max value: ");
        maxValue = input.nextInt();
        /* Average of numbers divisible by 3 and 4 between zero and entered maxValue */
        for (int i = 0; i < maxValue; i++){
            if(i%12 == 0 && i != 0){
                number += i;
                counter++;
            }
        }
        mean = number / counter;
        System.out.println("Average is " + mean);
    }
}
