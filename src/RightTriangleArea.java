import java.util.Scanner;
public class RightTriangleArea {
    public static void main(String[] args) {

        int a,b;
        double c,u,area;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter A side length for triangle: ");
        a = input.nextInt();

        System.out.print("Enter B side length for triangle: ");
        b = input.nextInt();

        c = Math.sqrt((a * a) + (b * b));
        System.out.println("Hypotenuse length: " + c);

        u = (a+b+c)/2;
        System.out.println("Perimeter of triangle: " + 2*u);

        area = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Area of triangle: " + area);

    }
}
