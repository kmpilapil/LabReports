import java.util.Scanner;

public class Pilapil_KingMike_Lab3 {

    // Function to calculate the area of a Circle
    public static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    // Function to calculate the area of a Rectangle
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    // Function to calculate the area of a Triangle
    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    // Function to calculate the volume of a Sphere
    public static double calculateSphereVolume(double radius) {
        // Ensure the radius is positive
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive.");
        }

        // Calculate the volume of the sphere
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // Function to calculate the volume of a Cylinder
    public static double calculateCylinderVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    // Function to calculate the third side of a triangle using the Law of Cosines
    public static double calculateTriangleSide(double a, double b, double angleC) {
        // Given SSA inputs, the triangle will be invalid if sides are non-positive or/and  the angle is not between 0-180 degrees or it produces a degenerate triangle
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Sides must be positive.");
        }
        if (angleC <= 0 || angleC >= 180) {
            throw new IllegalArgumentException("Angle must be between 0 and 180 degrees.");
        }
        // Convert the angle from degrees to radians
        double angleCRadians = Math.toRadians(angleC);

        // Calculate the third side using the Law of Cosines
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(angleCRadians));
    }

    // Function to calculate the area of a Circle Segment
    public static double calculateCircleSegmentArea(double radius, double angle) {
        // Ensure that the radius and angle are non-negative
        if (radius < 0 || angle < 0 || angle > 360) {
            throw new IllegalArgumentException("Radius must be non-negative and angle must be between 0 and 360 degrees.");
        }

        // Convert the angle from degrees to radians
        double angleRadians = Math.toRadians(angle);

        // Calculate the area of the circle segment
        return (Math.pow(radius, 2) / 2) * (angleRadians - Math.sin(angleRadians));
    }

// Function to calculate the surface area of a Sphere
    public static double calculateSphereSurfaceArea(double radius) {
        // Ensure the radius is positive
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive.");
        }

        // Calculate the surface area of the sphere
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for area calculations
        System.out.println("Enter radius for Circle Area:");
        double radius = scanner.nextDouble();
        System.out.println("Circle Area: " + calculateCircleArea(radius));

        System.out.println("Enter length and width for Rectangle Area:");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        System.out.println("Rectangle Area: " + calculateRectangleArea(length, width));

        System.out.println("Enter base and height for Triangle Area:");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        System.out.println("Triangle Area: " + calculateTriangleArea(base, height));

        // Get user input for volume calculations
        System.out.println("Enter radius for Sphere Volume:");
        radius = scanner.nextDouble();
        System.out.println("Sphere Volume: " + calculateSphereVolume(radius));

        System.out.println("Enter radius and height for Cylinder Volume:");
        double cylinderRadius = scanner.nextDouble();
        double cylinderHeight = scanner.nextDouble();
        System.out.println("Cylinder Volume: " + calculateCylinderVolume(cylinderRadius, cylinderHeight));

        // Get user input for triangle side calculation
        System.out.println("Enter two sides (a, b) and the angle (C in degrees) for Triangle Side calculation:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double angleC = scanner.nextDouble();
        System.out.println("Third side of the triangle: " + calculateTriangleSide(a, b, angleC));

        // Get user input for circle segment area calculation
        System.out.println("Enter radius and central angle (in degrees) for Circle Segment Area:");
        double segmentRadius = scanner.nextDouble();
        double angle = scanner.nextDouble();
        System.out.println("Circle Segment Area: " + calculateCircleSegmentArea(segmentRadius, angle));

        // Get user input for sphere surface area calculation
        System.out.println("Enter radius for Sphere Surface Area:");
        double sphereRadius = scanner.nextDouble();
        System.out.println("Sphere Surface Area: " + calculateSphereSurfaceArea(sphereRadius));
        // Get user input for sphere volume calculation
        System.out.println("Enter radius for Sphere Volume:");
        radius = scanner.nextDouble();
        System.out.println("Sphere Volume: " + calculateSphereVolume(radius));
        scanner.close();
    }
}
