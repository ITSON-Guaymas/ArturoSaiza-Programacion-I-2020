
package MyMethod;

import java.util.Scanner;

public class Manzanas {
    
    public static int ManzanasAlmacen = 0;
  
    public static void main(String[] args) {
        int menu =0;
        Scanner leer = new Scanner(System.in);
        
        do{ System.out.println("\n -------------- MENU ---------------");
            System.out.println("Agregar Manzanas (1)   Ver inventario (2) Retirar(3)   Salir (0)");
            menu = leer.nextInt(); leer.nextLine();
            int cantidad =0;
            switch(menu){
                case 1:
                    System.out.println("Cuantas manzanas recolectaste?");
                     cantidad = leer.nextInt(); leer.nextLine();
                     almacenarManzanas(cantidad);
                    break;
                case 2: InventarioManzanas(); break;
                case 3: 
                    System.out.println("Cjuantas manzanas quieres retirar?");
                     cantidad = leer.nextInt();  leer.nextLine();
                    retirarManzanas(cantidad);
                    break;
                case 0: System.out.println("Saliendo;"); break;
            }
            
        }while(menu!=0);
    }
    
    public static void almacenarManzanas(int CantidadManzanas){
    ManzanasAlmacen = ManzanasAlmacen + CantidadManzanas;
    //ManzanasAlmacen += CantidadManzanas;
    }
    
    public static void retirarManzanas(int CantidadARetirar){
        if( CantidadARetirar <= ManzanasAlmacen  ){
            ManzanasAlmacen = ManzanasAlmacen - CantidadARetirar;  
         // ManzanasAlmacen-= CantidadARetirar;
        }else{
            System.out.println("Excede la candiad de manzanas que hay en el innventario.");
        }
    }     
    
    public static void InventarioManzanas(){
        System.out.println("Hay "+ManzanasAlmacen+" Manzanas! ");
    }
    
    
    
    
}
