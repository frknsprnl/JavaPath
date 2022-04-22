import java.util.Scanner;
import java.util.Arrays;

public class ArrayNearest {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int number, next = 0, previous = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Dizi: " + Arrays.toString(list));

        System.out.println("Hangi sayiya en yakin buyuk ve kucuk sayiyi ogrenmek istiyorsunuz? ");
        number = input.nextInt();

        boolean found = false;
        int searchedValue = number;

        for (int i : list) {
            if (i == searchedValue) {
                found = true;
                break;
            }
        }

        if (found) {
            Arrays.sort(list);
            System.out.println("Siralanmis dizi: " + Arrays.toString(list));
            for (int i = 0; i < list.length; i++) {
                if (list[i] == number) {
                    System.out.println("Sectiginiz sayi: " + number);
                    if (i + 1 < list.length) {
                        next = list[i + 1];
                    }
                    if (i - 1 < 0) {
                        System.out.println("Sayinin solunda sayi bulunmamaktadir.");
                        System.out.println("Girilen sayidan buyuk en yakin sayi: " + next);
                        break;
                    }
                    previous = list[i - 1];
                    if (i + 1 == list.length) {
                        System.out.println("Sayinin saginda sayi bulunmamaktadir.");
                        System.out.println("Girilen sayidan kucuk en yakin sayi: " + previous);
                        break;
                    }

                    System.out.println("Girilen sayidan kucuk en yakin sayi: " + previous);
                    System.out.println("Girilen sayidan buyuk en yakin sayi: " + next);
                    break;
                }
            }

        } else {
            System.out.println("Aradiginiz sayi dizide bulunmamaktadir.");
        }
    }
}
