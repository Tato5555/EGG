/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras;

import java.util.Scanner;
import java.lang.Math;

public class Extra_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        float num1,num2,resultado,intento;
       
      
        
        num1=Math.round(Math.random()*10);
        num2=Math.round(Math.random()*10);
        
        resultado=num1*num2;
        
        System.out.println(resultado);
        
        System.out.println("Ingrese el numero.");
        intento=leer.nextFloat();
       
        
        if (intento!=resultado){
            
            do{
                System.out.println("Ingrese otro numero.");
                intento=leer.nextFloat();
            }while (intento!=resultado);
            
                System.out.println("ADIVINASTE EL NUMERO!!");
        }else{
            System.out.println("ADIVINASTE EL NUMERO!!");
        }
        
        
              
    }
    
}
