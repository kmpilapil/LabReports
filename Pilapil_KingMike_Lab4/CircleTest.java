package Pilapil_KingMike_Lab4;

// Student Name: King Mike B. Pilapil
// Course: Bachelor of Science in Computer Engineering
// Date of Submission: [Insert Date]
// Purpose: This file defines the main method to create and test Circle objects by prompting the user for input and displaying results.

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for radius
        System.out.print("Enter the radius of the circle: ");
        double userRadius = scanner.nextDouble();

        // Create Circle object with user-provided radius
        Circle myCircle = new Circle(userRadius);

        // Display results
        System.out.println("Radius: " + myCircle.getRadius());
        System.out.println("Area: " + myCircle.getArea());
        System.out.println("Circumference: " + myCircle.getCircumference());
        System.out.println("Diameter: " + myCircle.getDiameter());

        // Modify the radius
        System.out.print("Enter a new radius to change the circle's size: ");
        double newRadius = scanner.nextDouble();
        myCircle.setRadius(newRadius);

        // Display new results
        System.out.println("Updated Radius: " + myCircle.getRadius());
        System.out.println("Updated Area: " + myCircle.getArea());
        System.out.println("Updated Circumference: " + myCircle.getCircumference());
        System.out.println("Updated Diameter: " + myCircle.getDiameter());

        // Calculate area and circumference for a set of radii
        double[] radii = {1.0, 2.5, 4.0, 7.5};
        System.out.println("\nResults for predefined radii:");
        for (double radius : radii) {
            Circle circle = new Circle(radius);
            System.out.println("Radius: " + radius + " | Area: " + circle.getArea() + " | Circumference: " + circle.getCircumference());
        }

        scanner.close();
    }
}
