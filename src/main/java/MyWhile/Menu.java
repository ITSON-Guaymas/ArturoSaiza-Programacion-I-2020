
package MyWhile;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
     
        String menu="";
        Scanner leer=  new Scanner(System.in);
        
        do{ 
            System.out.println("\n  \n ------------ MENU ----------");
            System.out.println("Opcion 1 \nOpcion2 \nOpcion3 \nSalir(Salir)");
            menu = leer.nextLine();
            
            System.out.println("MENU: "+menu);
            
        }while( !menu.equalsIgnoreCase("Salir") );
        
        System.out.println("Fin del sistema");
        
        
    }
    
}
