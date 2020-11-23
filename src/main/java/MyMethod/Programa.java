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
        
      //  ver_todos();
        registrar("Arturo","arturogsaiza@gmail.com","zapato",28);
        registrar("Juanito","juangsaiza@gmail.com","canica",18);
      
        int usuarioLogin = login("arturogsaiza@gmail.com","zapato");
        
        if(usuarioLogin == -1){
            System.out.println("Correo o contraseña incorrectos.");
        }else{
             System.out.println("Bienvenido "+nombres[usuarioLogin]);
             ver(usuarioLogin);
        }
        
    }
    
    public static void registrar(String nombre, String correo, String contrasena, int edad){
     for(int i=0; i<nombres.length; i++){
        if(nombres[i]==null){
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
    
    
    public static void editar(int i, String nombre, String correo, String contrasena, int edad){
            nombres[i]= nombre;
            correos[i]= correo;
            contrasenas[i]= contrasena;
            edades[i]= edad; 
    }
    
    
}
