import java.util.Scanner;
import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {

        int size;
        Scanner input = new Scanner(System.in);

        System.out.print("Dizi boyutu: ");
        size = input.nextInt();
        int[] arr = new int[size];

        System.out.println("Dizi elemanlarini giriniz ");

        for (int i = 0; i < arr.length; i++){

            System.out.print(i+1 + ". elemani giriniz: ");
            arr[i] = input.nextInt();

        }
        Arrays.sort(arr);

        System.out.println("Siralama: " + Arrays.toString(arr));
    }
}
