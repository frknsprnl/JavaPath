import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class NumberPrediction {
    public static void main(String[] args) {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(100);

        Scanner inp = new Scanner(System.in);
        int right = 5;
        int prediction;
        String again;
        int [] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println("=== Sayi tahmin etme oyunu ===");
        System.out.println(right + " hakka sahipsiniz. Baslayalim!");
        //System.out.println("Sayi: " + randomNumber);

        while (right > 0 && right <= 5){
            System.out.print("Tahmininizi giriniz: ");
            prediction = inp.nextInt();

            if (prediction == randomNumber){
                System.out.println("Tebrikler! Dogru sayiyi buldunuz.");
                System.out.println("Sayi: " + randomNumber + " idi.");
                break;
            }

            if (prediction != randomNumber){
                System.out.println("Yanlis tahmin!");
                right--;
                System.out.println("Kalan hakkiniz: " + right);
            }

            if (right == 0){
                System.out.println("Hakkiniz kalmadi. :(");
                System.out.println("Tekrar oynamak ister misiniz? yes / no");
                again = inp.next();
                if (again.equals("yes")){
                    System.out.println("=== Yeni oyun ===");
                    randomNumber = rnd.nextInt(100);
                    right = 5;
                } else {
                    System.out.println("Bizimle oynadiginiz icin tesekkurler, yine bekleriz.");
                    break;
                }
            }
        }

    }
}
