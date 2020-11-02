package MyFor;
 
import java.util.Scanner;

public class Pizza {
 
    public static void main(String[] args) {
     int cantidadPizzas=0;
     String nombre;
     String telefono;
     Scanner leer = new Scanner(System.in);
     
        System.out.println("------------Pizeria EL PEPE --------------");
        System.out.println("Cual es tu nombre?");
        nombre = leer.nextLine();
        System.out.println("Cual es tu telefono?");
        telefono = leer.next();        
        System.out.println("Cuantas pizzas vas a querer?");
        cantidadPizzas = leer.nextInt(); leer.nextLine(); 
       
        String TipoPizza="";
        double total=0.0;
        for(int NumPizza=0; NumPizza<cantidadPizzas; NumPizza++ ){
            System.out.println("------- PIZZA "+(NumPizza+1)+" --------");
        
            System.out.println("Seleccion el tipo de pizza"); 
            System.out.println("Mexicana(1), Hawaina (2), 3 Carnes(3)");
            int pizzaSeleccionada = leer.nextInt(); leer.nextLine(); 
            
            // Aqui se selecciona el tipo de pizza
            switch(pizzaSeleccionada){
                case 1: TipoPizza+=(NumPizza+1)+": Mexicana ( jalapeños, tocino, chorizo y frijoles) ----- $140.00 \n";
                        total+=140; break;
                case 2: TipoPizza+=(NumPizza+1)+": Hawaina ( Piña, tocino,y Jamon) ----- $135.00 \n"; 
                        total+=135; break;
                case 3:TipoPizza+=(NumPizza+1)+": 3 Carnes ( carne molida, peperoni, tocino, champiño  ----- $135.00 \n"; 
                        total+=135; break;
            }
            
            // seleccionar el tipo de pan
            System.out.println("Que tipo de pan quieres?");
            System.out.println("normal(1), delgada(2), rellena de queso (3)");
            int tipoPan = leer.nextInt(); leer.nextLine(); 
            switch(tipoPan){
                case 1: TipoPizza+="Pan: Normal--- $0.0  \n";  break;
                case 2: TipoPizza+="Pan: Delgado  --- $10.00   \n"; total+=10;  break;
                case 3: TipoPizza+="Pan: Relleno de queso ---- $30.00 \n"; total+=30;   break;
            }
            
            // aqui se selecciona si quiere queso extra
            System.out.println("Quieres queso extra? $20.00 (Si) (No)");
            String quesoExtra= leer.next();
            if(quesoExtra.equalsIgnoreCase("Si")){
            TipoPizza+="Queso Extra: Si  -----  $20.00  \n";
            total+=20; 
            }else{
            TipoPizza+="Queso Extra: No \n";  
            }
            
            //aqui se selecciona si quiere refresco
            System.out.println("Que refresco quiere? $20 ");
            System.out.println("Coca(1), Manzanita(2),Nestea(3),Sin Refresco(0) ");
            int tipoRefreco = leer.nextInt(); leer.nextLine();
            switch(tipoRefreco){
                case 0: TipoPizza+="Sin refresco  \n";    break;
                case 1: TipoPizza+="Refresco: Coca-cola  --- $20 \n";  total+=20;  break;
                case 2: TipoPizza+="Refresco: Manzanita  --- $20 \n";  total+=20;  break;
                case 3: TipoPizza+="Refresco: Nestea  --- $20 \n";  total+=20; break;
            } 
            
            TipoPizza+="----------------------------- \n";
            
        }
        
        System.out.println("Tipo de Orden");
        System.out.println("Para llevar (1),Para comer aqui(2), A domicilio(3) ");
        int tipoOrden = leer.nextInt(); leer.nextLine();
        switch(tipoOrden){
            case 1: TipoPizza+="Tipo de Oden: Para llevar \n";  break;
            case 2: TipoPizza+="Tipo de Oden: Para comer aqui \n";  break;
            case 3:
                TipoPizza+="Tipo de Oden: A domicilio $35.00 \n";  
                System.out.println("Cual es tu direccion?");
                TipoPizza+="Domicilio: "+leer.nextLine()+"\n"; 
                total+=35; 
                break;
        }        
        
        System.out.println("\n \n------------Pizeria EL PEPE --------------");
        System.out.println(" -------------------- TIKET --------------------");
        System.out.println(TipoPizza);        
        System.out.println("TOTAL: $"+total);
               
    }   
    
}
