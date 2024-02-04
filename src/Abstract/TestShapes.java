package Abstract;

import java.util.Scanner;

public class TestShapes {
    public static void main(String[] args) {
        System.out.println("Calculating the area of the circle and square!! ");

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the radius of the circle :");
        double num = obj.nextDouble();

        System.out.println("Enter the one side of the square :");
        double num2 = obj.nextDouble();

        Circle obj2 = new Circle(num);
        System.out.printf("Area of the circle is %5.2f " , obj2.calculateArea());


        System.out.println();

        Square obj3 = new Square(num2);
        System.out.printf("Area of the square is %5.2f " , obj3.calculateArea());
    }
}
