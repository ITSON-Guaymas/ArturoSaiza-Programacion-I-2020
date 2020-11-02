
package IFLogico;

import java.util.Scanner;


public class IfLogico {


    public static void main(String[] args) {
        
      String j1;
      String j2;
      Scanner leer = new Scanner(System.in);
      
        System.out.println("Juega a priedra, papel o tijera");
        
        System.out.println("Jugador 1:");
        j1 = leer.next();
        
        System.out.println("Judador 2:");
        j2 = leer.next();
        
        
        if( j1.equalsIgnoreCase("Piedra") &&  j2.equalsIgnoreCase("Piedra") ){
            System.out.println("Es un Empate");
            
        }else if(j1.equals("Piedra")  && j2.equalsIgnoreCase("Papel")){            
            System.out.println("Gana jugador 2");
        
        }else if(j1.equalsIgnoreCase("Piedra") && j2.equalsIgnoreCase("Tijeras")){
            System.out.println("Gana jugador 1");
        }
        
        if( j1.equalsIgnoreCase("Papel") &&  j2.equalsIgnoreCase("Piedra") ){
            System.out.println("Gana Jugador 1");
            
        }else if(j1.equals("Papel")  && j2.equalsIgnoreCase("Papel")){            
            System.out.println("Es un empate");
        
        }else if(j1.equalsIgnoreCase("Papel") && j2.equalsIgnoreCase("Tijeras")){
            System.out.println("Gana Jugador 2");
        }
        
        if( j1.equalsIgnoreCase("Tijeras") &&  j2.equalsIgnoreCase("Piedra") ){
            System.out.println("Gana Jugador 2");
            
        }else if(j1.equals("Tijeras")  && j2.equalsIgnoreCase("Papel")){            
            System.out.println("Gana Jugador 1");
        
        }else if(j1.equalsIgnoreCase("Tijeras") && j2.equalsIgnoreCase("Tijeras")){
            System.out.println("Es un empate");
        }
        
        
        
        
      
        
      
        
        
        
    }
    
}
