/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Audit
 */
import java.util.Scanner;

public class Activity5Olivar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for N: ");
        int N = input.nextInt();

        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum = sum + i;
            System.out.println("i = " + i + ", sum = " + sum);
        }

        System.out.println("Final Sum: " + sum);

        input.close();
    }
}