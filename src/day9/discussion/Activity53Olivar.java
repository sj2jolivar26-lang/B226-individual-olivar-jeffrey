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

public class Activity53Olivar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int startNumber = input.nextInt();

        System.out.print("Enter the common difference: ");
        int commonDifference = input.nextInt();

        System.out.print("Enter the number of terms (N): ");
        int n = input.nextInt();

        int current = startNumber;
        int sum = 0;

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

        input.close();
    }
}