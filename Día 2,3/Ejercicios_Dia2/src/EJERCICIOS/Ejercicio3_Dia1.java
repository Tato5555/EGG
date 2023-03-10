package EJERCICIOS;

import java.util.Scanner;

public class Ejercicio3_Dia1 {
   
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        System.out.println("INGRESE UNA FRASE: ");
        String frase = leer.nextLine();
        
        System.out.println("EN MINUSCULA: " + frase.toLowerCase());
        System.out.println("EN MAYUSCULA: " + frase.toUpperCase());
        
        
         
    }
}
