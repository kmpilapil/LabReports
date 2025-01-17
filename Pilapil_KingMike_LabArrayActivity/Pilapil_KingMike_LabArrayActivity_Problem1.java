//King Mike B. Pilapil
//BSECE - 1
//Lab Activity: Array Implementation and For Loop Practice Problem 1
//1/17/2025


package Stable;

import java.util.Scanner;

public class Pilapil_KingMike_LabArrayActivity_Problem1 {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Declare an array of integers to hold 10 numbers
        int[] arr = new int[10];
        
        // Variable to store the sum of the array elements
        int sum = 0;

        // Prompt the user to enter 10 integers
        System.out.println("Enter 10 integers:");

        // Loop to fill the array with integers
        for (int i = 0; i < arr.length; i++) {
            // Keep prompting until valid input is entered
            while (true) {
                try {
                    // Read the integer input and assign it to the array
                    arr[i] = Integer.parseInt(sc.nextLine());
                    
                    // Add the entered number to the sum
                    sum += arr[i];

                    // Break out of the loop once valid input is processed
                    break;
                } catch (NumberFormatException e) {
                    // Catch invalid input and prompt the user to try again
                    System.out.println("Invalid input. Please enter an integer.");
                }
            }
        }

        // Calculate the average of the array elements (sum divided by the number of elements)
        double average = sum / 10.0;

        // Display the sum and the average
        System.out.println("Sum of array: " + sum);
        System.out.println("Average of array: " + average);
    }
}
//Enter 10 integers:
//1
//2
//3
//4
//5
//9
//10
//11
//12
//13
//Sum of array: 70
//Average of array: 7.0