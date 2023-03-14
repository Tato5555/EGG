
package EJERCICIOS;

import java.util.Scanner;

public class Ejercicio_01 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int numero;
        
        System.out.println("INGRESE UN NUMERO PARA VERIFICAR PARIDAD ");
        numero=leer.nextInt();
        
        if (numero%2==0){
            System.out.println("EL NUMERO "+numero+" ES PAR.");
        }else{
             System.out.println("EL NUMERO "+numero+" ES IMPAR.");
        }
        
        
        
    }
    
}
