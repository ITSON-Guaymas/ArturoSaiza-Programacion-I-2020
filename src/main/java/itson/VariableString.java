package itson;

public class VariableString {

    public static void main(String[] args) {    
        // Declaracion de variable String (Cadena)
        String saludo;
        //String saludo; no se puede declarar dos veces una variable.
        saludo = "Hola"; //inicializar variable        
        String nombre = "Valentin"; // declarar e inicializar variable al mismo tiempo        
        String apellido1, apellido2  = "Delgado"; // declarando dos variables, e inicializando la segunda        
        apellido1= "Verduzco";
        apellido2 = "Delgado";         
         System.out.print(saludo);
         System.out.print(" ");
         System.out.print(nombre);
         System.out.print(" ");
         System.out.print(apellido1);
         System.out.print(" ");
         System.out.print(apellido2);
         System.out.println("------------------");         
         System.out.println(saludo+" "+nombre+" "+apellido1+" "+apellido2);         
         String espacio=" ";
         System.out.println(saludo+espacio+nombre+espacio+apellido1+espacio+apellido2);         
         ////////// Sustituir valor         
         String carro ="Bocho";
         System.out.println(carro);
         
         carro = "Ferrari";
         
         String carroAntes =  carro;
         
         carro = "Jetta";
         
          System.out.println("carro antes: "+carroAntes);
          System.out.println("carro: "+ carro);
          
         // carro= aveo; todos lso string van entre comillas dobles.
          
         //String ciudad = 5; no se puede guardar un valor numerico, en una variable de tipo String
         
      
         
         
    }
    
}
