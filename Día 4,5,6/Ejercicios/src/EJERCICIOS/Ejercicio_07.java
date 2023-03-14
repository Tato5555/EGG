package EJERCICIOS;

import java.util.Scanner;

public class Ejercicio_07 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("INGRESE UN NUMERO.");
        int num = leer.nextInt();
        
        for (int i=0;i<=num-1;i++){
            
            for (int j=0;j<=num-1;j++){
                
                if (i>0 && i<num-1 && j>0 && j<num-1){
                System.out.print(" ");
                }else{
                System.out.print("*");
                }
            }
           System.out.println("");
        }
        
    }
    
}
