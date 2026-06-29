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

public class Activity52Olivar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for N: ");
        int N = input.nextInt();

        int product = 1;

        for (int i = 1; i <= N; i++) {
            product = product * i;
            System.out.println("i = " + i + ", product = " + product);
        }

        System.out.println("Final Product: " + product);

        input.close();
    }
}