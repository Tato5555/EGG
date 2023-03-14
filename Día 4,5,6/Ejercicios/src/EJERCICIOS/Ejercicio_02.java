package EJERCICIOS;

import java.util.Scanner;

public class Ejercicio_02 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String palabra,clave;
        
        clave = "eureka";
        
        System.out.println("INGRESE LA PALABRA CLAVE.");
        palabra=leer.nextLine();
        
        if (palabra.equals(clave)){
            System.out.println("LA PALABRA ES CORRECTA");
        }else{
            System.out.println("LA PALABRA ES INCORRECTA");
        }
    }
    
}
