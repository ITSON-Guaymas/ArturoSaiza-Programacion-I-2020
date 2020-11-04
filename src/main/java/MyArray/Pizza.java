
package MyArray;

import java.util.Scanner;

public class Pizza {

   
    public static void main(String[] args) {
     int cantidadPizzas=0;
     String nombre;
     String telefono;
     String tipoOrden="";
     String direccion="";
     double precioADomicilio=0.0;
     double total=0.0;
     Scanner leer = new Scanner(System.in); 
     
    System.out.println("------------Pizeria EL PEPE --------------");
    System.out.println("Cual es tu nombre?");
    nombre = leer.nextLine();
    System.out.println("Cual es tu telefono?");
    telefono = leer.next();        
    System.out.println("Cuantas pizzas vas a querer?");
    cantidadPizzas = leer.nextInt(); leer.nextLine(); 
    
    String [] pizzas = new String[cantidadPizzas];
    Double [] precioPizzas = new Double[cantidadPizzas];
    String [] tipoPan = new String[cantidadPizzas];
    Double [] precioTipoPan = new Double[cantidadPizzas];
    String [] quesoExtra = new String[cantidadPizzas];
    Double [] precioQuesoExtra = new Double[cantidadPizzas];
    
    for(int i=0; i<cantidadPizzas; i++){
        System.out.println("------- PIZZA "+(i+1)+" --------");
        System.out.println("Seleccion el tipo de pizza"); 
        System.out.println("Mexicana(1), Hawaina (2), 3 Carnes(3)");
        int pizzaSeleccionada = leer.nextInt(); leer.nextLine(); 
        
        switch(pizzaSeleccionada){
            case 1:
                pizzas[i]=" Mexicana ( jalapeños, tocino, chorizo y frijoles)";
                precioPizzas[i]=150.00;
                break;
            case 2: 
                pizzas[i]="  Hawaina ( Piña, tocino,y Jamon)";
                precioPizzas[i]=145.00;
                break;
            case 3:
                pizzas[i]=" 3 Carnes ( carne molida, peperoni, tocino, champiño ";
                precioPizzas[i]=135.00;
                break;
        }
        
            // seleccionar el tipo de pan
            System.out.println("Que tipo de pan quieres?");
            System.out.println("normal(1), delgada(2), rellena de queso (3)");
            int panselect = leer.nextInt(); leer.nextLine(); 
    
            switch(panselect){
                case 1: 
                    tipoPan[i]=" Normal"; 
                    precioTipoPan[i]=0.0; 
                    break;
                case 2: 
                    tipoPan[i]=" delgada"; 
                    precioTipoPan[i]=15.50; 
                    break;
                case 3:  
                    tipoPan[i]="  rellena de queso"; 
                    precioTipoPan[i]=23.0; 
                    break;
            }
            
            System.out.println("Quieres queso extra?  (Si) (No)");
            String quesoExtraSelect= leer.next();      
            if(quesoExtraSelect.equalsIgnoreCase("si")){
                quesoExtra[i]="Si";
                precioQuesoExtra[i]=15.00;
            }else{
                quesoExtra[i]="No";
                precioQuesoExtra[i]=0.00;
            }
            
            
            
            
          
    }
    
    
        System.out.println("Tipo de Orden");
        System.out.println("Para llevar (1),Para comer aqui(2), A domicilio(3) ");
        int tipoOrdenSelected = leer.nextInt(); leer.nextLine();
        switch(tipoOrdenSelected){
            case 1:  tipoOrden="Para llevar "; break;
            case 2:  tipoOrden="Para comer aqui "; break;
            case 3:  
                tipoOrden="A domicilio";
                System.out.println("Cual es tu direccion?");
                direccion= leer.nextLine();
                precioADomicilio=35.00;
            break;
        
        }
        
        ///////////////TIKEEEET
        
        System.out.println("\n \n------------Pizeria EL PEPE --------------");
        System.out.println(" -------------------- TIKET --------------------");
        System.out.println("Cliente: "+nombre); 
        System.out.println("Telefono: "+telefono); 
        System.out.println("Tipo de Orden: "+tipoOrden); 
        if(tipoOrden.equalsIgnoreCase("A domicilio")){
         System.out.println("Direccion de Entrega: "+direccion); 
        }
        System.out.println("Cantidad de pizzas: "+cantidadPizzas);
        System.out.println("- . - . - . - . - . - . - . - . - . - . - . - ");
        for(int i=0; i<cantidadPizzas; i++){
         System.out.println(" --------- Pizza "+(i+1)+" ----------");
         System.out.println( pizzas[i]+"- - - - - "+precioPizzas[i]);
         System.out.println( "Tipo de pan: "+tipoPan[i]+"- - - - - "+precioTipoPan[i]);
         System.out.println("Queso extra: "+quesoExtra[i]+"- - - - - "+precioQuesoExtra[i]);
         Double totalPizzaActual= precioPizzas[i]+precioTipoPan[i]+precioQuesoExtra[i];
         System.out.println("----------------------------- total: "+totalPizzaActual);
         total+=totalPizzaActual;
        }
        System.out.println("Cargo a domicilio: "+precioADomicilio);
        total+=precioADomicilio;
        System.out.println("TOTAL GENERAL: $"+total);
        System.out.println("GRACIAS POR SU COMPRA (= \n  \n ");
        
        
    } //FIN MAIN
    
} // FIN CLASE
