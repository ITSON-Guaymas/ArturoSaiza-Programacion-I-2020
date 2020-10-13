
package leer;

import java.util.Scanner;

public class Alumno {
    
   public static void main( String [] args){
        
        String curp, nombre, ciudad, carrera, id, semestre, correo;
        int edad;  
        boolean tieneCarro, inscrito;
        double deuda;
        Scanner leer = new Scanner(System.in);
        
       
        
        System.out.println("HOLA, BIENVENIDO A ITSON");
        System.out.println("llena la siguiente informacion:");
        System.out.println("Nombre:"); 
        nombre = leer.nextLine();
        System.out.println("CURP:");
        curp = leer.nextLine();
        System.out.println("Ciudad:");
        ciudad = leer.nextLine();
        System.out.println("Carrera:");
        carrera = leer.nextLine();
        System.out.println("ID:");
        id =leer.nextLine();
        System.out.println("Semestre:");
        semestre = leer.nextLine();
        System.out.println("Correo");
        correo = leer.nextLine();
        System.out.println("Edad");
        edad = leer.nextInt();
        System.out.println("Tiene Carro?");
        tieneCarro = leer.nextBoolean();
        System.out.println("Esta inscrito?");
        inscrito = leer.nextBoolean();
        System.out.println("deuda");
        deuda = leer.nextDouble();
        
        System.out.println("-------------------------------------");
        System.out.println("Mi nombre es " + nombre); 
        System.out.println("Tengo " + edad +" años"); 
        System.out.println("Estudio "+carrera); 
        System.out.println("Mi ID es el "+id);
        System.out.println("Y mi correo es el "+correo);
        System.out.println("Y mi deuda es de $"+deuda+" pesos");
        
        System.out.println(tieneCarro);
        
        //Si () Entonces ..... SiNo ..... Fin Si.
        if(tieneCarro){
            System.out.println("Tengo un Bocho");
        //................
        }else{
         //.......   
          System.out.println("No tengo carro, pero quiero uno");
        }
        
        if(inscrito){
            System.out.println("Estoy inscrito");
        }
        
        
        
       
       
   }
    
}
