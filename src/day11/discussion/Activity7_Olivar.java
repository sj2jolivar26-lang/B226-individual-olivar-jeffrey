/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day11.discussion;

/**
 *
 * @author Audit
 */
package day11.discussion;

import java.util.Scanner;

public class Activity7_Olivar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declare a single-dimensional array of 5 integers
        int[] numbers = new int[5];

        int sum = 0;

        // Ask the user to input 5 numbers
        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }

        // Display all the numbers entered
        System.out.println("\nYou Entered:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }

        // Compute the average
        double average = (double) sum / numbers.length;

        // Find the highest and lowest numbers
        int highest = numbers[0];
        int lowest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > highest) {
                highest = numbers[i];
            }

            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
        }

        // Display the results
        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Highest Number = " + highest);
        System.out.println("Lowest Number = " + lowest);

        input.close();
    }
}
