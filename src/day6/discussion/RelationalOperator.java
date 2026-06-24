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
public class RelationalOperator {
    public static void main(String[] args) {
        // Logical &&
        int num = 100;
        int num2 =200;
                
        
        boolean result = num < num2 && num > num2;
        
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
