import java.util.Arrays;

public class ArrayFrequency {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int counter = 0;

        Arrays.sort(list);
        System.out.println("Dizi: " + Arrays.toString(list));

        System.out.println("Tekrar sayilari ");
        for (int i = 0 ; i < list.length; i++) {
            for (int j = 0 ; j < list.length ; j++){
                if (list[i] == list[j]){
                    counter = 1;
                }
            }
            System.out.println( list[i] + " sayisi " + counter + " kere tekrar edildi.");
        }
    }
}
