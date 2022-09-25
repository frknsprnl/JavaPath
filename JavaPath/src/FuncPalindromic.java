import java.util.Scanner;

public class FuncPalindromic {

    static boolean isPalindrome(String str){
        int i = 0, j = str.length()-1;
        while ( i < j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {

        String word;
        Scanner inp = new Scanner(System.in);

        System.out.println("== Palindromik kelime ogrenme uygulamasi == ");
        System.out.print("Kelimeyi giriniz: ");
        word = inp.nextLine();

        if (isPalindrome(word)){
            System.out.println("Kelime palindromiktir.");
        } else {
            System.out.println("Kelime palindromik degildir.");
        }

    }
}
