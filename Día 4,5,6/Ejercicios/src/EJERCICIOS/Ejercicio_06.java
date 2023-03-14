package EJERCICIOS;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length;
import java.util.Scanner;

public class Ejercicio_06 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String palabra;
        int correctas=0,incorrectas=0;
        
        do {
         System.out.println("INGRESE UNA PALABRA QUE CORRESPONDA AL FUNCIONAMIENTO DEL RS232.");
         palabra=leer.nextLine();
         palabra=palabra.toUpperCase();
         int aux=palabra.length();
         
         if (palabra.equals("&&&&&")){
            System.out.println("========================================================");   
            System.out.println("LA CANTIDAD DE PALABRAS CORRECTAS FUERON: "+ correctas);   
            System.out.println("LA CANTIDAD DE PALABRAS INCORRECTAS FUERON: " + incorrectas);
            System.exit(0);
            
         }else if (palabra.length()!=5){
             
             System.out.println("SU PALABRA NO CUMPLE CON LA CANTIDAD DE CARACTERES NECESARIOS");
             incorrectas= incorrectas+1;
             System.out.println("========================================================");  
         }else if((palabra.substring(0,1)).equals("X") && palabra.substring(aux-1,aux).equals("O") ){
         correctas=correctas+1;
         System.out.println("========================================================");  
         }else{
         incorrectas= incorrectas+1;
         System.out.println("========================================================");  
         }
         
        }while(!palabra.equals("&&&&&"));
        
        System.out.println("LA CANTIDAD DE PALABRAS CORRECTAS FUERON: "+ correctas);   
        System.out.println("LA CANTIDAD DE PALABRAS INCORRECTAS FUERON: " + incorrectas); 
    }
    
}
