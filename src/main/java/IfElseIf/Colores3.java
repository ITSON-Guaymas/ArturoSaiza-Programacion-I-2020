package IfElseIf;

import java.util.Scanner;

public class Colores3 {
  
    public static void main(String[] args) {
    
        String color;        
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingresa un color");
        System.out.println("Rojo(r), Azul(a), Verde(v)");
       
        color = leer.next();
        
        if(color.equalsIgnoreCase("r")){
            System.out.println("Seleccionaste el color Rojo");
        }else if(color.equalsIgnoreCase("a")){
            System.out.println("Seleccioanste el color Azul");
        }else{
            System.out.println("Seleccionaste el color Verde");
        }
        
        
        
        
        
        
    }
    
}
