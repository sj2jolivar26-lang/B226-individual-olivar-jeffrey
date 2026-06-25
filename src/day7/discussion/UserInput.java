/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day7.discussion;

/**
 *
 * @author Audit
 */

import java.util.Scanner;


public class UserInput {
        public static void main(String[] args) {
        //Instantiation / Create object of Scanner
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = input.nextLine(); // String Input
        
        System.out.print("Enter age: ");
        int age = input.nextInt(); // Inter Input
        
        System.out.print("Enter salary:");
        double salary = input.nextDouble(); // double input
        
        //Output input in user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        
    }
}
