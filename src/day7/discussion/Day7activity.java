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
public class Day7activity {
    public static void main(String[] args) {
        
        
        float temp = 38.5f;
               
        String tempResult;

        if (temp > 38.5f) {
            tempResult = "Fever";
        } else if (temp < 38.5f){
            tempResult = "Normal Temp";
        } else {
             tempResult = "Healthy";
                }        
        
        
        System.out.println(tempResult);
        
        
        
    }
            
       
}
