 
package MyFor;
 
public class MyArrayFor {
      public static void main(String[] args){ 
              String [] cars = {"bocho", "BMW", "AVEO", "FORD", "Mazda", "JETTA", "Hot Wheels", "TESLA"};
              
            for(int c=0; c<=4; c++){
                System.out.println(cars[c]);
            }
            
            System.out.println("for con length");
            for(int c=0; c<=cars.length-1; c++){
                System.out.println(cars[c]);
            }
            
          }
}
