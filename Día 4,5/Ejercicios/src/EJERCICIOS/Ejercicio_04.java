package EJERCICIOS;

import java.util.Scanner;

public class Ejercicio_04 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num,sumador,limite;
        
        System.out.println("INGRESE UN LIMITE");
        limite=leer.nextInt();
       
        System.out.println("INGRESE UN NUMERO");
        sumador=leer.nextInt();
        
        if(limite>sumador){
         do{
            System.out.println("INGRESE OTRO NUMERO");
            sumador = sumador + leer.nextInt();
            System.out.println("EL RESULTADO DE LA SUMATORIA DE LOS NUMEROS FUÉ DE: "+ sumador +" SE PASÓ POR: "+(sumador-limite));
        }while (sumador <= limite);
        }else{
            System.out.println("EL LIMITE ES MENOR QUE EL PRIMER NUMERO INGRESADO ");
            System.out.println("LIMITE: "+limite+", PRIMER NUMERO: "+sumador+". SE PASÓ POR: "+(sumador-limite));
        }
        
    }  
    
}
