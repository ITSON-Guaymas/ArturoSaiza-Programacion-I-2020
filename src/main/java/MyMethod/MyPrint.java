package MyMethod;

public class MyPrint {
  
    public static void main(String[] args) {
        imprimirSL("Programa iniciado");
        imprimirSL("otra cosa");
       
        imprimir("1 ");
        imprimir("2 ");
        imprimirSL("3 ");
        imprimir("4 ");
        imprimir("5 ");
    }
        
    public static void imprimir(String texto){
       // String texto="imprimiendo este texto";
        System.out.print(texto);
    }
    
    public static void imprimirSL(String texto){
       // String texto="imprimiendo texto con salto de linea";
        System.out.println(texto);
    }
    
}
