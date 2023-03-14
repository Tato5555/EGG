package EJERCICIOS;

import java.util.Scanner;

public class Ejercicio_05 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        float num1,num2;
        int opc;
        String respuesta;
        
        System.out.println("INGRESE 2 NUMEROS ENTEROS POSITIVOS.");
        num1=leer.nextInt();
        num2=leer.nextInt();
        
        do{
            System.out.println("1. SUMA");
            System.out.println("2. RESTA");
            System.out.println("3. MULTIPLICACION");
            System.out.println("4. DIVISION");
            System.out.println("5. SALIR");
            opc=leer.nextInt();
            
            
            switch(opc){
                case 1:
                    System.out.println("EL RESULTADO ES: "+(num1+num2));
                    break;
                case 2:
                    System.out.println("EL RESULTADO ES: "+(num1-num2));
                    break;
                case 3:   
                    System.out.println("EL RESULTADO ES: "+(num1*num2));
                    break;
                case 4:
                    System.out.println("EL RESULTADO ES: "+(num1/num2));
                    break;
                case 5:
                    System.out.println("ESTA SEGURO DE SALIR? (S/N)");
                    respuesta=leer.next();
                    
                    respuesta=respuesta.toUpperCase();
                    
                    if (respuesta.equals("N")) {
                        opc=0;
                    } else {
                        System.exit(0);
                    }
            }
        }while (opc <6);
    }
    
}
