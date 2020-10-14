package MySwitch;

import java.util.Scanner;

public class Juego {

    public static void main(String[] args) {
       String juegoFavorito;
       Scanner leer= new Scanner(System.in);
        System.out.println("Cual es tu juego favorito?");
        System.out.println("Free Fire(F), Fornite(T),  Call of duty (C) ");
        
        juegoFavorito = leer.next();
        
        switch(juegoFavorito){
            case "F": System.out.println("Eres un Manco");
                System.out.println("Cual es tu usuario?");
                String usuario= leer.next();
                System.out.println(usuario+" esta chilo!");
                break;
            case "T": System.out.println("Eres un Niño Rata!");  break;
            case "C": System.out.println("Eres un CRACK!");  break;
            default: System.out.println("No se que juego es ese!");
        }
        
    }
    
}
