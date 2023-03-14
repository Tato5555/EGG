package EJERCICIOS;

import java.util.Scanner;

public class Ejercicio_03 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String palabra;
        
        System.out.println("INGRESE UNA PALABRA DE 8 LETRAS.");
        palabra=leer.nextLine();
        
        if (palabra.length()== 8){
            System.out.println("LA PALABRA ES CORRECTA");
        }else{
            System.out.println("LA PALABRA NO TIENE LA CANTIDAD DE CARACTERES PERMITIDOS");
        }
    }
    
}
