package MyMethod;

public class Main {

    public static void main(String[] args) {
        System.out.println("Este es el metodo main");  
        saludo("Arturo");
        saludo("Jesus");
        saludo("Rene");
        saludo("Jose");
        saludo("Ramon"); 
        saludo("Julio");
        System.out.println("fin del programa");
            
            
        
        
        
    }
    
    public static void saludo(String nombre) {
        System.out.println("Hola "+nombre);
        System.out.println("Espero que estes bien");
        System.out.println("--------------");
    }
    
}
