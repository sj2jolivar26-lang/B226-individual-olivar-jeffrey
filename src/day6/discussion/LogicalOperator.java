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
public class LogicalOperator {
    public static void main(String[] args) {
                // Cinema Logic
        
        boolean hasTicket = true;
        boolean hasVaccinationCard = true;
        boolean isSeniorCitizen = true;
        boolean isStudent = true;
        boolean isLoggedIn = true;
        
        // (&&)May ticket -> pwde =kang pumasoksa sinehan
       System.out.println("Allowed to enter cinema: " + (hasTicket && hasVaccinationCard));
        // (||)May ticker (student || senior citizen) -> discounted
        System.out.println("Eligible for discount: " + (isStudent || isSeniorCitizen));
        // NOT (!) Hindi naka logged in sa app
         System.out.println("Cannot reserve seat: " + !isLoggedIn);
        
        
        // Logical &&
//        int num = 100;
//        int num2 =200;
//                
//        
//        boolean result = num < num2 && num > num2;
//        
        //Logical And
        /*  &&          Result
            T   T       T
            T   F       F
            F   T       F
            F   F       F
        */
        
        //Logical OR
        /* ||           Result
            T   T       T
            T   F       T
            F   T       T
            F   F       F
        */
        
        
    }
}
