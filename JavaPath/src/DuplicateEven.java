import java.util.Arrays;

public class DuplicateEven {

    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 2, 7, 8, 8, 3, 10, 10, 8, 6, 1, 6};

        System.out.print("Cift ve tekrar eden sayilar: ");
        for (int i = 0; i < list.length; i++){
            for( int j = i+1; j < list.length; j++){
                if ( list[i] == list[j] && list[i] % 2 == 0){
                    System.out.print(list[i] + " " + list[j] + " ");
                }
            }
        }
    }
}
