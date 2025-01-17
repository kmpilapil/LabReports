// King Mike B. Pilapil
// BSECE - 1
// Lab Activity: Array Implementation and For Loop Practice Problem 3
// 1/17/2025
package Stable;

import java.util.Scanner;

/**
 * Program to take 5 floating-point numbers from the user and print them in reverse order.
 * The program handles invalid input by prompting the user to enter a valid floating-point number.
 */
public class Pilapil_KingMike_LabArrayActivity_Problem3 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Declare an array of double data type to hold 5 floating-point numbers
        double[] arr = new double[5];

        // Prompt the user to enter 5 floating-point numbers
        System.out.println("Enter 5 floating-point numbers:");

        // Loop to collect the 5 floating-point numbers from the user
        for (int i = 0; i < arr.length; i++) {
            // Keep prompting the user until valid input is entered
            while (true) {
                try {
                    // Read the floating-point input and assign it to the array
                    arr[i] = Double.parseDouble(sc.nextLine());
                    break;  // Break the loop if the input is valid
                } catch (NumberFormatException e) {
                    // Catch invalid input (non-floating point values) and prompt the user again
                    System.out.println("Invalid input. Please enter a valid floating-point number.");
                }
            }
        }

        // Display the array elements in reverse order
        System.out.println("Array in reverse order:");

        // Loop to print the array elements in reverse order
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");  // Print each element of the array from the last to the first
        }
    }
}
//Enter 5 floating-point numbers:
//3.5
//4.6
//5.7
//6.2
//7.1
//Array in reverse order:
//7.1 6.2 5.7 4.6 3.5