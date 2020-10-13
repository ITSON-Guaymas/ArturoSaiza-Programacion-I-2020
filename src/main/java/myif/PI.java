/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myif;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class PI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double PI=3.1416;
       
       int numero2 =7;      
       
       Scanner leer = new Scanner(System.in);
       
       
        System.out.println("cual es el valor de PI");
        
        PI =leer.nextDouble();
        if (PI == 3.1416){
            System.out.println("Respuesta Correcta");
        }else{
             System.out.println("Respuesta Incorrecta");
        }
            
        }
    }
    
 
