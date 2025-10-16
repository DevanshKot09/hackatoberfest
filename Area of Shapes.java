import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a shape to find the area:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.println("4. Square");

        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        double area = 0;

        switch (choice) {
            case 1: // Circle
                System.out.print("Enter radius: ");
                double radius = sc.nextDouble();
                area = Math.PI * radius * radius;
                System.out.println("Area of Circle = " + area);
                break;

            case 2: // Rectangle
                System.out.print("Enter length: ");
                double length = sc.nextDouble();
                System.out.print("Enter width: ");
                double width = sc.nextDouble();
                area = length * width;
                System.out.println("Area of Rectangle = " + area);
                break;

            case 3: // Triangle
                System.out.print("Enter base: ");
                double base = sc.nextDouble();
                System.out.print("Enter height: ");
                double height = sc.nextDouble();
                area = 0.5 * base * height;
                System.out.println("Area of Triangle = " + area);
                break;

            case 4: // Square
                System.out.print("Enter side: ");
                double side = sc.nextDouble();
                area = side * side;
                System.out.println("Area of Square = " + area);
                break;

            default:
                System.out.println("Invalid choice! Please enter 1-4.");
        }

        sc.close();
    }
}
