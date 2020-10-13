
package MasIf;

import java.util.Scanner;

public class Juego {

    public static void main(String[] args) {
       String juegoFavorito;
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Cual es Tu juego Favorito");
        System.out.println("Free Fire(F), Fornite(T),  Call of duty (C) ");
        juegoFavorito = leer.next();
        
        if(juegoFavorito.equals("F")){
            System.out.println("FREEFIRE, Eres un Manco");
        }else if(juegoFavorito.equals("T")){
            System.out.println("FORTNITE: Eres un niño Rata");
            System.out.println("vete a hacer escaleras");
        }else if(juegoFavorito.equals("C")){
            System.out.println(" CALL OF DUTY: Eres un IDOL");
            System.out.println("Y un CRACK");
        }else{
            System.out.println("Ese juego no es una opcion");
        }
         
        
    
    }
    
}
