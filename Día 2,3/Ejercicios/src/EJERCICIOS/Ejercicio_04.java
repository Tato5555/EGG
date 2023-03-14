package EJERCICIOS;

import java.util.Scanner;

public class Ejercicio_04 {
   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("INGRESE LA CANTIDAD DE GRADOS CENTIGRADOS");
        int centigrados = leer.nextInt();
        
        float fahrenheits = 32 + (centigrados*9/5);
        
        System.out.println("LA CANTIDA DE GRADOS FAHRENHEIT ES DE: " + fahrenheits);
        
    }
}