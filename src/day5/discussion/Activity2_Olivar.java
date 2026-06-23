/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5.discussion;

/**
 *
 * @author Audit
 */
public class Activity2_Olivar {
    public static void main(String[] args) {
        
        double income = 50000;
        double foodAllowance = 15000;
        double transportation = 2500;
        double rent = 4500;
        double utilityBill = 3500;
        
        double foodPercent = (foodAllowance / income) * 100;
        double transportationPercent = (transportation / income) * 100;
        double rentPercent = (rent / income) * 100;
        double utilityPercent = (utilityBill / income) * 100;

        double totalExpenses = foodAllowance + transportation + rent + utilityBill;
        double remainingBalance = income - totalExpenses;

        System.out.println("Income: " + income);
        System.out.println();

        System.out.printf("Food Allowance: %.1f %%\n", foodPercent);
        System.out.printf("Transportation: %.1f %%\n", transportationPercent);
        System.out.printf("Rent: %.1f %%\n", rentPercent);
        System.out.printf("Utility Bill: %.1f %%\n", utilityPercent);

        System.out.println();
        System.out.printf("Total Expenses: %.2f\n", totalExpenses);
        System.out.printf("Remaining Balance: %.2f\n", remainingBalance);

    }
}
