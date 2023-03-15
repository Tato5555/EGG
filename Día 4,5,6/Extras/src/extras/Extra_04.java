/*
 FUNCIONA SOLAMENTE PARA NUMEROS DESDE EL 1 HASTA EL 10
 */
package extras;

import java.util.Scanner;

public class Extra_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner leer = new Scanner(System.in);
        
        int num,contador=0;
        
        System.out.println("INGRESE UN NUMERO DESDE EL 1 AL 10.");
        num=leer.nextInt();
        
        if (num<=3){
        do{
            contador=contador+1;
            System.out.print("I");
        }while (contador<num);
            System.out.println("");
        }    
        
        contador=0;
        
        if (num==4){
            System.out.println("IV");
        }
        
        if (num==5){
            System.out.println("V");
        }
       
        if (num>5 && num<9){
            System.out.print("V");
        do{
            contador=contador+1;
            System.out.print("I");
        }while (contador<num-5);
            System.out.println("");
        } 
        
        if (num==9){
            System.out.println("IX");
        }
        
        if (num==10){
            System.out.println("X");
        }
    }
    
}
