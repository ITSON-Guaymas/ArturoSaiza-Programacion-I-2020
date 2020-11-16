
package MyMethod;

import java.util.Scanner;


public class Menu {

  
    
    public static void main(String[] args) {
       
        int menu = 0;
        do{
            
        Scanner leer = new Scanner(System.in);
        System.out.println("Menu : salir (0), saludar (1)");
         
        menu = leer.nextInt(); leer.nextLine();
        
        switch(menu){
            case 1: 
               int menuSaludar=0;
               do{
                System.out.println("A quien? Luigi(1), Axel(2), A nadie(0)"); 
                menuSaludar=leer.nextInt(); leer.nextLine();
                 switch(menuSaludar){
                     case 1: System.out.println("Hola Luigi (="); menuSaludar = 0; break;
                     case 2: System.out.println("Hola Axel (="); menuSaludar = 0; break;
                     case 0: System.out.println("Ok");  break;
                     default: System.out.println("No existe esa opcion");  break;
                 }
               } while( menuSaludar !=0 ) ;
            break;
            case 0: System.out.println("Salir"); break;
        }
        
        }while(menu !=0);
        
        
        
        
        
    }
    
}
