/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyMethod;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class Programa {
    
    public static String [] correos = new String[10];
    public static String [] nombres = new String[10];
    public static String [] contrasenas = new String[10];
    public static int [] edades  = new int[10];
    public static Scanner leer = new Scanner(System.in);
    

   
    public static void main(String[] args) {
        
        System.out.println("Facebook");
        
        int menu = 0;
        
        do{
            System.out.println("Login (1), Registrar(2), Salir(0)");  
            menu = leer.nextInt(); leer.nextLine();
            String correo, contrasena, nombre;
            int edad;
            switch(menu){
                case 0: System.out.println("Saliendo...! "); break;
                case 1: 
                    System.out.println("---------- Login -------");
                    System.out.println("Correo: ");
                      correo = leer.nextLine();
                     System.out.println("Contraseña: ");
                      contrasena = leer.nextLine();
                    int usuarioLogin = login(correo, contrasena);
                    
                    if(usuarioLogin== -1){
                        System.out.println("Usuario o contraseña incorrectas.");
                    }else{
                        SeccionConSessionIniciada(usuarioLogin);
                    }
                    
                    break;
                    case 2: 
                        System.out.println("Registro de usuario");   
                         System.out.println("Nombre:");   
                           nombre = leer.nextLine();
                         System.out.println("correo:");
                           correo = leer.nextLine();
                         System.out.println("Contraseña:");
                           contrasena = leer.nextLine();
                         System.out.println("Edad:");
                           edad = leer.nextInt(); leer.nextLine();
                         registrar(nombre, correo, contrasena, edad);
                    break;
            }
            
        }while(menu!=0);
        
        
        
      /*  registrar("Arturo","arturogsaiza@gmail.com","zapato",28);
        registrar("Juanito","juangsaiza@gmail.com","canica",18);
        registrar("Axel","axel@gmail.com","minecraft",18);
     
   
       int usuario_login = login("axel@gmail.com","minecraft");
        
       System.out.println(usuario_login);
       
       if(usuario_login == -1){
           System.out.println("El usuario o la contraseña son incorrectos");
       }else{
           System.out.println("Bienvenido "+nombres[usuario_login]); 
           ver(usuario_login);
           
       } 
        */
        
 
    }
   
    public static void SeccionConSessionIniciada(int posicionUsuario){
    
        System.out.println("Bienvenido "+nombres[posicionUsuario]);
    
        int menuSessionIniciada=0;
        
        do{
            System.out.println("Perfil (1), Editar(2), Salir(0)");
            menuSessionIniciada = leer.nextInt(); leer.nextLine();
            
            switch(menuSessionIniciada){
                case 0: System.out.println("Cerrando Sesion"); break;
                case 1: ver(posicionUsuario); break;
                case 2: 
                      System.out.println("Editar perfil");
                    String correo, contrasena, nombre;
                   int edad; 
                    System.out.println("correo:");
                    correo = leer.nextLine();
                    System.out.println("Contraseña:");
                    contrasena = leer.nextLine();
                    System.out.println("Edad:");
                    edad = leer.nextInt(); leer.nextLine();
                    editar(posicionUsuario,nombres[posicionUsuario],correo, contrasena, edad);
                  
                break;
            }
            
        }while(menuSessionIniciada!=0);
        
    
    }
    
    
    public static void registrar(String nombre, String correo, String contrasena, int edad){
     for(int i=0; i<nombres.length; i++){
         if(nombres[i] == null){
            nombres[i]=nombre;
            correos[i]=correo;
            contrasenas[i]= contrasena;
            edades[i]=edad;
           break;
          } 
     }
    }
    
    public static int login(String correo, String contrasena){
        int usuario_encontrado= -1;
       
        for(int i=0; i<nombres.length; i++){
         
            if(nombres[i]!= null){
                if(correos[i].equalsIgnoreCase(correo)
                   && contrasenas[i].equals(contrasena)){
                   usuario_encontrado = i; 
                }
            }
        }
        
        return  usuario_encontrado;
    }
    
    public static void ver(int i){
            System.out.println(" ------ #"+i+" ------");
            System.out.println(nombres[i]);
            System.out.println(correos[i]);
            System.out.println(contrasenas[i]);
            System.out.println(edades[i]);
    }    
    public static void ver_todos(){
          for(int i=0; i<nombres.length; i++){
                System.out.println(" ------ #"+i+" ------");
                System.out.println(nombres[i]);
                System.out.println(correos[i]);
                System.out.println(contrasenas[i]);
                System.out.println(edades[i]);
          }
    }
    
    //CRUD
    
    public static void editar(int i, String nombre, String correo, String contrasena, int edad){
            nombres[i]= nombre;
            correos[i]= correo;
            contrasenas[i]= contrasena;
            edades[i]= edad; 
    }
    
    public static void eliminar(int i){
            nombres[i]= null;
            correos[i]= null;
            contrasenas[i]= null;
            edades[i]= 0; 
    }
    
    
}
