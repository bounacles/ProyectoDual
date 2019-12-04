/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author parubia
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       Scanner sc = new Scanner(System.in);
       
       int pis = sc.nextInt();
       
       String filt="";
       
       for(int p = 1; p <= pis ; p++)
       {
            String fil = "";
            
            for(int s = 0; s < (pis - p); s++)
            {
                fil += " ";
            }
            
            for(int j = 0; j < (2*p - 1); j++)
            {
                fil += "*";
            }
            
            if(p==1)
            {
                filt=fil;
            }
            
            System.out.println(fil);
       }
       
       System.out.println(filt);
       System.out.println(filt);
       
       
        
    
    }
    
}
