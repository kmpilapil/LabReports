//King Mike B. Pilapil
//BSECE - 1
//Lab Activity: Array Implementation and For Loop Practice Problem 2
//1/17/2025
package Stable;

import java.util.Scanner;

public class Pilapil_KingMike_LabArrayActivity_Problem2 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Declare an array of integers to hold 15 numbers
        int[] arr = new int[15];
        
        // Initialize max and min variables to store the maximum and minimum elements
        // Integer.MIN_VALUE and Integer.MAX_VALUE ensure that any input will be either greater than min or less than max initially
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Prompt the user to enter 15 integers
        System.out.println("Enter 15 integers:");

        // Loop to fill the array with integers
        for (int i = 0; i < arr.length; i++) {
            // Keep prompting until valid input is entered
            while (true) {
                try {
                    // Read the integer input and assign it to the array
                    arr[i] = Integer.parseInt(sc.nextLine());
                    
                    // Update the max value if the current element is greater than the current max
                    if (arr[i] > max) {
                        max = arr[i];
                    }

                    // Update the min value if the current element is smaller than the current min
                    if (arr[i] < min) {
                        min = arr[i];
                    }

                    // Break out of the loop once valid input is processed
                    break;
                } catch (NumberFormatException e) {
                    // Catch invalid input and prompt the user to try again
                    System.out.println("Invalid input. Please enter an integer.");
                }
            }
        }

        // Display the maximum and minimum values found in the array
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}
//Enter 15 integers:
//0.1
//Invalid input. Please enter an integer.
//1
//2
//3
//4
//5
//100
//101
//102
//1000
//10000
//999
//9
//99
//7
//6
//Maximum element: 10000
//Minimum element: 1
