
package MyArray;

import java.util.Scanner;

public class Fruta {

    public static void main(String[] args) {
       
        String [] frutas = new String[3];
        double [] precios = new double[3];
        Scanner leer = new Scanner(System.in);
        
    /*    frutas[0]="manzana";
        frutas[1]="pera";
        frutas[2]= "mango";
        frutas[3] = "ciruela";
       */ 
   
        for(int i=0; i<frutas.length; i++){
            System.out.println("Ingresa el nombre de la fruta "+(i+1));
            frutas[i] = leer.nextLine();
            System.out.println("Ingresa el precio de "+frutas[i]);
           precios[i]= leer.nextDouble();  leer.nextLine();
        }
        
        
       /* System.out.println("La segunda fruta que ingreste, es "+frutas[0]+" y su preci es: $"+precios[0]);
        System.out.println("La segunda fruta que ingreste, es "+frutas[1]+" y su preci es: $"+precios[1]);
         System.out.println("La segunda fruta que ingreste, es "+frutas[2]+" y su preci es: $"+precios[2]);
        */
       
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("----------Fruta "+(i+1)+" --------------");
            System.out.println("Fruta: "+frutas[i]); 
            System.out.println("Precio: "+precios[i]); 
        }
        
        
        
        
        
        
    }
    
}
