
package MyMethod;

import java.util.Scanner;

public class Manzanas {
    
    public static int ManzanasAlmacen = 0;
  
    public static void main(String[] args) {
        int menu =0;
        Scanner leer = new Scanner(System.in);
        
        do{ System.out.println("\n -----------------------------");
            System.out.println("Agregar Manzanas (1) \n Ver inventario (2) \n Salir (0)");
            menu = leer.nextInt(); leer.nextLine();
            
            switch(menu){
                case 1:
                    System.out.println("Cuantas manzanas recolectaste?");
                     int cantidad = leer.nextInt(); leer.nextLine();
                     almacenarManzanas(cantidad);
                    break;
                case 2: InventarioManzanas(); break;
                case 0: System.out.println("Saliendo;"); break;
            }
            
        }while(menu!=0);
    }
    
    public static void almacenarManzanas(int CantidadManzanas){
    ManzanasAlmacen = ManzanasAlmacen + CantidadManzanas;
    //ManzanasAlmacen += CantidadManzanas;
    }
    
    public static void InventarioManzanas(){
        System.out.println("Hay "+ManzanasAlmacen+" Manzanas! ");
    }
    
    
    
    
}
