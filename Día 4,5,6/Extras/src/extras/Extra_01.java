package extras;

import java.util.Scanner;

public class Extra_01 {
    
    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);
        
        float horas,dias,minutos;
        
        System.out.println("INGRESAR UNA CANTIDAD DE MINUTOS.");
        minutos=leer.nextInt();
        
        horas=(minutos/60);
        dias=(horas/24);
        
        System.out.println("HORAS: "+horas);
        System.out.println("DÍA: "+dias);
    }
    
}
