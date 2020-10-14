
package MySwitch.TareaIf;

import java.util.Scanner;


public class PiedraPapelTijera {

  
    public static void main(String[] args) {
    String jugador1;
    String jugador2;
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Juega a  Piedra, PApel o Tijera");
    System.out.println("Jugador uno: ");
    jugador1= leer.next();
    System.out.println("Jugador dos: ");
    jugador2 = leer.next();
    
    if(jugador1.equalsIgnoreCase("Piedra")){
       
        if(jugador2.equalsIgnoreCase("Piedra")){
            System.out.println("Es un empate");
        }else if(jugador2.equalsIgnoreCase("Papel")){
            System.out.println("Jugador 2 Gana");
        }else if(jugador2.equalsIgnoreCase("Tijeras")){
            System.out.println("Jugador 1 Gana");
        }
        
    }else if(jugador1.equalsIgnoreCase("Papel")){
       
        if(jugador2.equalsIgnoreCase("Piedra")){
            System.out.println("Gana jugador 1");
        }else if(jugador2.equalsIgnoreCase("Papel")){
            System.out.println("Empate");
        }else if(jugador2.equalsIgnoreCase("Tijeras")){
            System.out.println("Gana jugador 2");
        }
        
    }else if(jugador1.equalsIgnoreCase("Tijeras")){
        
        if(jugador2.equalsIgnoreCase("Piedra")){
            System.out.println("Gana jugador 2");
        }else if(jugador2.equalsIgnoreCase("Papel")){
            System.out.println("Gana jugador 1");
        }else if(jugador2.equalsIgnoreCase("Tijeras")){
            System.out.println("Empate");
        }
        
    }
      
      
        
        
    }
    
}
