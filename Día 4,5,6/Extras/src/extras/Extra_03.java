/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras;

import java.util.Scanner;

public class Extra_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String letra;
        
        System.out.println("INGRESE UNA LETRA.");
        letra=leer.nextLine();
        letra=letra.toUpperCase();
        
        if (letra.equals("A")||letra.equals("E")||letra.equals("I")||letra.equals("O")||letra.equals("U")){
            System.out.println("ES UNA VOCAL");            
        }else{
            System.out.println("NO ES UNA VOCAL");
        }
        
        //SE PUEDE HACER CON EL COMANDO CharAt() PERO EL EJERCICIO "RECOMIENDA" USAR LA FUNCION EQUALS(), POR ESO DEFINÍ COMO CADENA
    }
    
}
