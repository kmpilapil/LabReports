package Pilapil_KingMike_Lab4;

// Student Name: King Mike B. Pilapil
// Course: Bachelor of Science in Computer Engineering
// Date of Submission: [Insert Date]
// Purpose: This file defines the Circle class with attributes, constructors, and methods for mathematical calculations of a circle.

public class Circle {
    // Attribute
    private double radius;

    // Default Constructor
    public Circle() {
        this.radius = 1.0; // Default radius
    }

    // Parameterized Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    // Method to calculate circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to calculate diameter
    public double getDiameter() {
        return 2 * radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
