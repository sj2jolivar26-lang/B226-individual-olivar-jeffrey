/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day10.discussion;

/**
 *
 * @author Audit
 */

import java.util.Scanner;
public class Activity61Olivar {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter the multiplication table you want to display: ");
        int number = input.nextInt();

        // Display the multiplication table
        System.out.println("\nMultiplication Table of " + number);
        System.out.println("--------------------------");

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        input.close();
    }
    
}
