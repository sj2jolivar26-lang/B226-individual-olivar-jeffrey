/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day6.discussion;

/**
 *
 * @author Audit
 */
public class Activity3_Olivar {
    public static void main(String[] args) {
        

        // 2. Logical AND Operator
        int age = 20;
        boolean hasValidID = true;

        if (age >= 18 && hasValidID) {
            System.out.println("Access Granted");
        } else {
            System.out.println("Not allowed to enter the event.");
        }

        // 3. Logical OR Operator
        boolean isWeekend = true;
        boolean isHoliday = false;

        if (isWeekend || isHoliday) {
            System.out.println("No classes today.");
        } else {
            System.out.println("There are classes today.");
        }

        // 4. Ternary Operator - Passed or Failed
        int score = 85;
        String result = (score >= 75) ? "Passed" : "Failed";

        System.out.println(result);

        // 5. Ternary Operator - Larger Number
        int num1 = 10;
        int num2 = 25;

        int larger = (num1 > num2) ? num1 : num2;

        System.out.println("The larger number is: " + larger);
        
    }
}
