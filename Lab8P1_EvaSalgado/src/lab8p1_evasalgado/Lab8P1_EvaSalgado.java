
package lab8p1_evasalgado;

import java.util.Scanner;
import java.util.Random; 

public class Lab8P1_EvaSalgado {
    static Scanner leer = new Scanner(System.in); 
    static Random rand = new Random();

    public static void main(String[] args) {
       
       char resp = 's';
       do{ 
        int opcion = menu(); 
         switch (opcion){ 
             case 1: 
               XArray diagonal = new XArray(); 
               diagonal.opcion1();
               
               break; 
             case 2: 
                 Duplicados doubles = new Duplicados();
                 doubles.opcion2();
                 
                 break; 
             case 3: 
                 OMatriz oracion = new OMatriz();
                 oracion.opcion3();
                 break; 
             case 4:
                 resp = 'n'; 
                 break;
         }  
         System.out.println("Desea ingresar otra opción?");
         resp = leer.next().charAt(0);
       }while ( resp == 's'||resp=='S'&&resp!='n');
       
    }
    
   public static int menu(){
       int opcion = 0;
       System.out.println("1. X array\n2. sin duplicados \n3. Oración a matriz \n\nIngrese una opción: ");
       opcion = leer.nextInt(); 
       
       return opcion; 
   } 
}
