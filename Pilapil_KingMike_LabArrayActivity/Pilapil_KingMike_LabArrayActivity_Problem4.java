// King Mike B. Pilapil
// BSECE - 1
// Lab Activity: Array Implementation and For Loop Practice Problem 4
// 1/17/2025
package Stable;

import java.util.Scanner;

/**
 * Program to count the frequency of a user-specified number in an array of 10 integers.
 * The array is populated with integers between 1 and 100, and the user is asked for a number 
 * to check how many times it appears in the array.
 */
public class Pilapil_KingMike_LabArrayActivity_Problem4 {
     public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Declare an array of integers to hold 10 numbers
        int[] arr = new int[10];

        // Prompt the user to enter 10 integers between 1 and 100
        System.out.println("Enter 10 integers between 1 and 100:");

        // Loop to collect 10 valid integers within the specified range (1-100)
        for (int i = 0; i < arr.length; i++) {
            // Keep prompting the user until valid input is entered
            while (true) {
                try {
                    // Read the integer input and assign it to the array
                    arr[i] = Integer.parseInt(sc.nextLine());
                    
                    // Check if the entered number is between 1 and 100
                    if (arr[i] < 1 || arr[i] > 100) {
                        System.out.println("Please enter a number between 1 and 100.");
                    } else {
                        // Break the loop if the input is valid
                        break;
                    }
                } catch (NumberFormatException e) {
                    // Catch invalid input and prompt the user again
                    System.out.println("Invalid input. Please enter an integer.");
                }
            }
        }

        // Prompt the user to enter the number they want to check for frequency
        System.out.println("Enter the number to check its frequency:");
        int numberToCheck = 0;

        // Keep prompting the user until valid input is entered
        while (true) {
            try {
                // Read the integer input for the number to check
                numberToCheck = Integer.parseInt(sc.nextLine());
                break;  // Break the loop once the input is valid
            } catch (NumberFormatException e) {
                // Catch invalid input and prompt the user again
                System.out.println("Invalid input. Please enter an integer.");
            }
        }

        // Initialize a counter variable to count the frequency of the specified number
        int count = 0;

        // Loop through the array to count how many times the specified number appears
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToCheck) {
                count++;  // Increment the counter if the number matches the current array element
            }
        }

        // Display the frequency count of the specified number in the array
        System.out.println("The number " + numberToCheck + " appears " + count + " times in the array.");
    }
}
