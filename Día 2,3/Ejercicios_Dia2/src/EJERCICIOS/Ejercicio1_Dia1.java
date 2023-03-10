package EJERCICIOS;

import java.util.Scanner;

public class Ejercicio1_Dia1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("INGRESE DOS NUMEROS PARA LA SUMA");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        System.out.println("LA SUMA DE LOS NUEMROS ES: " + (num1+num2));
     
    }
    
}
