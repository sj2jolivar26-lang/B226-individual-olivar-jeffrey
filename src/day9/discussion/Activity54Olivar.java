/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day9.discussion;

/**
 *
 * @author Audit
 */
import java.util.Scanner;

public class Activity54Olivar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        long startNumber = input.nextLong();

        System.out.print("Enter the common difference: ");
        long commonDifference = input.nextLong();

        System.out.print("Enter the number of terms (N): ");
        int n = input.nextInt();

        long current = startNumber;
        long sum = 0;
        long product = 1;

        System.out.print("Sum: ");
        for (int i = 1; i <= n; i++) {
            sum += current;

            if (i < n) {
                System.out.print(current + " + ");
            } else {
                System.out.print(current);
            }

            current += commonDifference;
        }
        System.out.println(" = " + sum);

        current = startNumber;

        System.out.print("Product: ");
        for (int i = 1; i <= n; i++) {
            product *= current;

            if (i < n) {
                System.out.print(current + " * ");
            } else {
                System.out.print(current);
            }

            current += commonDifference;
        }
        System.out.println(" = " + product);

        input.close();
    }
}