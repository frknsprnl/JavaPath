import java.util.Scanner;
public class CircleArea
{
   public static void main(String[] args) {

      double pi = 3.14, area, perimeter, r, sliceArea, a; // a is center angle of the circle.
      Scanner input = new Scanner(System.in);

      System.out.print("Circle radius: ");
      r = input.nextDouble();

      area = pi*r*r;
      System.out.println("Area: " + area );

      perimeter = 2*pi*r;
      System.out.println("Perimeter: " + String.format("%.2f",perimeter));

      System.out.print("Center angle of the circle: ");
      a = input.nextDouble();

      sliceArea = (pi*(r*r)*a)/360;
      System.out.println("Area of slice: " + sliceArea);

   }
}
