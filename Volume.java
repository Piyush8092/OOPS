import java.util.Scanner;

public class Q2 {

    // Method to calculate Q2 of a cube
    public double calculateQ2(double side) {
        return Math.pow(side, 3);  // Q2 of cube = side^3
    }

    // Method to calculate Q2 of a cylinder
    public double calculateQ2(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;  // Q2 of cylinder = π * radius^2 * height
    }

    public static void main(String[] args) {
        // Create Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        Q2 Q2Calculator = new Q2();

        // Calculate Q2 of a cube
        System.out.print("Enter the side length of the cube: ");
        double side = scanner.nextDouble();
        double cubeQ2 = Q2Calculator.calculateQ2(side);
        System.out.println("Q2 of the cube: " + cubeQ2);

        // Calculate Q2 of a cylinder
        System.out.print("\nEnter the radius of the cylinder: ");
        double radius = scanner.nextDouble();
        
        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();
        double cylinderQ2 = Q2Calculator.calculateQ2(radius, height);
        System.out.println("Q2 of the cylinder: " + cylinderQ2);

        // Close the scanner
        scanner.close();
    }
}
