
package MyMethod;

import java.util.Scanner;

public class Login {

  
    public static void main(String[] args) {
      
        String usuario, contrasena;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el usuario y contraseña!!!");
        System.out.println("Usuario: ");
        usuario = leer.next();
        System.out.println("Contraseña: ");
        contrasena = leer.next();
        if( iniciarSesion(usuario, contrasena ) ){
            System.out.println("Hola "+usuario+" Bienvenido al sistema!");
        }else{
            System.out.println("Usuario o contraseña incorrectos!");
        }
        
        
        
    }
    
    public static boolean iniciarSesion(String usuario, String contrasena){
    
        if(usuario.equalsIgnoreCase("fabian2000") 
           &&  contrasena.equals("Canica1") ){
           return true; 
        }else{
           return false;
            
        }
        
    }
    
}
