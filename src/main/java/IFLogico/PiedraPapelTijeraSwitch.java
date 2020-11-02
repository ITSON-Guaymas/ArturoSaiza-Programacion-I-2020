
package IFLogico;

import java.util.Scanner;

public class PiedraPapelTijeraSwitch {


    public static void main(String[] args) {
              
      String j1;
      String j2;
      Scanner leer = new Scanner(System.in);
      
        System.out.println("Juega a priedra, papel o tijera");
        
        System.out.println("Jugador 1:");
        j1 = leer.next();
        
        System.out.println("Judador 2:");
        j2 = leer.next();
        
        switch(j1){
            case "Papel":  
                switch(j2){
                    case "Papel": System.out.println("Es un empate"); break;
                    case "Tijeras": System.out.println("Gana Jugador 2"); break;
                    case "Piedra": System.out.println("Gana Jugador 1"); break; 
                }              
                break;
                
            case "Tijeras":
                 switch(j2){
                     case "Papel": System.out.println("Jugador 1"); break;
                     case "Tijeras": System.out.println("Es un empate"); break;
                     case "Piedra": System.out.println("Gana jugador 2"); break;                 
                 }                
                break;
            case "Piedra": 
                 switch(j2){
                     case "Papel": System.out.println("Jugador 2"); break;
                     case "Tijeras": System.out.println("Gana Jugador 1"); break;
                     case "Piedra": System.out.println("Es un empate"); break;                 
                 }             
                
                break;     
        
        }
        
        
    }
    
}
