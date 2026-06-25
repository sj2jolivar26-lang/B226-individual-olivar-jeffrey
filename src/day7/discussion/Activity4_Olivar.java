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

public class Activity4_Olivar {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Main Menu ===\n"
        + "1. Start Game\n"
        + "2. Load Game\n"
        + "3. Settings\n"
        + "4. Exit");
        
        System.out.print("Enter a number (1-4): ");
        int choice = input.nextInt();
        System.out.println();
        if (choice == 1) {
            System.out.println("You selected Option 1: Start Game");
        } else if (choice == 2) {
            System.out.println("You selected Option 2: Load Game");
        } else if (choice == 3) {
            System.out.println("You selected Option 3: Settings");
        } else if (choice == 4) {
            System.out.println("You selected Option 4: Exit");
        } else {
            System.out.println("Invalid choice. Please try again.");
        }

        input.close();
    }
}
        
