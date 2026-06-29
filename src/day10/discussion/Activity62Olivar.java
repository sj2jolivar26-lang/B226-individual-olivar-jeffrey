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
public class Activity62Olivar {
    public static void main(String[] args) {
           // Outer loop for each multiplication table
        for (int table = 1; table <= 10; table++) {

            System.out.println("Multiplication Table of " + table);
            System.out.println("----------------------------");

            // Inner loop for the multiples
            for (int i = 1; i <= 10; i++) {
                System.out.println(table + " x " + i + " = " + (table * i));
            }

            // Blank line between tables
            System.out.println();
    }
    
}
