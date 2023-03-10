package EJERCICIOS;

import java.util.Scanner;

public class Ejercicio5_Dia1 {
   
    public static void main(String[] args) {
        double numero;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("INGRESE UN NUMERO: ");
        numero = leer.nextDouble();
        
        System.out.println("EL DOBLE DEL NUMERO ES: " +(numero*2));
        System.out.println("EL TRIPLE DEL NUMERO ES: " + (numero*3) );
        System.out.println("LA RAIZ CUADRADA DEL NUMERO ES: " + Math.pow(numero,(double)1/2));
        
        /*
        TAMBIEN SE PUEDE USAR:
          
        System.out.println("LA RAIZ CUADRADA DEL NUMERO ES: " + Math.sqrt(numero));
       
        */

      
    }
}
