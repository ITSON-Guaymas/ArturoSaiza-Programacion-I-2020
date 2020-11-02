
package MyArray;

public class Amigos {

    public static void main(String[] args) {
     String [] amigos =  {"Axel","Carlos","Daniel","Fabian","Jesus"}; 
     
       /* System.out.println( amigos[0] );
        System.out.println( amigos[1] );
        System.out.println( amigos[2] );
        System.out.println( amigos[3] );
        System.out.println( amigos[4] );*/
       
       for(int a=0; a < amigos.length; a++){
       System.out.println(a+" - "+amigos[a] );
       }
        System.out.println("fin de for");
        
        
        amigos[4]="Jesus Alberto";
        //amigos[5]="Jesus Antonio"; no se puede por que el arreglo mide 5
        
     
       for(int a=0; a < amigos.length; a++){
       System.out.println(a+" - "+amigos[a] );
       }
        System.out.println("fin de for");
        
        
    }
    
}
