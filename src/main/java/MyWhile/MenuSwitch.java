package MyWhile;

import java.util.Scanner;

public class MenuSwitch {
 
    public static void main(String[] args) {
    
    String menu="";
    Scanner leer= new Scanner(System.in);
    
    do{
        System.out.println("\n\n--------MENU ----------");
        System.out.println("sumar(s), restar(r), mutiplicar(m) salir(x)");
        menu = leer.nextLine(); 
        
        switch(menu){
            case "s": System.out.println("SUMANDO"); break;
            case "r": System.out.println("RESTANDO"); break;
            case "x": System.out.println("SALIENDO..."); break;
            case "m": System.out.println("Multiplicando..."); break;
            default:  System.out.println("La opcion elegida no existe"); break;
        } 
                
    }while(!menu.equalsIgnoreCase("x"));
    
        System.out.println("Fin del sistema"); 
         
    }
    
}
