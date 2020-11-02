
package MySwitch;

import java.util.Scanner;


public class Semana {


    public static void main(String[] args) {
      
       int dia;
       Scanner leer =  new Scanner(System.in);
       
        System.out.println(" ----- DIA DE LA SEMANA -------");
        System.out.println("Escribe un numero del 1 al 7");
        dia = leer.nextInt();
        
        switch(dia){
            case 1: System.out.println("LUNES"); break;
            case 2: System.out.println("MARTES");  break;
            case 3: System.out.println("MIERCOLES");  break;
            case 4: System.out.println("jUEVES");  break;
            case 5: System.out.println("VIERNES");  break;
            case 6: System.out.println("SABADO");  break;
            case 7: System.out.println("DOMINGO");  break;
            default: System.out.println("Ese dia no existe");
        
        }
        
        
        
        
    }
    
}
